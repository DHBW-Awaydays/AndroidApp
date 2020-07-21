package com.awaydays.awaydaysapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewholder> {

    ArrayList<Fahrt> mData;

    public MyAdapter(ArrayList<Fahrt> aData) {
        mData =  aData;
    }
    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View newView = inflater.inflate(R.layout.listenelementlayout, parent, false);
        MyViewholder viewholder = new MyViewholder(newView);
        return viewholder;
    }


    @Override
    public void  onBindViewHolder(@NonNull MyViewholder holder, int pos) {
        Fahrt fahrt = mData.get(pos);

        holder.event.setText(fahrt.zielEvent);

        holder.preis.setText(Double.toString(fahrt.preis)+" €");
        holder.datum.setText(fahrt.datum);
        holder.abfahrtsort.setText(fahrt.startPunkt);
        holder.bewertung.setRating(fahrt.bewertung);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}