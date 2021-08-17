package kr.ac.knou.ch14_alertdialog3;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mOnClick(View v) {
        new AlertDialog.Builder(this)
                .setTitle("NOTICE")
                .setMessage("You should read the message.")
                .setIcon(R.mipmap.ic_launcher)
                .setCancelable(false)
                .setNegativeButton("CLOSE", null)
                .show();
    }
}
