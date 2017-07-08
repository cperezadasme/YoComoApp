package com.example.constanza.yocomoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class RecetasActivity extends AppCompatActivity {
    private recetaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_recetas);

        Intent intent = getIntent();
        adapter = new recetaAdapter(R.layout.receta, this);
        ListView lista = (ListView)findViewById(R.id.ListView_lista_recetas);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                receta receta_actual = (receta) adapter.getItem(position);
                Intent intent = new Intent(RecetasActivity.this, detalleActivity.class);
                intent.putExtra(detalleActivity.EXTRA_ID, receta_actual.getId());
                startActivity(intent);



            }
        });

    }
}
