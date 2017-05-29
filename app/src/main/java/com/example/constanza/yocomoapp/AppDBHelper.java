package com.example.constanza.yocomoapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Constanza on 09-05-17.
 */

public class AppDBHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "recetas.db";
    //  public static final String TABLE_NAME = "Recetas";

    /**
     * public static final String COLUMN_ID = "id";
     * public static final String COLUMN_NAME = "name";
     * public static final String COLUMN_INGREDIENTES = "ingredientes";
     * public static final String COLUMN_PROCEDIMIENTOS = "procedimientos";
     * public static final String COLUMN_TIEMPO = "tiempo";
     * public static final String COLUMN_PORCIONES = "porciones";
     * public static final String COLUMN_CATEGORIA = "categoria";
     * <p>
     * <p>
     * private static final String CREATE_TABLE_RECETAS ="CREATE TABLE " +
     * "Recetas(" +
     * COLUMN_ID + " TEXT, " +
     * "UNIQUE ("+ COLUMN_ID +")" +
     * COLUMN_CATEGORIA + " TEXT " +
     * COLUMN_NAME + " TEXT, " +
     * COLUMN_INGREDIENTES + " TEXT, " +
     * COLUMN_PROCEDIMIENTOS + " TEXT, " +
     * COLUMN_TIEMPO + " TEXT, " +
     * COLUMN_PORCIONES + " TEXT)";
     */


    public AppDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + RecetaEntry.TABLE_NAME + " ("
                + RecetaEntry.ID + " TEXT NOT NULL,"
                + RecetaEntry.NAME + " TEXT NOT NULL,"
                + RecetaEntry.INGREDIENTES + " TEXT NOT NULL,"
                + RecetaEntry.PROCEDIMIENTOS + " TEXT NOT NULL,"
                + RecetaEntry.PORCIONES + " TEXT NOT NULL,"
                + RecetaEntry.TIEMPO + " TEXT,"
                + RecetaEntry.CATEGORIA + " TEXT, "
                + "UNIQUE (" + RecetaEntry.ID + "))");


        //  db.execSQL(CREATE_TABLE_RECETAS);
        mockData(db);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void mockData(SQLiteDatabase sqLiteDatabase) {
        mockReceta(sqLiteDatabase, new Receta("1", "Panqueques",
                "Harina, huevos, manjar", "Mezclar todo",
                "15 minutos", "5 porciones", "dulce"));

        mockReceta(sqLiteDatabase, new Receta("2", "Arepas",
                "Harina Pan, agua, sal y azucar", "Mezclar y dar forma.",
                "10 minutos", "2 porciones", "salado"));
        mockReceta(sqLiteDatabase, new Receta("3", "Batido",
                "Leche, hielo, fruta", "Mezclar.",
                "5 minutos", "1 porcion", "batido"));
    }

    public long mockReceta(SQLiteDatabase db, Receta receta) {
        return db.insert(
                RecetaEntry.TABLE_NAME,
                null,
                receta.toContentValues());
    }
}

