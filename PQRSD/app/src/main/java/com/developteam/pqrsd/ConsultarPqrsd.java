package com.developteam.pqrsd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ConsultarPqrsd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_pqrsd);
    }

    public void Inicio(View view) {
        Intent Inicio = new Intent(this, MainActivity.class);
        startActivity(Inicio);
    }

}