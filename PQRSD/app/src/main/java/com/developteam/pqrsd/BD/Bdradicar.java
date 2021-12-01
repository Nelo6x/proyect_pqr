package com.developteam.pqrsd.BD;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

public class Bdradicar  extends BdHelper {

    Context context;

    public Bdradicar(@Nullable Context context) {
        super(context);
        this.context = context;
    }

    public long insertarRadicado(String nombre, String cedula, String telefono, String e_mail, String tipo, String asunto, String descripcion){

        long id = 0;

        try {
            BdHelper bdHelper = new BdHelper(context);
            SQLiteDatabase bd = bdHelper.getWritableDatabase();

            ContentValues values = new ContentValues();
            values.put("nombre", nombre);
            values.put("cedula", cedula);
            values.put("telefono", telefono);
            values.put("e_mail", e_mail);
            values.put("tipo", tipo);
            values.put("asunto", asunto);
            values.put("descripcion", descripcion);

            id = bd.insert(TABLE_RADICADOS, null, values);

        }catch (Exception ex){
            ex.toString();
        }
        return id;
    }
}
