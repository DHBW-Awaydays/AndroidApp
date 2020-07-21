package com.awaydays.awaydaysapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Fahrt> mData;
    MyAdapter mMyAdapter;
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
        mData.add(new Fahrt("Eintracht Frankfurt - Mainz 05","Mannheim","21.07.2020", 12.00,1));mData.add(new Fahrt("TSG Hoffenheim - VfB Stuttgart","Mannheim","21.07.2020", 15.00,4));
        mData.add(new Fahrt("TSG Hoffenheim - VfB Stuttgart","Mannheim","21.07.2020", 11.00,5));
        mData.add(new Fahrt("Eintracht Frankfurt - Mainz 05","Mannheim","21.07.2020", 8.00,3));
        mData.add(new Fahrt("Eintracht Frankfurt - Mainz 05","Mannheim","21.07.2020", 12.00,1));

        mMyAdapter= new MyAdapter(mData);
        RecyclerView recyclerView = findViewById(R.id.liste);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter((mMyAdapter));

    }

}