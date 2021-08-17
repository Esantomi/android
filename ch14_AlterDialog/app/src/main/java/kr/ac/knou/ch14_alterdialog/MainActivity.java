package kr.ac.knou.ch14_alterdialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mOnClick(View v) {
        AlertDialog.Builder bld = new AlertDialog.Builder(this);
        bld.setTitle("MESSAGE");
        bld.setMessage("AlertDialog Test is success !!");
        bld.setIcon(R.mipmap.ic_launcher);
        bld.show();            }

}
