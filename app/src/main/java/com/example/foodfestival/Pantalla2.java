package com.example.foodfestival;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Pantalla2 extends AppCompatActivity {

    ListView lista;

    String[][] datos = {
            {"La Cocina del Sol", "Mediterránea", "8"},
            {"Sabor Mexicano", "Mexicana", "9"},
            {"Fusion Sushi", "Japonesa y Fusión", "8"},
            {"Pizzería Italia", "Italiana (Pizzas)", "9"},
    };

    int[] datosImg = {R.drawable.restau, R.drawable.restau , R.drawable.restau , R.drawable.restau};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);

        // Inicializar la variable lista
        lista = findViewById(R.id.recomendaciones);

        // Crear adaptador personalizado
        Adaptaor adaptador = new Adaptaor(this, datos, datosImg);

        // Configurar adaptador en la lista
        lista.setAdapter(adaptador);
    }
}
