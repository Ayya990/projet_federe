package com.example.projetfedere.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetfedere.R;
import com.example.projetfedere.ui.RegisterActivity2;

public class login extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onLoginClick(View view) {
        startActivity(new Intent(this, RegisterActivity2.class));
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
    }
}
