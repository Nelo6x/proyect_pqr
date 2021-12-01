package com.developteam.pqrsd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.developteam.pqrsd.BD.Bdradicar;

public class RadicarPqrsd extends AppCompatActivity {

    EditText txtNombre, txtCedula, txtTelefono, txtE_mail, txtTipo, txtAsunto, txtDescripcion;
    Button btnGuardar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radicar_pqrsd);


        txtNombre = findViewById(R.id.txtNombre);
        txtCedula = findViewById(R.id.txtCedula);
        txtTelefono = findViewById(R.id.txtTelefono);
        txtE_mail = findViewById(R.id.txtE_mail);
        txtTipo = findViewById(R.id.txtTipo);
        txtAsunto = findViewById(R.id.txtAsunto);
        txtDescripcion = findViewById(R.id.txtDescripcion);
        btnGuardar = findViewById(R.id.btnGuardar);

        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bdradicar bdradicar = new Bdradicar(RadicarPqrsd.this);
                long id = bdradicar.insertarRadicado(txtNombre.getText().toString(), txtCedula.getText().toString(), txtTelefono.getText().toString(), txtE_mail.getText().toString(), txtTipo.getText().toString(), txtAsunto.getText().toString(), txtDescripcion.getText().toString());
                if (id > 0){
                    Toast.makeText(RadicarPqrsd.this, "PQRSD RADICADA BAJO EL NUMERO: " + id, Toast.LENGTH_LONG).show();
                    limpiar();
                }else {
                    Toast.makeText(RadicarPqrsd.this, "ERROR AL RADICAR PQRSD", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void limpiar(){
        txtNombre.setText("");
        txtCedula.setText("");
        txtTelefono.setText("");
        txtE_mail.setText("");
        txtTipo.setText("");
        txtAsunto.setText("");
        txtDescripcion.setText("");
    }

    public void Inicio(View view) {
        Intent Inicio = new Intent(this, MainActivity.class);
        startActivity(Inicio);
    }

}