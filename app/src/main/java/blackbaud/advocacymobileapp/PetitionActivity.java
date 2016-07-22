package blackbaud.advocacymobileapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class PetitionActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petition);

        TextView text = (TextView)findViewById(R.id.textView12);
        text.setMovementMethod(new ScrollingMovementMethod());

    }
}
