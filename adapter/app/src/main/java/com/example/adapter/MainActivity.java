package com.example.adapter;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends Activity {
    ListView listView;
    String fruitNames[] = {"Apple", "Grape", "Guava", "Mango", "Orange", "Watermelon"};

    int fruitImageIds[] = {R.drawable.apple,
            R.drawable.grap,
            R.drawable.guva,
            R.drawable.mango,
            R.drawable.oreng,
            R.drawable.wm};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.ls);

        ArrayList<HashMap<String, Object>> list = new ArrayList<>();



        for (int i = 0; i < fruitNames.length; i++) {

            // creating an Object of HashMap class
            HashMap<String, Object> map = new HashMap<>();

            // Data entry in HashMap
            map.put("fruitName", fruitNames[i]);
            map.put("fruitImage", fruitImageIds[i]);

            // adding the HashMap to the ArrayList
            list.add(map);

            String[] from = {"fruitName", "fruitImage"};

            int to[] = {R.id.tv, R.id.imageView};


            SimpleAdapter simpleAdapter = new SimpleAdapter(getApplicationContext(), list, R.layout.ui_row, from, to);

            listView.setAdapter(simpleAdapter);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(getApplicationContext(),"Clicked " + fruitNames[i],Toast.LENGTH_SHORT).show();
                }
            });
        }
    }



}