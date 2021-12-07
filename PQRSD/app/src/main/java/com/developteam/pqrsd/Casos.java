package com.developteam.pqrsd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.developteam.pqrsd.BD.Bdradicar;
import com.developteam.pqrsd.adaptadores.ListaRadicadosAdapter;
import com.developteam.pqrsd.entidades.Radicados;

import java.util.ArrayList;

public class Casos extends AppCompatActivity {

    RecyclerView listaRadicados;
    ArrayList<Radicados> listaArrayRadicados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_casos);
        listaRadicados = findViewById(R.id.listaRadicados);
        listaRadicados.setLayoutManager(new LinearLayoutManager(this));

        Bdradicar bdradicar = new Bdradicar(Casos.this);

        listaArrayRadicados = new ArrayList<>();

        ListaRadicadosAdapter adapter = new ListaRadicadosAdapter(bdradicar.mostrarRadicados());
        listaRadicados.setAdapter(adapter);
    }
}