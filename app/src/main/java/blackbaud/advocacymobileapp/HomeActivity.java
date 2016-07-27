package blackbaud.advocacymobileapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

	private ImageButton ajar_door;
	private ImageButton closed_door;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

		ajar_door = (ImageButton) findViewById(R.id.imageButton1);
		ajar_door.setOnClickListener(this);

		closed_door   = (ImageButton) findViewById(R.id.imageButton4);
		closed_door.setOnClickListener(this);
    }

    public void onProsAddressClicked(View view) {
        Intent nextScreen = new Intent(getApplicationContext(), AddProspectActivity.class);
        nextScreen.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivityForResult(nextScreen, 0);
        overridePendingTransition(0,0); //0 for no animation
    }

    public void onViewConstituentsClicked(View view) {
        Intent nextScreen = new Intent(getApplicationContext(), ViewConstitActivity.class);
        nextScreen.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivityForResult(nextScreen, 0);
        overridePendingTransition(0,0); //0 for no animation
    }

	public void onClick(View v) {

		switch (v.getId()) {

			case R.id.imageButton1: //  clicked ajar
				ajar_door.setVisibility(View.INVISIBLE);
				closed_door.setVisibility(View.VISIBLE);
				break;
			case R.id.imageButton4: // clicked closed
				ajar_door.setVisibility(View.VISIBLE);
				closed_door.setVisibility(View.INVISIBLE);
				break;
		}
	}
}
