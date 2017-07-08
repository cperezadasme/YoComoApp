package com.example.constanza.yocomoapp;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Constanza on 04-07-17.
 */

public class recetaAdapter extends BaseAdapter {

    private int layout_view;
    private Context context;

    public recetaAdapter(int layout_view, Context context) {
        super();
        this.layout_view = layout_view;
        this.context = context;
    }

    @Override
    public int getCount() {
        return receta.ITEMS.length;
    }

    @Override
    public Object getItem(int position) {
        return receta.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            LayoutInflater view = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = view.inflate(layout_view,null);
        }

        onReceta (getItem(position),convertView);

        return convertView;
    }

    public void onReceta(Object o, View convertView) {
        if (o != null){
            ImageView imagen = (ImageView)convertView.findViewById(R.id.ImageView_receta);
            if (imagen != null){
                imagen.setImageResource(((receta)o).getIdImagen());
            }

            TextView titulo = (TextView) convertView.findViewById(R.id.TextView_Titulo);
            if (titulo != null){
                titulo.setText(((receta) o).getNombre());
            }
            TextView tiempo = (TextView) convertView.findViewById(R.id.TextView_Tiempo);
            if (tiempo != null){
                tiempo.setText(((receta)o).getTiempo());
            }
            TextView porciones = (TextView) convertView.findViewById(R.id.TextView_Porciones);
            if (porciones != null){
                porciones.setText(((receta)o).getPorciones());
            }
            TextView dificultad = (TextView) convertView.findViewById(R.id.TextView_Dificultad);
            if (dificultad != null){
                dificultad.setText(((receta)o).getDificultad());
            }
        }
    }

}
