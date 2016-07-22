package blackbaud.advocacymobileapp;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PetitionActivity extends AppCompatActivity {

    private DoorData myData;
    private Intent previous;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petition);
        myData = DoorData.getInstance();
        previous = new Intent(this, NewConstitActivity.class);

        Typeface headerTypeface = Typeface.createFromAsset(getAssets(), "fonts/Oswald-Regular.ttf");
        Typeface bodyTypeface = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Regular.ttf");

        TextView textBody = (TextView)findViewById(R.id.textView12);
        TextView textHeader = (TextView)findViewById(R.id.textView13);
        Button textYesButton = (Button)findViewById(R.id.button3);
        TextView textNoButton = (TextView)findViewById(R.id.textView14);
        textBody.setMovementMethod(new ScrollingMovementMethod());

        textBody.setTypeface(bodyTypeface);
        textHeader.setTypeface(headerTypeface);
        textNoButton.setTypeface(bodyTypeface);
        textYesButton.setTypeface(bodyTypeface);
    }

    public void signPetition(View view) {
        Intent intent = getIntent();
        String name = intent.getStringExtra("first_name") + " " + intent.getStringExtra("last_name");
        myData.addPetitionSign(name);

        finish();
    }

    public void cancelPetition(View view) {
        finish();
    }
}
