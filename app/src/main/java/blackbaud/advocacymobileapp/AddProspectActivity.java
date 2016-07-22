package blackbaud.advocacymobileapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AddProspectActivity extends AppCompatActivity {
    ArrayList<Address> addressItems;
    ArrayAdapter<String> adapter;
    String[] addressStrings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Comes with it, can't remove
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_prospect);

        addressItems = new ArrayList<>();
        get_addresses();

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, addressStrings);

        ListView listView = (ListView) findViewById(R.id.listView);
        if(listView!=null) listView.setAdapter(adapter);
    }

    private void populate_list() {
        addressStrings = new String[addressItems.size()];
        for(int i = 0; i < addressItems.size(); i++) {
            addressStrings[i]= addressItems.get(i).toString();
        }
    }

    protected void populate_addresses(ArrayList<Address> addressItems){
        this.addressItems = addressItems;
    }

    // Should dynamically get addresses if this wasn't a prototype
    private void get_addresses(){
        Address addr1 = new Address("713 A Smoke Rise Dr", "Central", "SC", "29630", "USA");
        Address addr2 = new Address("104 Evergreen Ave", "Springfield", "NJ", "07081", "USA");
        Address addr3 = new Address("1222 Moose Mountain Ct", "Quebec City", "Quebec", "G1A 1C5", "Canada");
        Address addr4 = new Address("666 Fallen Lane", "Columbia", "SC", "29201", "USA");
        Address addr5 = new Address("101 Vista Montana", "San Jose", "CA", "95134", "USA");
        Address addr6 = new Address("116 East Green St", "Pendleton", "SC", "29570", "USA");
        Address addr7 = new Address("42 Applegate Dr", "Orlando", "FL", "32801", "USA");
        Address addr8 = new Address("1776 Gettysburg Dr", "Philadelphia", "PA", "19019", "USA");
        Address addr9 = new Address("413 Sheltered Cove Ct", "Fort Mill", "SC", "29708", "USA");

        ArrayList<Address> addresses = new ArrayList<>();
        addresses.add(addr1);
        addresses.add(addr2);
        addresses.add(addr3);
        addresses.add(addr4);
        addresses.add(addr5);
        addresses.add(addr6);
        addresses.add(addr7);
        addresses.add(addr8);
        addresses.add(addr9);

        populate_addresses(addresses);
        populate_list();
    }
}
