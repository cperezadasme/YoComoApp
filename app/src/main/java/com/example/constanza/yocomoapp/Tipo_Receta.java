package com.example.constanza.yocomoapp;

import android.support.annotation.Nullable;

/**
 * Created by Constanza on 20-05-17.
 */

public class Tipo_Receta {
    private String nombre;
    private int id_imagen;

    public Tipo_Receta(String nombre, int id_imagen) {
        this.nombre = nombre;
        this.id_imagen = id_imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId_imagen() {
        return id_imagen;
    }

    public void setId_imagen(int id_imagen) {
        this.id_imagen = id_imagen;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public static Tipo_Receta[] ITEMS = {
            new Tipo_Receta("dulces", R.drawable.postres),
            new Tipo_Receta("batidos", R.drawable.batidos),
            new Tipo_Receta("ensaladas", R.drawable.ensalada),
            new Tipo_Receta("salado", R.drawable.salado),
    };

    @Nullable
    public static  Tipo_Receta getItem(int id) {
        for (Tipo_Receta item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
