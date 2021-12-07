package com.developteam.pqrsd.BD;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.Nullable;

import com.developteam.pqrsd.entidades.Radicados;

import java.util.ArrayList;

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

    public ArrayList<Radicados> mostrarRadicados(){

        BdHelper bdHelper = new BdHelper(context);
        SQLiteDatabase bd = bdHelper.getWritableDatabase();

        ArrayList<Radicados> listaRadicados = new ArrayList<>();
        Radicados radicado = null;
        Cursor cursorRadicados = null;

        cursorRadicados = bd.rawQuery("SELECT * FROM " + TABLE_RADICADOS, null);

        if (cursorRadicados.moveToFirst()){
            do {
                radicado = new Radicados();
                radicado.setId(cursorRadicados.getInt(0));
                radicado.setNombre(cursorRadicados.getString(1));
                radicado.setCedula(cursorRadicados.getString(2));
                radicado.setTelefono(cursorRadicados.getString(3));
                radicado.setE_mail(cursorRadicados.getString(4));
                radicado.setTipo(cursorRadicados.getString(5));
                radicado.setAsunto(cursorRadicados.getString(6));
                radicado.setDescripcion(cursorRadicados.getString(7));
                radicado.setRespuesta(cursorRadicados.getString(9));
                listaRadicados.add(radicado);
            } while (cursorRadicados.moveToNext());
        }

        cursorRadicados.close();

        return listaRadicados;
    }
}
