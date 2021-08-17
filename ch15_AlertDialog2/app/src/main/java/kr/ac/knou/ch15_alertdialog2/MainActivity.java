package kr.ac.knou.ch15_alertdialog2;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mOnClick(View v) {
        // 어떤 작업을 수행한다.
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            ;
        }
        // 작업 중에 에러가 발생했다고 가정한다.
        boolean errorOccur = true;
        if (errorOccur) {
            new AlertDialog.Builder(this)
                    .setTitle("ERROR!!")
                    .setMessage("There is insufficient memory to continue." + "This program will exit.")
                    .setPositiveButton("EXIT", null)
                    // AlertDialog가 자동 종료되지 않음(사용자가 닫기 버튼을 누를 때 까지 finish()가 연기됨)
//                    .setPositiveButton("EXIT", new DialogInterface.OnClickListener()
//                            {public void onClick(DialogInterface dialog, int whichButton) {
//                                finish();
//                            }
//                            })
                    .show();

            finish();        }
        Toast.makeText(this, "The program was completed.", Toast.LENGTH_LONG).show();
    }
}
