package com.awaydays.awaydaysapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class search extends AppCompatActivity {
    Toolbar toolbar;
    Intent intentPlus;
    int counter = 0;
    String amount = "0";
    TextView cView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        cView = findViewById(R.id.anzahlPlätzeTv);
    }

    public void onClickSuchen(View view) {
        intentPlus = new Intent(this, MainActivity.class);
        startActivity(intentPlus);
    }

    public void onClickErstellen(View view) {
        ImageButton plusBtn = (ImageButton) findViewById(R.id.plusBtn);
        intentPlus = new Intent(this, erstellen.class);
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentPlus);
            }
        });
    }

    public void onClickAwaydays(View view) {
        TextView plusBtn = (TextView) findViewById(R.id.awaydaysTv);
        intentPlus = new Intent(this, MainActivity.class);
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentPlus);
            }
        });
    }

    public void plus(View view) {
        if (counter < 13) {
            counter++;
        }
        amount = Integer.toString(counter);
        cView.setText(amount);
    }

    public void minus(View view) {
        if (counter > 0) {
            counter--;
        }
        amount = Integer.toString(counter);
        cView.setText(amount);
    }
}