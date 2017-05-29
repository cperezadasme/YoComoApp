package com.example.constanza.yocomoapp;

import android.provider.BaseColumns;

//eliminar

//public class RecetasContract {

    public  abstract class RecetaEntry implements BaseColumns {
        public static final String TABLE_NAME ="Recetas";
        public static final String ID = "id";
        public static final String NAME = "name";
        public static final String INGREDIENTES = "ingredientes";
        public static final String PROCEDIMIENTOS = "procedimientos";
        public static final String TIEMPO = "tiempo";
        public static final String PORCIONES = "porciones";
        public static final String CATEGORIA = "categoria";
    }
//}

