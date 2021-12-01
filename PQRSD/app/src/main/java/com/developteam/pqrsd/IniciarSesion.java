package com.developteam.pqrsd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);
    }
    public void Inicio(View view) {
        Intent Inicio = new Intent(this, MainActivity.class);
        startActivity(Inicio);
    }
    public void MenuAdmin(View view) {
        Intent MenuAdmin = new Intent(this, MenuAdmin.class);
        startActivity(MenuAdmin);
    }
}