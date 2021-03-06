package kr.ac.knou.ch10_keyboardinput;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MyView vw;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        vw = new MyView(this);
        vw.setFocusable(true);
        vw.setFocusableInTouchMode(true);
        setContentView(vw);
    }

    protected class MyView extends View {
        float mX, mY, mR, mL;
        int mColor;

        public MyView(Context context) {
            super(context);
            mX = 190;
            mY = 250;
            mR = 290;
            mL = 350;
            mColor = Color.RED;
        }

        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.WHITE);
            Paint Pnt = new Paint();
            Pnt.setColor(mColor);
            Pnt.setAntiAlias(true);
            canvas.drawRect(mX, mY, mR, mL, Pnt);
        }

        public boolean onKeyDown(int KeyCode, KeyEvent event) {
            super.onKeyDown(KeyCode, event);
            if (event.getAction() == KeyEvent.ACTION_DOWN)
            {
                switch (KeyCode) {

                    case KeyEvent.KEYCODE_DPAD_LEFT:
                        mX-=5;
                        mR-=5;
                        invalidate();
                        return true;
                    case KeyEvent.KEYCODE_DPAD_RIGHT:
                        mX+=5;
                        mR+=5;
                        invalidate();
                        return true;

                    case KeyEvent.KEYCODE_DPAD_UP:
                        mY-=5;
                        mL-=5;
                        invalidate();
                        return true;
                    case KeyEvent.KEYCODE_DPAD_DOWN:
                        mY+=5;
                        mL+=5;
                        invalidate();
                        return true;

                    case KeyEvent.KEYCODE_DPAD_CENTER:
                        if (mColor == Color.RED) {
                            mColor = Color.BLACK;
                        } else {
                            mColor = Color.RED;
                        }
                        invalidate();
                        return true;
                }
            }
            return false;
        }
    }
}
