package com.awaydays.awaydaysapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class erstellen extends AppCompatActivity {
    ArrayList<Fahrt> mData;
    MyAdapter mMyAdapter;
    Intent intentDashboard;
    Intent intentLupe;

    double preis=0;
    String amountPreis ="0";

    int plätze=0;
    String amountPlätze="0";

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

        PreisView=findViewById(R.id.preisTv);

        PlatzView=findViewById(R.id.platzeditText);
    }

    public void onFahrtErstellen(View view){

    }

    public void erstellen (View view)
    {
        Toast.makeText(this, "Fahrt erstellt!", Toast.LENGTH_SHORT).show();
        intentDashboard = new Intent(this, MainActivity.class);
        startActivity(intentDashboard);
    }

    public void plusPreis (View view)
    {
        preis++;

        amountPreis = Double.toString(preis);

        PreisView.setText(amountPreis);
    }

    public void minusPreis (View view)
    {

        if(preis>0)
        {
            preis--;

            amountPreis = Double.toString(preis);

            PreisView.setText(amountPreis);
        }

    }

    public void minusPlatz (View view)
    {
        if(plätze>0)
        {
            plätze--;

            amountPlätze = Double.toString(plätze);

            PlatzView.setText(amountPlätze);
        }

    }

    public void plusPlatz (View view)
    {
            plätze++;

            amountPlätze = Double.toString(plätze);

            PlatzView.setText(amountPlätze);

    }


}