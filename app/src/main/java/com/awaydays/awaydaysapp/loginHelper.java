package com.awaydays.awaydaysapp;

public class loginHelper {

    private String status;
    public final String STATUS_PENDING = "PENDING";
    public final String STATUS_SUCCESS = "SUCCESS";
    public final String STATUS_FAILED = "FAILED";

    public loginHelper() {
        status = STATUS_PENDING;
    }


    public String getStatus() {
        return status;
    }

    public void setSTATUS_PENDING() {
        status = STATUS_PENDING;
    }

    public void setSTATUS_SUCCESS() {
        status = STATUS_SUCCESS;
    }

    public void setSTATUS_FAILED() {
        status = STATUS_FAILED;
    }

    public void setStatus(String newString) {
        status = newString;

    }
}
