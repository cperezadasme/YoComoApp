package com.example.constanza.yocomoapp;


/**
 * Created by Constanza on 09-05-17.
 */

public class receta {
    private int idImagen;
    private String nombre;
    private String ingredientes;
    private String procedimiento;
    private String categoria;
    private String tiempo;
    private String porciones;
    private String dificultad;

    public receta(int idImagen, String nombre, String ingredientes, String procedimiento, String categoria, String tiempo, String porciones, String dificultad) {
        this.idImagen = idImagen;
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.procedimiento = procedimiento;
        this.categoria = categoria;
        this.tiempo = tiempo;
        this.porciones = porciones;
        this.dificultad = dificultad;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTiempo() {
        return tiempo;
    }

    public String getPorciones() {
        return porciones;
    }

    public String getDificultad() {
        return dificultad;
    }

    public int getId(){
        return nombre.hashCode();
    }

    public static receta[] ITEMS = {
            new receta(R.drawable.im_sopaipillas,"Sopaipillas","1/2 kg de zapallo, 1 kg de harina", "Cocer el zapallo, moler, juntar con harina, sal y levadura. Luego freir", "salado", "40 minutos","4 personas","dificultad: Media"),
            new receta(R.drawable.im_fideos,"Fideos con salsa", "Fideos, tomates, cebolla y carne","picar tomate y cebolla, cocer en sarten con sal y pimienta. Cocer fideos","salado","20 minutos","4 personas", "dificultad: Facil")
    };

    public static receta getItem(int id){
        for (receta r : ITEMS){
            if (r.getId() == id){
                return r;
            }
        }
        return null;

    }
}