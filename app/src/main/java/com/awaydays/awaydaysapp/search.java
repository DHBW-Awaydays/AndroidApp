package com.awaydays.awaydaysapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class search extends AppCompatActivity {

    Intent intentDashboard;
    Intent intentPlus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        ImageButton plusBtn = (ImageButton) findViewById(R.id.plusBtn);
        TextView awaydaysTv = (TextView) findViewById(R.id.awaydaysTv);

        intentPlus = new Intent(this, erstellen.class);
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentPlus);
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