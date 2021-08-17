package kr.ac.knou.ch9_callbackmethod;

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
        View vw = new MyView(this);
        setContentView(vw);
    }

    class MyView extends View {
        public MyView(Context context) {
            super(context);
        }

        public boolean onTouchEvent(MotionEvent event) {
            super.onTouchEvent(event);
            if (event.getAction() == MotionEvent.ACTION_DOWN) {
                Toast.makeText(MainActivity.this, "Touch Event Received", Toast.LENGTH_SHORT).show();
                return true;
            }
            return false;
        }
    }

}
