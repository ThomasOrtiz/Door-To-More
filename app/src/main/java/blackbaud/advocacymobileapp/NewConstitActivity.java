package blackbaud.advocacymobileapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import blackbaud.advocacymobileapp.InterestItem;

public class NewConstitActivity extends AppCompatActivity implements View.OnClickListener{


    Constituent new_constituent = new Constituent();

    private Button submit, donate, petition;
    private TextView first_name, last_name, phone_number, email, street_address, city, state, zipcode, county, comment;
    private CheckBox issue1, issue2, issue3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_constit);

        submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(this);

        donate = (Button) findViewById(R.id.button3);
        donate.setOnClickListener(this);

        petition = (Button) findViewById(R.id.button1);
        petition.setOnClickListener(this);


        first_name = (EditText) findViewById(R.id.editText3);
        last_name = (EditText) findViewById(R.id.editText);
        phone_number = (EditText) findViewById(R.id.editText2);
        email = (EditText) findViewById(R.id.editText4);
        street_address = (EditText) findViewById(R.id.editText5);
        city = (EditText) findViewById(R.id.editText6);
        state = (EditText) findViewById(R.id.editText7);
        zipcode = (EditText) findViewById(R.id.editText8);
        county = (EditText) findViewById(R.id.editText9);
        comment = (EditText) findViewById(R.id.editTex11);

        issue1 = (CheckBox) findViewById(R.id.checkBox1);
        issue2 = (CheckBox) findViewById(R.id.checkBox2);
        issue3 = (CheckBox) findViewById(R.id.checkBox3);
    }



    @Override
    public void onClick(View v) {

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

                new_constituent.first_name = first_name.toString();
                new_constituent.last_name = last_name.toString();
                new_constituent.phone = phone_number.toString();
                new_constituent.email = email.toString();
                new_constituent.state_address = state.toString();
                new_constituent.city_address = city.toString();
                new_constituent.street_address = street_address.toString();
                new_constituent.county_address = county.toString();
                new_constituent.zipcode_address = zipcode.toString();
                new_constituent.notes = comment.toString();
                finish();
                // submit
                break;

            case R.id.button1:
                // petition

                break;

            case R.id.button3:
                // donate
                break;

            default:
                break;
        }

    }
}
