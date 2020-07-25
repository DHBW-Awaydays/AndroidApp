package com.awaydays.awaydaysapp;

public class ride {
    String rideID;
    String targetEvent;
    String startLocation;
    String startTime;
    String userID;
    int amountSeats;
    String[] seatList;
    double price;
    String rideBiography;

    String date;
    int review;

    public ride(String targetEvent, String startLocation, String date, double price, int review) {
        this.targetEvent = targetEvent;
        this.startLocation = startLocation;
        this.date = date;
        this.price = price;
        this.review = review;

    }
}
