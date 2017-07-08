package com.example.constanza.yocomoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class detalleActivity extends AppCompatActivity {

    public static final String EXTRA_ID = "id";
    private receta receta_detallada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detalle_receta);

        Intent intent = getIntent();
        receta_detallada = receta.getItem(intent.getIntExtra(EXTRA_ID,0));

        if (receta_detallada != null){
            ImageView imagen = (ImageView)findViewById(R.id.ImageView_receta_detallada);
            if (imagen != null){
                imagen.setImageResource(receta_detallada.getIdImagen());
            }

            TextView titulo = (TextView) findViewById(R.id.TextView_titulo_detallado);
            if (titulo != null){
                titulo.setText(receta_detallada.getNombre());
            }
            TextView tiempo = (TextView) findViewById(R.id.TextView_Tiempo_detallado);
            if (tiempo != null){
                tiempo.setText(receta_detallada.getTiempo());
            }
            TextView porciones = (TextView) findViewById(R.id.TextView_Porciones_detallado);
            if (porciones != null){
                porciones.setText(receta_detallada.getPorciones());
            }
            TextView dificultad = (TextView) findViewById(R.id.TextView_Dificultad_detallado);
            if (dificultad != null){
                dificultad.setText(receta_detallada.getDificultad());
            }
            TextView procedimiento = (TextView) findViewById(R.id.TextView_procedimiento);
            if (procedimiento != null){
                procedimiento.setText(receta_detallada.getProcedimiento());
            }
            TextView ingredientes = (TextView) findViewById(R.id.TextView_ingredientes);
            if (ingredientes != null){
                ingredientes.setText(receta_detallada.getIngredientes());
            }
        }
        ImageView imagen = (ImageView) findViewById(R.id.ImageView_receta_detallada);
        imagen.setImageResource(receta_detallada.getIdImagen());

    }
}
