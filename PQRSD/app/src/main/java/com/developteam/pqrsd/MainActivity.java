package com.developteam.pqrsd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Inicio(View view) {
        Intent Inicio = new Intent(this, MainActivity.class);
        startActivity(Inicio);
    }
    public void RadicarPQRSD(View view) {
        Intent RadicarPQRSD = new Intent(this, RadicarPqrsd.class);
        startActivity(RadicarPQRSD);
    }

    public void ConsultarPQRSD(View view) {
        Intent ConsultarPQRSD = new Intent(this, ConsultarPqrsd.class);
        startActivity(ConsultarPQRSD);
    }

    public void IniciarSesion(View view) {
        Intent IniciarSesion = new Intent(this, IniciarSesion.class);
        startActivity(IniciarSesion);
    }

}