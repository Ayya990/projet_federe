package com.example.projetfedere.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.projetfedere.R;

public class RegisterActivity2 extends AppCompatActivity {
    String[] items = {"professeur", "Etudiant"};
    String[] items2 = {"1", "2", "3"};
    AutoCompleteTextView autoCompleteTextView;
    AutoCompleteTextView autoCompleteTextView2;
    ArrayAdapter<String> adapterItems;
    ArrayAdapter<String> adapterItems2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        autoCompleteTextView = findViewById(R.id.auto_complete_textview);
        autoCompleteTextView2 = findViewById(R.id.auto_complete_textview2);
        adapterItems = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, items);
        adapterItems2 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, items2);
        autoCompleteTextView.setAdapter(adapterItems);
        autoCompleteTextView2.setAdapter(adapterItems2);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(RegisterActivity2.this, "Item: " + item, Toast.LENGTH_SHORT).show(); // Correction: Utilisez RegisterActivity2.this
            }
        });
    }
}


