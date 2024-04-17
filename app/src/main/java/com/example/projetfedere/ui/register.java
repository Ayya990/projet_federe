package com.example.projetfedere.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.projetfedere.R;

public class register extends AppCompatActivity {
    private Button reg;
    private EditText nom;
    private EditText email;
    private EditText pass;
    private EditText phone;
    private EditText niveau;
    private EditText type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
        reg = findViewById(R.id.btn);
        nom = findViewById(R.id.name);
        email = findViewById(R.id.email1);
        pass = findViewById(R.id.psswd);
        phone = findViewById(R.id.number);
        niveau = findViewById(R.id.niv); // Assuming this is a Spinner for level selection
        type = findViewById(R.id.type1);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ema = email.getText().toString().trim();
                String password = pass.getText().toString().trim();
                String nam = nom.getText().toString().trim();
                String ph = phone.getText().toString().trim();
                String ni = niveau.getText().toString().trim();
                String ty = type.getText().toString().trim();
                Intent i1 =new Intent(register.this,login.class);
                startActivity(i1);
            }
        });
    }


}