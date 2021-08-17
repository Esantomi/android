package kr.ac.knou.ch14_alterdialog2;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
                .setTitle("MESSAGE")
                .setMessage("AlertDialog Test is success!!")
                .setIcon(R.mipmap.ic_launcher)
                .setPositiveButton("CLOSE", new DialogInterface.OnClickListener()
                {
                    public void onClick(DialogInterface dialog, int which) { }
                }).show();
        //setNegativeButton 사용
//         .setNegativeButton("CLOSE", new DialogInterface.OnClickListener()
//        {
//            public void onClick(DialogInterface dialog, int which) { }  })
//                .show();
    }
}
