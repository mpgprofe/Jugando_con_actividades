package com.example.jugandoconactividades;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button lanzar;
    EditText nombre;

    public static final String ETIQUETA = "Main";
    public static final String NOMBRE = "Nombre";

    public static final int CODIGO_VUELTA_SALUDO = 10;
    public static final String FECHA = "Fechaaksjhdlfajhsldkfjhakljh";

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

               // startActivity(intento); //Lanza la nueva actividad que no devuelve valor

                startActivityForResult(intento, CODIGO_VUELTA_SALUDO);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == CODIGO_VUELTA_SALUDO && resultCode == RESULT_OK){
            String fecha = data.getStringExtra(FECHA);

            Log.i(ETIQUETA, "Fecha de vuelta "+fecha);
            nombre.setText(fecha);
        }
    }
}