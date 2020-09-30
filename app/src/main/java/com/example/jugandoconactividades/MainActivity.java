package com.example.jugandoconactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button lanzar;
    EditText nombre;

    public static final String NOMBRE = "Nombre";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lanzar = findViewById(R.id.button);
        nombre = findViewById(R.id.editTextTextPersonName);

        lanzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(MainActivity.this, SaludoActivity.class);
                intento.putExtra(NOMBRE, nombre.getText().toString());

                startActivity(intento); //Lanza la nueva actividad.
            }
        });
    }
}