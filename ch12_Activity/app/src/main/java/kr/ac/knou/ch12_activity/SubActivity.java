package kr.ac.knou.ch12_activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SubActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity);
    }

    public void mOnClick(View v) {
        finish();
    }
}

