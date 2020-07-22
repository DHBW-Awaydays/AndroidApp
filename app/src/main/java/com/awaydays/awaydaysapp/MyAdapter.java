package com.awaydays.awaydaysapp;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewholder> {

    ArrayList<Fahrt> mData;
    Activity callingActivity;
    public MyAdapter(ArrayList<Fahrt> aData, Activity callingActivity) {
        this.mData =  aData;
        this.callingActivity = callingActivity;
    }
    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View newView = inflater.inflate(R.layout.listenelementlayout, parent, false);

        final MyViewholder viewholder = new MyViewholder(newView);

        newView.setOnClickListener();

        newView.setOnClickListener((View.OnClickListener) {

        Intent intent =  new Intent(MyAdapter.this.callingActivity, detail.class);
        intent.putExtra("object_id",viewholder.event);

        MyAdapter.this.callingActivity.startActivity(intent);
        });



        return viewholder;
    }


    @Override
    public void  onBindViewHolder(@NonNull MyViewholder holder, int pos) {
        Fahrt fahrt = mData.get(pos);

        holder.event.setText(fahrt.zielEvent);

        holder.preis.setText(Double.toString(fahrt.preis)+"0 €");
        holder.datum.setText(fahrt.datum);
        holder.abfahrtsort.setText("ab: "+fahrt.startPunkt);
        holder.bewertung.setRating(fahrt.bewertung);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}