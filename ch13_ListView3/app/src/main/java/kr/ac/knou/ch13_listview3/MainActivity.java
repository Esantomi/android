package kr.ac.knou.ch13_listview3;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<CharSequence> Adapter;
        Adapter = ArrayAdapter.createFromResource(this, R.array.mobile, android.R.layout.simple_list_item_multiple_choice);

        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(Adapter);
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        list.setDivider(new ColorDrawable(Color.BLUE));
        list.setDividerHeight(5);
    }
}
