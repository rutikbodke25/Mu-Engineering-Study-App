package com.examp.mumbaiuniversityengineeringstudyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;




import static android.content.Context.MODE_PRIVATE;


import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;

import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.examp.mumbaiuniversityengineeringstudyapp.Models.Users;
import com.examp.mumbaiuniversityengineeringstudyapp.databinding.ActivitySignup2Binding;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class signup2 extends AppCompatActivity {
    ActivitySignup2Binding binding;
    private FirebaseAuth auth;
    FirebaseDatabase database;
    ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySignup2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();


        progressDialog = new ProgressDialog(signup2.this);
        progressDialog.setTitle("Creating Account");
        progressDialog.setMessage("we're creating your account");


        binding.b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressDialog.show();
                auth.createUserWithEmailAndPassword(binding.etEmail.getText().toString(), binding.etpassword.getText().toString())
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {

                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressDialog.dismiss();
                                if (task.isSuccessful()) {
                                    Intent intent = new Intent(signup2.this, sign.class);
                                    startActivity(intent);


                                    Users user = new Users(binding.etuserName.getText().toString(), binding.etEmail.getText().toString(),
                                            binding.etpassword.getText().toString());

                                    String id = task.getResult().getUser().getUid();
                                    database.getReference().child(id).setValue(user);
                                    Toast.makeText(signup2.this, "User Created Sucessfully", Toast.LENGTH_SHORT).show();
                                } else {
                                    Toast.makeText(signup2.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }

                            }
                        });

            }


        });

    }



}