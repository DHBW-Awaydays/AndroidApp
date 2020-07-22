package com.awaydays.awaydaysapp;

import android.app.Activity;
import android.os.AsyncTask;
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

public class CloudAdapter {
    private String baseURL = "http://h2890789.stratoserver.net:5432";
    private static final MediaType FORM = MediaType.parse("multipart/form-data");
    private OkHttpClient client;

    public CloudAdapter() {
        Log.i("info", "in CloudConstructor");
        client = new OkHttpClient();
    }

    public void execPost(String url, String[][] params, final Activity callingActivity, final TextView toAlter) throws IOException {
        Log.i("info", "in POST");
        FormBody.Builder builder = new FormBody.Builder();
        for (int i = 0; i < params.length; i++) {
            builder.add(params[i][0], params[i][1]);
        }
        RequestBody formBody = builder.build();
        url = baseURL + url;
        Log.i("info", url);
        Request request = new Request.Builder().url(url).post(formBody).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                //inform Serverproblems
                Log.i("info", "in POST ERROR");
                e.printStackTrace();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull final Response response) throws IOException {
                if(response.isSuccessful()) {
                    Log.i("info", "in POST onResponse");
                    callingActivity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                toAlter.setText(response.body().string());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    });
                    //doResponseShit
                }else {
                    Log.i("info", "in POST mo success");
                }
            }
        });
    }

    public void execGet(String url) {
        Log.i("info", "in GET");
        final Request request = new Request.Builder().url(baseURL + url).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                Log.i("info", "in GET ERROR");
                //inform Serverproblems
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                if (response.isSuccessful()) {
                    Log.i("info", "in GET onResponse");
                    //doResponseShit
                }else {
                    Log.i("info", "in GET no success");
                }
            }
        });
    }


}
