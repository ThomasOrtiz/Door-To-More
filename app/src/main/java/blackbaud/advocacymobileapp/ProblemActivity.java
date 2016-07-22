package blackbaud.advocacymobileapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ProblemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);
    }

    public void clickSave(View view) {
        Intent intent = new Intent(this, AddProspectActivity.class);
        EditText editText = (EditText) findViewById(R.id.problemEditText);
        String message = editText.getText().toString();
        //Save message
        //Close constituent
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(this, AddProspectActivity.class);
        startActivity(intent);
    }

    public void openAlert(View view) {
        new AlertDialog.Builder(this)
                .setTitle("Alert Title")
                .setMessage("Alert Message")
                .setPositiveButton("test +", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //stub
                    }
                })
                .setNegativeButton("test -", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //stub
                    }
                })
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();
    }
}
