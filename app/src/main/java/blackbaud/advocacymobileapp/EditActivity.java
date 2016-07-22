package blackbaud.advocacymobileapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EditActivity extends AppCompatActivity implements View.OnClickListener{

    Constituent new_constituent = new Constituent();

    private Button submit, donate, petition;
    private CheckBox issue1, issue2, issue3;
    private DoorData myData;
    private ImageButton backarrow;
    private TextView first_name_view, last_name_view, phone_number_view, email_view, street_address_view, city_view, state_view, zipcode_view, county_view, comment_view, street_view;
    private ArrayList<Constituent> constituentsItems;
    String first_name= null, last_name= null, phone_number= null, email= null, street_address= null, city= null, state= null, zipcode= null, county= null, comment= "", street = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        myData = DoorData.getInstance();
        constituentsItems = myData.getConstituents();


        Intent intent = getIntent();
        first_name = intent.getStringExtra("first_name");
        last_name = intent.getStringExtra("last_name");


        submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(this);


        first_name_view = (EditText) findViewById(R.id.editText3);
        last_name_view = (EditText) findViewById(R.id.editText);
        phone_number_view = (EditText) findViewById(R.id.editText2);
        email_view = (EditText) findViewById(R.id.editText4);
        street_address_view = (EditText) findViewById(R.id.editText5);
        city_view = (EditText) findViewById(R.id.editText6);
        state_view = (EditText) findViewById(R.id.editText7);
        zipcode_view = (EditText) findViewById(R.id.editText8);
        county_view = (EditText) findViewById(R.id.editText9);
        comment_view = (EditText) findViewById(R.id.editTex11);

        issue1 = (CheckBox) findViewById(R.id.checkBox1);
        issue2 = (CheckBox) findViewById(R.id.checkBox2);
        issue3 = (CheckBox) findViewById(R.id.checkBox3);



        for(Constituent constituent: constituentsItems)
        {
            if((first_name.equals(constituent.first_name))&&(last_name.equals(constituent.last_name))){
                first_name = constituent.first_name;
                last_name = constituent.last_name;
                phone_number = constituent.phone;
                email = constituent.email;
                street = constituent.street;
                city = constituent.city;
                state = constituent.state;
                zipcode = constituent.zipcode;
                county = constituent.county;
                if(constituent.notes !=null){
                    comment = constituent.notes;
                }

            }
        }

        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Oswald-Regular.ttf");
        state_view.setText(state);
        street_address_view.setText(street);
        city_view.setText(city);
        zipcode_view.setText(zipcode);
        first_name_view.setText(first_name);
        last_name_view.setText(last_name);
        phone_number_view.setText(phone_number);
        email_view.setText(email);
        county_view.setText(county);
//        comment_view.setText(comment);

        state_view.setTypeface(tf);
        street_address_view.setTypeface(tf);
        city_view.setTypeface(tf);
        zipcode_view.setTypeface(tf);
        first_name_view.setTypeface(tf);
        last_name_view.setTypeface(tf);
        phone_number_view.setTypeface(tf);
        email_view.setTypeface(tf);
        county_view.setTypeface(tf);
        //    comment_view.setTypeface(tf);


    }



    @Override
    public void onClick(View v) {

        Intent intent = null;

        switch (v.getId()) {

            case R.id.button:
                InterestItem item1 = new InterestItem();
                item1.is_interested = issue2.isChecked();
                item1.name = "dsd";
                if(item1.is_interested){
                    new_constituent.interest_items.add(item1);
                }
                InterestItem item = new InterestItem();
                item.is_interested = issue1.isChecked();
                item.name = "dsd";
                if(item.is_interested){
                    new_constituent.interest_items.add(item);
                }
                InterestItem item2 = new InterestItem();
                item2.is_interested = issue2.isChecked();
                item2.name = "dsd";
                if(item2.is_interested){
                    new_constituent.interest_items.add(item2);
                }

                new_constituent.first_name = first_name_view.toString();
                new_constituent.last_name = last_name_view.toString();
                new_constituent.phone = phone_number_view.toString();
                new_constituent.email = email_view.toString();
                new_constituent.state = state_view.toString();
                new_constituent.city = city_view.toString();
                new_constituent.street = street_address_view.toString();
                new_constituent.county = county_view.toString();
                new_constituent.zipcode = zipcode_view.toString();
                new_constituent.notes = comment_view.toString();
                myData.addConstituient(new_constituent);
                finish();
                // submit
                break;


            case R.id.imageButton1:
                finish();
                break;


            default:
                break;
        }

        if(intent != null) {
            startActivity(intent);
            finish();
        }

    }
}
