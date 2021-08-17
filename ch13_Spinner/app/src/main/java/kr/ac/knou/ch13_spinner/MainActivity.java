package kr.ac.knou.ch13_spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter<CharSequence> adspin;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spin = (Spinner)findViewById(R.id.myspinner);
        String promptText = getString(R.string.ptext);
        spin.setPrompt(promptText);
        adspin = ArrayAdapter.createFromResource
                (this, R.array.colors, android.R.layout.simple_spinner_item);
        adspin.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adspin);

        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected
                    (AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,adspin.getItem(position), Toast.LENGTH_SHORT).show();
            }
            public void onNothingSelected(AdapterView<?> parent){}
        });
    }
}
