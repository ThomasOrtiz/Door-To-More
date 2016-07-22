package blackbaud.advocacymobileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AddProspectActivity extends AppCompatActivity {
    ArrayList<Address> addressItems;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final AddProspectActivity self = this;
        // Comes with it, can't remove
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_prospect);

        DoorData data = DoorData.getInstance();
        addressItems = data.getAddressList();

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, data.getAddressStrings());

        ListView listView = (ListView) findViewById(R.id.listView);
        if(listView!=null) listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3) {
                String item = (String)adapter.getItemAtPosition(position);
                String addressLineOne = null;
                String addressLineTwo = null;
                for (Address a : addressItems) {
                    if(a.toString() == item) {
                        addressLineOne = a.get_street();
                        addressLineTwo = a.get_city() + ", " + a.get_state() + " " + a.get_zip();
                        break;
                    }
                }
                Intent intent = new Intent(self, AddressValActivity.class);
                intent.putExtra("addressLineOne", addressLineOne);
                intent.putExtra("addressLineTwo", addressLineTwo);
                startActivity(intent);
                self.finish();
            }
        });
    }

    public void back(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
