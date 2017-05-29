package com.example.constanza.yocomoapp;

import android.content.ContentValues;

/**
 * Created by Constanza on 09-05-17.
 */

public class Receta {
    private String id;
    private String name;
    private String ingredientes;
    private String procedimiento;
    private String tiempo;
    private String porciones;
    private String categoria;


    public Receta(String id, String name, String ingredientes, String procedimiento, String tiempo, String porciones, String categoria){
        this.id = id;
        this.name = name;
        this.ingredientes = ingredientes;
        this.procedimiento = procedimiento;
        this.tiempo = tiempo;
        this.porciones = porciones;
        this.categoria = categoria;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getPorciones() {
        return porciones;
    }

    public void setPorciones(String porciones) {
        this.porciones = porciones;
    }

    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(RecetaEntry.ID, id);
        values.put(RecetaEntry.NAME, name);
        values.put(RecetaEntry.INGREDIENTES, ingredientes);
        values.put(RecetaEntry.PROCEDIMIENTOS, procedimiento);
        values.put(RecetaEntry.PORCIONES, porciones);
        values.put(RecetaEntry.TIEMPO, tiempo);
        values.put(RecetaEntry.CATEGORIA, categoria);
        return values;
    }
}
