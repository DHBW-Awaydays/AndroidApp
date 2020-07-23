package com.awaydays.awaydaysapp;

public class loginHelper {

    private String status;

    public loginHelper()
    {
        status= "PENDING";
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String newString)
    {
        status=newString;
    }
}
