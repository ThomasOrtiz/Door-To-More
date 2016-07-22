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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_val);

        Intent intent = getIntent();

        addressLineOne = intent.getStringExtra("addressLineOne");
        addressLineTwo = intent.getStringExtra("addressLineTwo");

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
        startActivity(intent);
        finish();
    }

}
