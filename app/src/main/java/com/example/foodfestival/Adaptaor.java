package com.example.foodfestival;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class Adaptaor extends BaseAdapter  {


    private static LayoutInflater inflater = null;

    Context contexto;
    String [][] datos;

    int [] datosImg;

public Adaptaor(Context contexto, String [][] datos, int [] imagenes){

    this.contexto=contexto;
    this.datos=datos;
    this.datosImg=imagenes;
    inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);





}



    @Override
    public View getView(int i, View convertView, ViewGroup parent) {

        final View vista = inflater.inflate(R.layout.elmento_lista, null);

        TextView nombre = (TextView) vista.findViewById(R.id.nombres);
        TextView tipo = (TextView) vista.findViewById(R.id.tipo);

        ImageView imagen = (ImageView) vista.findViewById(R.id.imageView2);
        RatingBar calificacion = (RatingBar) vista.findViewById(R.id.ratingBar);


        nombre.setText(datos[i][0]);
        tipo.setText(datos[i][1]);
        imagen.setImageResource(datosImg[i]);
        calificacion.setProgress(Integer.valueOf(datos[i][2]));


        imagen.setTag(i);

        imagen.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                Intent visorImagen = new Intent(contexto, VisorDeRestaurante.class);
                visorImagen.putExtra("IMG", datosImg[(Integer)v.getTag()]);
                contexto.startActivity(visorImagen);
            }
        });

        return vista;
    }



    @Override
    public int getCount() {
        return datosImg.length;
    }


    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

}

