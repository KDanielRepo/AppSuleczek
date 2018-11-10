package com.example.nigakolczan.appsuleczek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class Wyszukiwanie extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wyszukiwanie);
    }
    protected void wyszukiwanie_tekstu(){
        EditText autor = findViewById(R.id.szukany_autor);
        EditText tytul = findViewById(R.id.szukany_tytul);
        EditText tom = findViewById(R.id.szukany_tom);
        EditText seria = findViewById(R.id.szukana_seria);
    }
}