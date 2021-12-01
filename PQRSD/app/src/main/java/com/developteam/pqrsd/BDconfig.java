package com.developteam.pqrsd;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.developteam.pqrsd.BD.BdHelper;

public class BDconfig extends AppCompatActivity {

    Button BotonActualizarBD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bdconfig);
        BotonActualizarBD = findViewById(R.id.BotonActualizarBD);

        BotonActualizarBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BdHelper bdHelper = new BdHelper(BDconfig.this);
                SQLiteDatabase bd = bdHelper.getWritableDatabase();
                if(bd != null){
                    Toast.makeText(getApplicationContext(), "Base de datos actualizada", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),"Error al actualizar base de datos", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}