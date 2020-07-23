package com.awaydays.awaydaysapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {
    EditText password;
    EditText email;

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        password = findViewById(R.id.editTextPassword);
        email = findViewById(R.id.editTextMail);
        intent= new Intent(this, MainActivity.class);


    }
    public void onClick(View view){

        CloudAdapter c1 = new CloudAdapter();
        loginHelper loginH = new loginHelper();
        String[][] params = {{"email", email.getText().toString()}, {"password", password.getText().toString()}};
        c1.login(params, loginH);
        while (loginH.getStatus().equals("PENDING")){}

        if(loginH.getStatus().equals("SUCCESS")){
            Log.i("info", "Login Succesfull");
            intent.putExtra("c1", c1);
            startActivity(intent);
        }else if (loginH.getStatus().equals("FAILED")){
            Log.i("info", "Login Not Succesfull");
            Toast.makeText(this, "Login fehlgeschlagen", Toast.LENGTH_SHORT).show();
        }
    }


}