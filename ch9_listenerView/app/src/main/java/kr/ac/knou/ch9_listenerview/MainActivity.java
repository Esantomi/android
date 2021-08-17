package kr.ac.knou.ch9_listenerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyView vw = new MyView(this);
        vw.setOnTouchListener(vw);
        setContentView(vw);
    }
    class MyView extends View implements View.OnTouchListener {
        public MyView(Context context) {
            super(context);
        }
        public boolean onTouch(View v, MotionEvent event) {
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(MainActivity.this, "Touch Event Received", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }
}