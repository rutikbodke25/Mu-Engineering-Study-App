package com.examp.mumbaiuniversityengineeringstudyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;






public class calculater_webview extends AppCompatActivity {
    EditText e1;
    Button b2;
    TextView e2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculater_webview);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        b2=findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double  a;
                double c=9.5f;

                double b;
                a=Double.parseDouble(e1.getText().toString());
                b =a*c;
                e2.setText("Percentage            " + b);
            }
        });




    }

}