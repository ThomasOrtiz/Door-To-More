package blackbaud.advocacymobileapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
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

        TextView text = (TextView)findViewById(R.id.textView12);
        text.setMovementMethod(new ScrollingMovementMethod());

    }

    public void signPetition(View view) {
        Intent intent = getIntent();
        String name = intent.getStringExtra("first_name") + " " + intent.getStringExtra("last_name");
        myData.addPetitionSign(name);
        startActivity(previous);
    }

    public void cancelPetition(View view) {
        startActivity(previous);
    }
}
