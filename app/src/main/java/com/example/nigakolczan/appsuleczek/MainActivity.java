package com.example.nigakolczan.appsuleczek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void metoda(View v){
        Intent pos = new Intent(getApplicationContext(), Posiadanev2.class);
        startActivity(pos);
    }
    protected void metoda1(View v){
        Intent wp = new Intent(getApplicationContext(), Wplanie.class);
        startActivity(wp);
    }
    Boolean onklik=true;
    protected void opcje(View v){
        if (onklik) {
            ImageView tloo = findViewById(R.id.imageView);
            tloo.setVisibility(View.VISIBLE);
            tloo.setImageResource(R.drawable.tlo);
            tloo.setScaleType(ImageView.ScaleType.FIT_XY);
            Button ostatnio = findViewById(R.id.ostatnio_dodane);
            ostatnio.setVisibility(View.VISIBLE);
            Button czcionka = findViewById(R.id.czcionka);
            czcionka.setVisibility(View.VISIBLE);
            Button rozmiar = findViewById(R.id.rozmiar);
            rozmiar.setVisibility(View.VISIBLE);
            Button tla = findViewById(R.id.tla);
            tla.setVisibility(View.VISIBLE);
            onklik=false;
        }else if(!onklik){
            ImageView tloo = findViewById(R.id.imageView);
            tloo.setVisibility(View.GONE);
            tloo.setImageResource(R.drawable.tlo);
            tloo.setScaleType(ImageView.ScaleType.FIT_XY);
            Button ostatnio = findViewById(R.id.ostatnio_dodane);
            ostatnio.setVisibility(View.GONE);
            Button czcionka = findViewById(R.id.czcionka);
            czcionka.setVisibility(View.GONE);
            Button rozmiar = findViewById(R.id.rozmiar);
            rozmiar.setVisibility(View.GONE);
            Button tla = findViewById(R.id.tla);
            tla.setVisibility(View.GONE);
            onklik=true;
            }
    }
    protected void dodawanie(View v){
        Intent plus = new Intent(getApplicationContext(), Dodawanie.class);
        startActivity(plus);
    }
    protected void wyszukiwanie (View v){
        Intent wyszukaj = new Intent(getApplicationContext(), Wyszukiwanie.class);
        startActivity(wyszukaj);
    }
}
