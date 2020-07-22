package com.awaydays.awaydaysapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class detail extends AppCompatActivity {
    Toolbar toolbar;

    int counter =0;

    String amount ="0";

    TextView cView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        cView=findViewById(R.id.anzahlPlätzeTv);

    }

    public void plus (View view)
    {
        if(counter<13)
        {
            counter++;

        }

        amount=Integer.toString(counter);

        cView.setText(amount);
    }

    public void minus (View view)
    {
        if(counter>0)
        {
            counter--;
        }

        amount=Integer.toString(counter);

        cView.setText(amount);



    }

}