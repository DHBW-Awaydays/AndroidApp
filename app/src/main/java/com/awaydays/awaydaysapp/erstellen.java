package com.awaydays.awaydaysapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class erstellen extends AppCompatActivity {
    ArrayList<Fahrt> mData;
    MyAdapter mMyAdapter;
    Intent intentDashboard;
    Intent intentLupe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erstellen);

        ImageButton searchBtn = (ImageButton) findViewById(R.id.searchBtn);
        TextView awaydaysTv = (TextView) findViewById(R.id.awaydaysTv);

        intentLupe = new Intent(this, search.class);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentLupe);
            }
        });

        intentDashboard = new Intent(this, MainActivity.class);
        awaydaysTv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentDashboard);
            }
        });
    }

}