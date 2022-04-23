package com.examp.mumbaiuniversityengineeringstudyapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;

import android.view.View;

import android.os.Bundle;




    public class features_Activity extends AppCompatActivity implements View.OnClickListener {
        private CardView card1, card2, card3, card4, card5, card6, card7, card8;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_features);



            card1 = (CardView) findViewById(R.id.c1);
            card2 = (CardView) findViewById(R.id.c2);
            card3 = (CardView) findViewById(R.id.c3);
            card4 = (CardView) findViewById(R.id.c4);
            card5 = (CardView) findViewById(R.id.c5);
            card6 = (CardView) findViewById(R.id.c6);
            card7 = (CardView) findViewById(R.id.c7);
            card8 = (CardView) findViewById(R.id.c8);

            card1.setOnClickListener(this);
            card2.setOnClickListener(this);
            card3.setOnClickListener(this);
            card4.setOnClickListener(this);
            card5.setOnClickListener(this);
            card6.setOnClickListener(this);
            card7.setOnClickListener(this);
            card8.setOnClickListener(this);


        }

        @Override
        public void onClick(View v) {
            Intent i;
            switch (v.getId()) {
                case R.id.c1:
                    i = new Intent(this, Syllabus_webview.class);
                    startActivity(i);
                    break;
                case R.id.c2:
                    i = new Intent(this, notes1.class);
                    startActivity(i);
                    break;
                case R.id.c3:
                    i = new Intent(this, Result1.class);
                    startActivity(i);
                    break;
                case R.id.c4:
                    i = new Intent(this, calculater_webview.class);
                    startActivity(i);
                    break;
                case R.id.c5:
                    i = new Intent(this, paper_webview.class);
                    startActivity(i);
                    break;
                case R.id.c6:
                    i = new Intent(this, mcq_webview.class);
                    startActivity(i);
                    break;
                case R.id.c7:
                    i = new Intent(this, timetable_webview.class);
                    startActivity(i);
                    break;
                case R.id.c8:
                    i = new Intent(this, news_webview.class);
                    startActivity(i);
                    break;
            }



        }
    }


