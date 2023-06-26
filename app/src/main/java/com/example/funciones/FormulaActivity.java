package com.example.funciones;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FormulaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formula);
    }
    
    public void calcularEcuacion (View view){

        double x1, x2;

        EditText sCoeficienteA = (EditText)findViewById(R.id.txtnum1);
        EditText sCoeficienteB = (EditText)findViewById(R.id.txtnum2);
        EditText sCoeficienteC = (EditText)findViewById(R.id.txtnum3);
        TextView sResultado = (TextView) findViewById(R.id.btncalcula);

        double a = Double.parseDouble(sCoeficienteA.getText().toString());
        double b = Double.parseDouble(sCoeficienteB.getText().toString());
        double c = Double.parseDouble(sCoeficienteC.getText().toString());

        //calculamos el determinante
        double d = ((b*b)-4*a*c);

        if(d<0){
            sResultado.setText("No existen soluciones reales");
        }
        else{
            //queda confirmar que A sea distinto de 0
            //si a=0 nos encontramos una división por cero.
            x1 = ( -b + Math.sqrt(d))/(2*a);

            x2 = ( -b - Math.sqrt(d))/(2*a);

            sResultado.setText("Solución X1: " +x1 + "\n Solución X2: "+x2);


        }
    }


}