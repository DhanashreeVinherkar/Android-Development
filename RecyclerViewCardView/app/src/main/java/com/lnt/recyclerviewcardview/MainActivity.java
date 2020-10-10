package com.lnt.recyclerviewcardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> names = new ArrayList<>(Arrays.asList("Cupcake", "Donut", "Eclair", "Froyo", "Gingerbread", "Honeycomb", "Kitkat"));
    ArrayList<String> version = new ArrayList<>(Arrays.asList("1.5", "1.6", "2.0", "2.2", "2.3", "3.0", "3.5"));
    static Integer[] drawableArray = {R.drawable.cupcake, R.drawable.donut, R.drawable.eclair,
            R.drawable.froyo, R.drawable.gingerbread, R.drawable.honeycomb, R.drawable.kitkat};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycle);
        //set linear layout manager with default vertical orientation
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        //call the constructor of NewAdapter to send reference and data to Adapter
        CustomAdapter newAdapter = new CustomAdapter(names, version, drawableArray);
        recyclerView.setAdapter(newAdapter);    //set adapter to RecyclerView
    }
}