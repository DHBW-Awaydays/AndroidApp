package com.awaydays.awaydaysapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyAdapter.OnRideListener {
    ArrayList<ride> mData;
    MyAdapter mMyAdapter;
    Intent intentPlus;
    Intent intentLupe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CloudAdapter c1 = new CloudAdapter();
        loginHelper lh = new loginHelper();
        c1.checkLogin(lh);
        while(lh.getStatus().equals("PENDING")){}
        if(lh.getStatus().equals("SUCCESS")){
            Toast.makeText(this, "LoggedIn", Toast.LENGTH_LONG).show();
        }else if (lh.getStatus().equals("FAILURE")){
            Toast.makeText(this, "LoggedOUT", Toast.LENGTH_LONG).show();
        }
        if(getIntent().getExtras() !=null)
        {
            c1 = getIntent().getParcelableExtra("c1");
        }
        mData = new ArrayList<>();
        mData.add(new ride("TSG Hoffenheim - VfB Stuttgart", "Mannheim", "21.07.2020", 15.00, 4));
        mData.add(new ride("TSG Hoffenheim - VfB Stuttgart", "Mannheim", "21.07.2020", 11.00, 5));
        mData.add(new ride("Eintracht Frankfurt - Mainz 05", "Mannheim", "21.07.2020", 8.00, 3));
        mData.add(new ride("Eintracht Frankfurt - Mainz 05", "Mannheim", "21.07.2020", 12.00, 1));
        mData.add(new ride("TSG Hoffenheim - VfB Stuttgart", "Mannheim", "21.07.2020", 15.00, 4));
        mData.add(new ride("TSG Hoffenheim - VfB Stuttgart", "Mannheim", "21.07.2020", 11.00, 5));
        mData.add(new ride("Eintracht Frankfurt - Mainz 05", "Mannheim", "21.07.2020", 8.00, 3));
        mData.add(new ride("Eintracht Frankfurt - Mainz 05", "Mannheim", "21.07.2020", 12.00, 1));
        mData.add(new ride("TSG Hoffenheim - VfB Stuttgart", "Mannheim", "21.07.2020", 15.00, 4));
        mData.add(new ride("TSG Hoffenheim - VfB Stuttgart", "Mannheim", "21.07.2020", 11.00, 5));
        mData.add(new ride("Eintracht Frankfurt - Mainz 05", "Mannheim", "21.07.2020", 8.00, 3));
        mData.add(new ride("Eintracht Frankfurt - Mainz 05", "Mannheim", "21.07.2020", 12.00, 1));
        mData.add(new ride("Eintracht Frankfurt - Mainz 05", "Mannheim", "21.07.2020", 12.00, 1));

        //Activity detail = new Activity();
        mMyAdapter = new MyAdapter(mData, this);
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

    @Override
    public void onRideClick(int position) {
        Log.d("LEL", "click from acticvit");
        Intent intent = new Intent(this, detail.class);
        mData.get(position);
        //intent befüllen
        startActivity(intent);
    }
}