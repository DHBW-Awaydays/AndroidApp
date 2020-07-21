package com.awaydays.awaydaysapp;

public class Fahrt {
    String fahrtID;
    String zielEvent;
    String startPunkt;
    String startZeit;
    String userID;
    int anzPlaetze;
    String[] platzListe;
    double preis;
    String fahrtBio;

    String datum;
    int bewertung;

    public Fahrt(String zielEvent, String startPunkt, String datum, double preis, int bewertung){
        this.zielEvent = zielEvent;
        this.startPunkt = startPunkt;
        this.datum = datum;
        this.preis = preis;
        this.bewertung = bewertung;

    }
}
