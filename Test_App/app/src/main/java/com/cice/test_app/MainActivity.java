package com.cice.test_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText altura = findViewById(R.id.alturaText);
        altura.setHint("Introduce tu altura");

        final EditText peso = findViewById(R.id.pesoText);
        peso.setHint("Introduce tu peso");

        final TextView resultado = findViewById(R.id.resultado);
        //resultado.setText("0");

        final Button btn = findViewById(R.id.button);
        //btn.setText(CharSequence "Calcular".);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double alturaDada;
                Double pesoDado;
                Double resultadoIMC;

                String a = altura.getText().toString();
                String p = peso.getText().toString();


                if (!a.isEmpty() && !p.isEmpty()){
                    try{
                        alturaDada = Double.valueOf(a);
                        pesoDado = Double.valueOf(p);
                        resultadoIMC = pesoDado / (alturaDada * alturaDada);
                        Log.d("click", resultadoIMC.toString());
                        resultado.setText(resultadoIMC.toString());
                    } catch (Throwable e){
                        Toast.makeText(MainActivity.this, "Añade un numero capullo", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Rellena los dos campos", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }



}
