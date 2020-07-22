package com.awaydays.awaydaysapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;


public class http_test extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_http_test);
        mTextView = findViewById(R.id.textView_id);
        String[][] params = {{"add1", "2"}, {"add2", "5"}};
        CloudAdapter c1 = new CloudAdapter();
        try {
            c1.execPost("/post_test", params, http_test.this, mTextView);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}