package blackbaud.advocacymobileapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PetitionActivity extends AppCompatActivity implements View.OnClickListener{

    private DoorData myData;
    private Intent previous;
    private Button submit;
    private Button cancel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petition);
        myData = DoorData.getInstance();
        previous = new Intent(this, NewConstitActivity.class);
        submit = (Button) findViewById(R.id.button3);
        cancel = (Button) findViewById(R.id.button4);

        Typeface headerTypeface = Typeface.createFromAsset(getAssets(), "fonts/Oswald-Regular.ttf");
        Typeface bodyTypeface = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Regular.ttf");

       // TextView textBody = (TextView)findViewById(R.id.textView12);
       // TextView textHeader = (TextView)findViewById(R.id.textView13);
       // TextView textNoButton = (TextView)findViewById(R.id.textView14);
       // textBody.setMovementMethod(new ScrollingMovementMethod());

        submit.setOnClickListener(this);
        cancel.setOnClickListener(this);


    //    textBody.setTypeface(bodyTypeface);
    //    textHeader.setTypeface(headerTypeface);
    //    textNoButton.setTypeface(bodyTypeface);
    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.button3:

                finish();
                break;

            case R.id.button4:

                finish();
                break;
        }
    }

}
