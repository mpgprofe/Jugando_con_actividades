package com.example.jugandoconactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class SaludoActivity extends AppCompatActivity {
    Button volver;
    TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        Intent intentoDeFuera = getIntent();

        nombre = findViewById(R.id.textViewNombre);


        String nombrDeFuera = intentoDeFuera.getStringExtra(MainActivity.NOMBRE);

        nombre.setText(getResources().getText(R.string.saludo) +" "+nombrDeFuera);
        Log.e("SALUDO", getString(R.string.mensaje1));


        volver = findViewById(R.id.buttonVolver);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent();
                String fecha = "";
                Date date = new Date();
                fecha = date.toString();
                intento.putExtra(MainActivity.FECHA, fecha);
                setResult(RESULT_OK, intento);
                finish();
            }
        });
    }
}