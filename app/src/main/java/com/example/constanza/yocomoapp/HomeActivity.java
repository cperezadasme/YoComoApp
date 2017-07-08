package com.example.constanza.yocomoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class HomeActivity extends AppCompatActivity{

    private AdapterTipoReceta adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        adapter = new AdapterTipoReceta(R.layout.tipo_receta, this);

        GridView gridview = (GridView) findViewById(R.id.GridView_tipo_receta);
        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               // Tipo_Receta tipo_actual = (Tipo_Receta)adapter.getItem(position);
                Intent intent = new Intent(HomeActivity.this, RecetasActivity.class);
                startActivity(intent);
            }
        });
    }
}