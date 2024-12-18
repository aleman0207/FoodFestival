package com.example.foodfestival;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class VisorDeRestaurante extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_de_restaurante);

        ImageView img = (ImageView) findViewById(R.id.ImagenCompleta);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if(b!=null) {
            img.setImageResource(b.getInt("IMG"));
        }


    }
}