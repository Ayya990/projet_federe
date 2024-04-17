package com.example.projetfedere.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.projetfedere.R;

public class login extends AppCompatActivity {
    private EditText email;
    private EditText psswd;
    private Button log;
    private Button sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        psswd = findViewById(R.id.password);
        log = findViewById(R.id.login);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ema = email.getText().toString().trim();
                String password = psswd.getText().toString().trim();
                Intent i1 =new Intent(login.this, register.class);
                startActivity(i1);
            }
        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ema = email.getText().toString().trim();
                String password = psswd.getText().toString().trim();
                Intent i1 =new Intent(login.this, dash.class);
                startActivity(i1);
            }
        });
    }
}