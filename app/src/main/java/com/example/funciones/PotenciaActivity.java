package com.example.funciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PotenciaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potencia);
    }
    public double calcularPotencia(View view){
    EditText sCoeficienteA = (EditText)findViewById(R.id.txtn1);
    EditText sCoeficienteB = (EditText)findViewById(R.id.txtn2);

    TextView sResultado = (TextView) findViewById(R.id.btnres);

    double base = Double.parseDouble(sCoeficienteA.getText().toString());
    double exponente = Double.parseDouble(sCoeficienteB.getText().toString());

        return Math.pow(base, exponente);
    }
}