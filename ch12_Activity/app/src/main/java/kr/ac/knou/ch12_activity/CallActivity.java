package kr.ac.knou.ch12_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CallActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.callactivity);
    }

    public void mOnClick(View v) {
        Intent intent = new Intent(this, SubActivity.class);
        startActivity(intent);
    }
}