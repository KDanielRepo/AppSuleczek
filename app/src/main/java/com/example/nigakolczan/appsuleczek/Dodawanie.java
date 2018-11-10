package com.example.nigakolczan.appsuleczek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Dodawanie extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dodawanie);
        Gdzie();
    }
    protected void dodawanietekstu(){
        EditText autor = findViewById(R.id.autor);
        EditText tytul = findViewById(R.id.tytul);
        EditText tom = findViewById(R.id.tom);
        EditText seria = findViewById(R.id.seria);
    }
    protected void gdzie(View v){
        Gdzie();
    }
    protected void Gdzie(){
        Button gdzie = findViewById(R.id.gdzie);
        if (dokad){
            gdzie.setText("Posiadane");
            dokad = false;
        }
        else if (!dokad){
            gdzie.setText("w planie");
            dokad = true;
        }
    }
    Boolean dokad=true;

}
