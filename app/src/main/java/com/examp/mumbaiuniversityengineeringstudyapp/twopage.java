package com.examp.mumbaiuniversityengineeringstudyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class twopage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twopage);




    }


    public void student(View view) {
        Button student = findViewById(R.id.button1);
        Toast.makeText( getApplicationContext(), "login button was clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(twopage.this, sign.class);
        startActivity(intent);
    }

    public void teacher(View view) {
        Button teacher = findViewById(R.id.button2222);
        Toast.makeText( getApplicationContext(), "sign up button was clicked", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(twopage.this,signup2.class);
        startActivity(intent);
    }
}