package blackbaud.advocacymobileapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AddProspectActivity extends AppCompatActivity {
    ArrayList<Address> addressItems;
    ArrayAdapter<String> adapter;
    private DoorData myData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final AddProspectActivity self = this;
        // Comes with it, can't remove
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_prospect);

        //font stuff
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Oswald-Regular.ttf");
        TextView x = (TextView) findViewById(R.id.textView);
        if (x!=null) x.setTypeface(tf);

        myData = DoorData.getInstance();
        addressItems = myData.getAddressList();

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, myData.getAddressStrings());

        ListView listView = (ListView) findViewById(R.id.listView);
        if(listView!=null) listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View v, int position, long arg3) {
                String item = (String)adapter.getItemAtPosition(position);
                String addressLineOne = null;
                String addressLineTwo = null;
                String street = null;
                String city = null;
                String state = null;
                String zipcode = null;
                String country = null;
                for (Address a : addressItems) {
                    if(a.toString() == item) {
                        myData.setCurrentAddress(a);
                        addressLineOne = a.get_street();
                        addressLineTwo = a.get_city() + " ," + a.get_state() + " " + a.get_zip();
                        street = a.get_street();
                        city = a.get_city();
                        state = a.get_state();
                        zipcode = a.get_zip();
                        country = a.get_county();
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
                intent.putExtra("country", country);
                startActivity(intent);
                //self.finish();
            }
        });
    }

    public void back(View view) {
        Intent nextScreen = new Intent(getApplicationContext(), HomeActivity.class);
        nextScreen.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivityForResult(nextScreen, 0);
        overridePendingTransition(0, 0); //0 for no animation
        finish();
    }

    public void addConstituent(View view) {
        Intent nextScreen = new Intent(getApplicationContext(), NewConstitActivity.class);
        nextScreen.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivityForResult(nextScreen, 0);
        overridePendingTransition(0, 0); //0 for no animation
    }
}
