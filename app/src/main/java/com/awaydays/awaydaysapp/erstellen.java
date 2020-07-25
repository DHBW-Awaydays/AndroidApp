package com.awaydays.awaydaysapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class erstellen extends AppCompatActivity {

    Intent intentDashboard;
    Intent intentLupe;

    double price = 0;
    String amountPrice = "0";

    int seats = 0;
    String amountSeats = "0";

    TextView PreisView;
    TextView PlatzView;

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
        PreisView = findViewById(R.id.preisTv);
        PlatzView = findViewById(R.id.platzeditText);
    }

    public void onFahrtErstellen(View view) {

    }

    public  erstellen(View view) {
        Toast.makeText(this, "Fahrt erstellt!", Toast.LENGTH_SHORT).show();
        intentDashboard = new Intent(this, MainActivity.class);
        startActivity(intentDashboard);
    }

    public void plusPreis(View view) {
        price++;
        amountPrice = Double.toString(price);
        PreisView.setText(amountPrice);
    }

    public void minusPreis(View view) {
        if (price > 0) {
            price--;
            amountPrice = Double.toString(price);
            PreisView.setText(amountPrice);
        }
    }

    public void minusPlatz(View view) {
        if (seats > 0) {
            seats--;
            amountSeats = Double.toString(seats);
            PlatzView.setText(amountSeats);
        }
    }

    public void plusPlatz(View view) {
        seats++;
        amountSeats = Double.toString(seats);
        PlatzView.setText(amountSeats);
    }


}