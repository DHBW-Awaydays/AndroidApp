package com.awaydays.awaydaysapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class detail extends AppCompatActivity {
    Toolbar toolbar;
    Intent intent;
    int counter = 0;
    String amount = "0";
    TextView cView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        cView = findViewById(R.id.anzahlPlätzeTv);

    }

    public void onClickAwaydays(View view) {
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void onClickSearch(View view) {
        intent = new Intent(this, search.class);
        startActivity(intent);
    }

    public void onClickErstellen(View view) {
        intent = new Intent(this, erstellen.class);
        startActivity(intent);
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

    public void anfragen(View view) {
        Toast.makeText(this, "Anfrage gesendet!", Toast.LENGTH_SHORT).show();
        intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}