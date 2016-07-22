package blackbaud.advocacymobileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class ViewConstitActivity extends AppCompatActivity {

    // List view
    private ListView lv;

    // false = show only my personal people I added
    // true  = show ALL of the people
    private boolean allConstit;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;


    // ArrayList for Listview
    ArrayList<HashMap<String, String>> conList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_constit);
        allConstit = false;

        String conList[] = {"Dell Inspiron", "HTC One X", "HTC Wildfire S", "HTC Sense", "HTC Sensation XE",
                "iPhone 4S", "Samsung Galaxy Note 800",
                "Samsung Galaxy S3", "MacBook Air", "Mac Mini", "MacBook Pro"};

        lv = (ListView) findViewById(R.id.listView);

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
