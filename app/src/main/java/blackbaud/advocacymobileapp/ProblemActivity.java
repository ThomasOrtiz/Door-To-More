package blackbaud.advocacymobileapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProblemActivity extends AppCompatActivity {

    private DoorData myData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);
        myData = DoorData.getInstance();
    }

    public void clickSave(View view) {
        Intent intent = new Intent(this, AddProspectActivity.class);
        EditText editText = (EditText) findViewById(R.id.problemEditText);
        String message = editText.getText().toString();
        //Save message
        Address current = myData.getCurrentAddress();
        myData.removeAddress(current);

        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivityForResult(intent, 0);
        overridePendingTransition(0, 0); //0 for no animation
    }

    public void back(View view) {
        Intent intent = new Intent(this, AddressValActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivityForResult(intent, 0);
        overridePendingTransition(0, 0); //0 for no animation
    }
}
