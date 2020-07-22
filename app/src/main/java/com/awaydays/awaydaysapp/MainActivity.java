package com.awaydays.awaydaysapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Fahrt> mData;
    MyAdapter mMyAdapter;
    Intent intentPlus;
    Intent intentLupe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mData = new ArrayList<>();
        mData.add(new Fahrt("TSG Hoffenheim - VfB Stuttgart","Mannheim","21.07.2020", 15.00,4));
        mData.add(new Fahrt("TSG Hoffenheim - VfB Stuttgart","Mannheim","21.07.2020", 11.00,5));
        mData.add(new Fahrt("Eintracht Frankfurt - Mainz 05","Mannheim","21.07.2020", 8.00,3));
        mData.add(new Fahrt("Eintracht Frankfurt - Mainz 05","Mannheim","21.07.2020", 12.00,1));
        mData.add(new Fahrt("TSG Hoffenheim - VfB Stuttgart","Mannheim","21.07.2020", 15.00,4));
        mData.add(new Fahrt("TSG Hoffenheim - VfB Stuttgart","Mannheim","21.07.2020", 11.00,5));
        mData.add(new Fahrt("Eintracht Frankfurt - Mainz 05","Mannheim","21.07.2020", 8.00,3));
        mData.add(new Fahrt("Eintracht Frankfurt - Mainz 05","Mannheim","21.07.2020", 12.00,1));
        mData.add(new Fahrt("TSG Hoffenheim - VfB Stuttgart","Mannheim","21.07.2020", 15.00,4));
        mData.add(new Fahrt("TSG Hoffenheim - VfB Stuttgart","Mannheim","21.07.2020", 11.00,5));
        mData.add(new Fahrt("Eintracht Frankfurt - Mainz 05","Mannheim","21.07.2020", 8.00,3));
        mData.add(new Fahrt("Eintracht Frankfurt - Mainz 05","Mannheim","21.07.2020", 12.00,1));
        mData.add(new Fahrt("Eintracht Frankfurt - Mainz 05","Mannheim","21.07.2020", 12.00,1));

        Activity detail = new Activity();

        mMyAdapter= new MyAdapter(mData, detail);
        RecyclerView recyclerView = findViewById(R.id.liste);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter((mMyAdapter));

        ImageButton searchBtn = (ImageButton) findViewById(R.id.searchBtn);
        ImageButton plusBtn = (ImageButton) findViewById(R.id.plusBtn);

        intentLupe = new Intent(this, search.class);
        searchBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(intentLupe);
            }
        });

        intentPlus = new Intent(this, erstellen.class);
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentPlus);
            }
        });
    }
}