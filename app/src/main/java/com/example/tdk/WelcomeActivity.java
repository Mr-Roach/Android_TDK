package com.example.tdk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //啟動執行序
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(3000);
                    startActivity(new Intent().setClass(WelcomeActivity.this,MainActivity.class));
                    WelcomeActivity.this.finish();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
    }
}

