package com.awaydays.awaydaysapp;

import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
    TextView event, preis, datum, abfahrtsort;
    RatingBar bewertung;
    MyAdapter.OnRideListener onRideListener;

    public MyViewholder(@NonNull View itemView, MyAdapter.OnRideListener onRideListener) {
        super(itemView);
        event = itemView.findViewById(R.id.eventTv);
        preis = itemView.findViewById(R.id.preisTv);
        datum = itemView.findViewById(R.id.datumTv);
        abfahrtsort = itemView.findViewById(R.id.abfahrtsortTv);
        bewertung = itemView.findViewById(R.id.bewertungRb);
        this.onRideListener = onRideListener;
        itemView.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        System.out.println("recieved Click in viewholder");
        onRideListener.onRideClick(getAdapterPosition());
    }
}
