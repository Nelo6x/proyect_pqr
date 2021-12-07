package com.developteam.pqrsd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuAdmin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_admin);
    }
    public void Inicio(View view) {
        Intent Inicio = new Intent(this, MainActivity.class);
        startActivity(Inicio);
    }

    public void BDconfig(View view) {
        Intent BDconfig = new Intent(this, BDconfig.class);
        startActivity(BDconfig);
    }

    public void Casos(View view) {
        Intent Casos = new Intent(this, Casos.class);
        startActivity(Casos);
    }
}