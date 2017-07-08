package com.example.constanza.yocomoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by Constanza on 20-05-17.
 */

public class AdapterTipoReceta extends BaseAdapter{
    private int layout_view;
    private Context context;

    public AdapterTipoReceta(int layout_view, Context context) {
        this.layout_view = layout_view;
        this.context = context;
    }

    public int getCount(){
        return Tipo_Receta.ITEMS.length;
    }

    @Override
    public Tipo_Receta getItem(int position) {
        return Tipo_Receta.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater view = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = view.inflate(layout_view, null);
        }
            /*
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(500, 400));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(ITEMS[position]);
        */
        onTipoReceta(getItem(position),convertView);

        //return imageView;
        return convertView;
    }

    public void onTipoReceta(Object o,View convertView){
        if (o!=null){
            ImageView imagen = (ImageView)convertView.findViewById(R.id.imageView_tipo_receta);
            if (imagen!=null){
                imagen.setImageResource(((Tipo_Receta)o).getId_imagen());
            }
            TextView nombre = (TextView)convertView.findViewById(R.id.textView_nombre_tipo_receta);
            if (nombre!=null){
                nombre.setText(((Tipo_Receta)o).getNombre());
            }
        }

    }
    /* Arreglar
    public View getView(int position, View view, ViewGroup viewGroup) {

       ImageView imageView;
        if (view == null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(90,90));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);

        }
        else {
            imageView = (ImageView) view;
        }

        ImageView imagen_Tipo = (ImageView) view.findViewById(R.id.imagen_Tipo);
        TextView nombre_Tipo = (TextView) view.findViewById(R.id.nombre_Tipo);

        //final Tipo_Receta item = getItem(position);
        imagen_Tipo.setImageResource(ITEMS[position].getId_imagen());
        nombre_Tipo.setText(ITEMS[position].getNombre());

        return imageView;*/
/*
    private Tipo_Receta[] ITEMS = {
            new Tipo_Receta("dulces", R.drawable.postres),
            new Tipo_Receta("batidos", R.drawable.batidos),
            new Tipo_Receta("ensaladas", R.drawable.ensalada),
            new Tipo_Receta("salado", R.drawable.salado),
    };

    private  Integer[] ITEMS = {
            R.drawable.postres, R.drawable.batidos, R.drawable.ensalada, R.drawable.salado
    };
    */

}
