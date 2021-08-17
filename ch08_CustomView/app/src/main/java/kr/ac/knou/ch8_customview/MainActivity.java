package kr.ac.knou.ch8_customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TestView tv = new TestView(this);
        setContentView(tv);
    }
}

class TestView extends View {
    public TestView(Context context) {
        super(context);
    }

    public  void  onDraw(Canvas canvas) {
        canvas.drawColor(Color.CYAN);
        Paint Pnt = new Paint();
        Pnt.setColor(Color.RED);
        canvas.drawRect(120, 100, 320, 500, Pnt);
    }
}
