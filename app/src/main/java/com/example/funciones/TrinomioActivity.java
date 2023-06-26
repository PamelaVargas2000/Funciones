package com.example.funciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TrinomioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trinomio);
    }
    public double calcularTrinomio (View view){

        double x1, x2;

        EditText sCoeficienteA = (EditText)findViewById(R.id.txta);
        EditText sCoeficienteB = (EditText)findViewById(R.id.txtb);
        EditText sCoeficienteC = (EditText)findViewById(R.id.txtc);
        EditText sCoeficienteX = (EditText)findViewById(R.id.txtx);
        TextView sResultado = (TextView) findViewById(R.id.btnr);

        double a = Double.parseDouble(sCoeficienteA.getText().toString());
        double b = Double.parseDouble(sCoeficienteB.getText().toString());
        double c = Double.parseDouble(sCoeficienteC.getText().toString());
        double x = Double.parseDouble(sCoeficienteC.getText().toString());
        //calculamos el determinante
        double resultado = 0.0;

        resultado = (a * Math.pow(x, 2)) + (b * x) + c;

        return resultado;
    }

}
