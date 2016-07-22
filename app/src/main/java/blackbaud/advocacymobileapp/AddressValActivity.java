package blackbaud.advocacymobileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        TextView addressLineOneView = (TextView)findViewById(R.id.addressLineOneView);
        addressLineOneView.setText(addressLineOne);
    }

    public void failedConstit(View view) {
        Intent intent = new Intent(this, ProblemActivity.class);
        startActivity(intent);
    }

    public void successConstit(View view) {
        Intent intent = new Intent(this, NewConstitActivity.class);
        startActivity(intent);
    }

}
