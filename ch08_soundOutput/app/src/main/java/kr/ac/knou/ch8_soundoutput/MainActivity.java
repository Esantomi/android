package kr.ac.knou.ch8_soundoutput;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    SoundPool mPool;
    int   mDing;
    AudioManager mAm;

    @Override
    protected   void   onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPool = new  SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        mDing = mPool.load(this, R.raw.bgm, 1);
        mAm = (AudioManager)getSystemService(AUDIO_SERVICE);

        findViewById(R.id.beep1).setOnClickListener(mClickListener);
        findViewById(R.id.beep2).setOnClickListener(mClickListener);

    }


    Button.OnClickListener mClickListener = new Button.OnClickListener(){
        public void onClick(View v){

            switch(v.getId()){
                case R.id.beep1:
                    mPool.play(mDing, 1, 1, 0, 0, 1);
                    break;

                case R.id.beep2:
                    mAm.playSoundEffect(AudioManager.FX_KEYPRESS_STANDARD);
                    break;
            } //of switch

        } //of onClick

    }; //of mClickListener

} //of MainActivity
