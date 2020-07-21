package com.awaydays.awaydaysapp;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewholder extends RecyclerView.ViewHolder {
    TextView event;
    TextView preis;
    TextView datum;
    TextView abfahrtsort;
    RatingBar bewertung;

    public MyViewholder(@NonNull View itemView) {
        super(itemView);
        event = itemView.findViewById(R.id.eventTv);
        preis = itemView.findViewById(R.id.preisTv);
        datum = itemView.findViewById(R.id.datumTv);
        abfahrtsort = itemView.findViewById(R.id.abfahrtsortTv);
        bewertung = itemView.findViewById(R.id.bewertungRb);

    }
}
