package com.awaydays.awaydaysapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class erstellen extends AppCompatActivity {
    ArrayList<Fahrt> mData;
    MyAdapter mMyAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erstellen);


    }

}