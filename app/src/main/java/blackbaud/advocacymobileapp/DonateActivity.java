package blackbaud.advocacymobileapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DonateActivity extends AppCompatActivity implements View.OnClickListener{


    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);
        submit = (Button) findViewById(R.id.button5);
        submit.setOnClickListener(this);
    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button5:
                finish();
                break;

        }
    }





}
