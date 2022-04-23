package com.examp.mumbaiuniversityengineeringstudyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Thread thread=new Thread(){
            public void run(){
                try {
                    sleep(1000);

                }
                catch (Exception e ){
                    e.printStackTrace();

                }
                finally {
                    Intent intent=new Intent(MainActivity.this, twopage.class );
                    startActivity(intent);


                }

            };

        };thread.start();


    }


}


