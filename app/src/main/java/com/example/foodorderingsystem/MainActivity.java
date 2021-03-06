package com.example.foodorderingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText emailID;
    EditText password;
    Button btnSignup,btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailID = findViewById(R.id.EmailInput);
        password = findViewById(R.id.PWInput);
        btnSignup = findViewById(R.id.SIGNUP);
        btnLogin = findViewById(R.id.LOGIN);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailID.getText().toString();
                String pwd = password.getText().toString();
                if(email.isEmpty())
                {
                    emailID.setError("Please Enter your Email");
                    emailID.requestFocus();
                }
                else if(pwd.isEmpty()){
                    password.setError("Pleae Enter the password");
                    password.requestFocus();
                }
            }
        });

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SignUP1.class);
                startActivity(i);
            }
        });

    }
}