package kr.ac.knou.ch8_canvas;

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


    protected class TestView extends View {
        public TestView(Context context) {
            super(context);
        }

        public void onDraw(Canvas canvas) {
            canvas.drawColor(Color.LTGRAY);
            Paint Pnt = new Paint();

            // 빨간색  사각형
            Pnt.setColor(Color.RED);
            canvas.drawRect(10, 80, 80, 200, Pnt);

            // 검정색 점
            Pnt.setColor(Color.BLACK);
            canvas.drawPoint(30, 30, Pnt);

            // 검정색 선
            canvas.drawLine(40, 150, 150, 150, Pnt);

            // 파란색 반투명한 원
            Pnt.setColor(0x800000ff);
            canvas.drawCircle(80, 80, 50, Pnt);

            // 초록색 문자열
            Pnt.setColor(Color.GREEN);
            canvas.drawText("Canvas Text Finish", 100, 100, Pnt);
        }
    }

}
