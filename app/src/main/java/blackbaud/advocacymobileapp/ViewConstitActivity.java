package blackbaud.advocacymobileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class ViewConstitActivity extends AppCompatActivity {

    // List view
    private ListView lv;
    private DoorData myData;

    // false = show only my personal people I added
    // true  = show ALL of the people
    ArrayList<Constituent> constituents;
    private boolean allConstit;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText filterSearch;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_constit);

        final ViewConstitActivity self = this;

        allConstit = false;
        lv = (ListView) findViewById(R.id.listView);
        filterSearch = (EditText) findViewById(R.id.filterText);
        myData = DoorData.getInstance();
        constituents = myData.getConstituents();


        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myData.getConstituentStrings());
        if(lv!=null) lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3) {
                String item = (String)adapter.getItemAtPosition(position);
                String addressLineOne = null;
                String addressLineTwo = null;
                String street = null;
                String city = null;
                String state = null;
                String zipcode = null;
                for (Address a : myData.getAddressList()) {
                    if(a.toString() == item) {
                        myData.setCurrentAddress(a);
                        addressLineOne = a.get_street();
                        addressLineTwo = a.get_city() + " ," + a.get_state() + " " + a.get_zip();
                        street = a.get_street();
                        city = a.get_city();
                        state = a.get_state();
                        zipcode= a.get_zip();
                        break;
                    }
                }
                Intent intent = new Intent(self, AddressValActivity.class);
                intent.putExtra("addressLineOne", addressLineOne);
                intent.putExtra("addressLineTwo", addressLineTwo);
                intent.putExtra("street", street);
                intent.putExtra("city", city);
                intent.putExtra("state", state);
                intent.putExtra("zipcode", zipcode);
                startActivity(intent);
                self.finish();
            }
        });

    }

    public void finishActivity(View view) {
        finish();
    }

    public void onFilterButtonClicked(View view) {
        // Update List based off Filter
    }

    public void onSortButtonClicked(View view) {
        // Update List based off sort
    }
}
