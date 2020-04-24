package com.example.gasolinaouetanol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editPrecoEtanol;
    private EditText editPrecoGasolina;
    private EditText textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editPrecoEtanol = findViewById(R.id.valorEtanol);
        editPrecoGasolina = findViewById(R.id.valorGasolina);
        textResultado = findViewById(R.id.textResultado);

    }
    public void calcularPreco(View view){    //Parte Lógica
        Double precoEtanol = Double.parseDouble( editPrecoEtanol.getText().toString());
        Double precoGasolina = Double.parseDouble(editPrecoGasolina.getText().toString());

        //Validar qual vale mais
        Double resultado = precoEtanol/precoGasolina;
        if(resultado>=0.7){

            textResultado.setText("Melhor utilizar a gasolina!!!");
        }else{
            textResultado.setText("Melhor usar o Etanol!!!");
        }
    }
}
