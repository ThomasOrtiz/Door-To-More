package blackbaud.advocacymobileapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddressValActivity extends AppCompatActivity {

    private String addressLineOne;
    private String addressLineTwo;
    private String street;
    private String state;
    private String city;
    private String zipcode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_val);

        Intent intent = getIntent();

        addressLineOne = intent.getStringExtra("addressLineOne");
        addressLineTwo = intent.getStringExtra("addressLineTwo");
        street = intent.getStringExtra("street");
        city = intent.getStringExtra("city");
        zipcode = intent.getStringExtra("zipcode");
        state = intent.getStringExtra("state");

        Typeface headerTypeface = Typeface.createFromAsset(getAssets(), "fonts/Oswald-Regular.ttf");
        Typeface bodyTypeface = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Regular.ttf");

        TextView addressLineOneView = (TextView)findViewById(R.id.addressLineOneView);
        TextView addressLineTwoView = (TextView)findViewById(R.id.addressLineTwoView);
        TextView query = (TextView)findViewById(R.id.textView2);
        Button yesButton = (Button)findViewById(R.id.button2);
        Button noButton = (Button)findViewById(R.id.button);

        addressLineOneView.setText(addressLineOne);
        addressLineTwoView.setText(addressLineTwo);
        addressLineOneView.setTypeface(headerTypeface);
        addressLineTwoView.setTypeface(headerTypeface);
        query.setTypeface(bodyTypeface);
        yesButton.setTypeface(bodyTypeface);
        noButton.setTypeface(bodyTypeface);
    }

    public void failedConstit(View view) {
        Intent intent = new Intent(this, ProblemActivity.class);
        startActivity(intent);
        finish();
    }

    public void successConstit(View view) {
        Intent intent = new Intent(this, NewConstitActivity.class);
        intent.putExtra("street", street);
        intent.putExtra("city", city);
        intent.putExtra("state", state);
        intent.putExtra("zipcode", zipcode);
        startActivity(intent);
        finish();
    }

}
