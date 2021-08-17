package kr.ac.knou.ch13_listview2;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListFromArray extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<CharSequence> Adapter;
        Adapter = ArrayAdapter.createFromResource(this, R.array.mobile, android.R.layout.simple_list_item_1);
        ListView list = (ListView)findViewById(R.id.list);
        list.setAdapter(Adapter);
    } }
