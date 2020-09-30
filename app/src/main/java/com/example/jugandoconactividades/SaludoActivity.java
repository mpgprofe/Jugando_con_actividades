package com.example.jugandoconactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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

        nombre.setText("Hola " +nombrDeFuera);



        volver = findViewById(R.id.buttonVolver);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}