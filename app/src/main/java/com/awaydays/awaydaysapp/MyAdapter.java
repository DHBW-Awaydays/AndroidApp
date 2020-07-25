package com.awaydays.awaydaysapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewholder> {

    ArrayList<ride> mData;
    private OnRideListener mOnRideListener;

    public MyAdapter(ArrayList<ride> aData, OnRideListener OnRideListener) {
        this.mData = aData;
        this.mOnRideListener = OnRideListener;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View newView = inflater.inflate(R.layout.listenelementlayout, parent, false);
        return new MyViewholder(newView, mOnRideListener);
    }


    public interface OnRideListener {
        void onRideClick(int position);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int pos) {
        ride ride = mData.get(pos);
        holder.event.setText(ride.targetEvent);
        holder.preis.setText(Double.toString(ride.price) + "0 €");
        holder.datum.setText(ride.date);
        holder.abfahrtsort.setText("ab: " + ride.startLocation);
        holder.bewertung.setRating(ride.review);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}