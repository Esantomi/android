package kr.ac.knou.ch11_timer;

import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int value=0;
    TextView mText;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText=(TextView)findViewById(R.id.text);
        mHandler.sendEmptyMessage(0);
    }

    Handler mHandler = new Handler() {
        public void handleMessage(Message msg) {
            value++;
            mText.setText("Timer Value = " + value);
            mHandler.sendEmptyMessageDelayed(0,1000);
        }
    };

}