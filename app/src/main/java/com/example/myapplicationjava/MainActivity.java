package com.example.myapplicationjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtValor1;

    EditText txtValor2;
    RadioGroup radioGrupo;
    TextView lblResultado;
    double Num1, Num2, result ;
    int Op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtValor1 = findViewById(R.id.txtValor1);
        txtValor2 = findViewById(R.id.txtValor2);
        radioGrupo = findViewById(R.id.radioGrupo);
        lblResultado = findViewById(R.id.lblResultado);


        radioGrupo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int i) {
                if (i == R.id.optSoma)
                    Op=1;
                else {
                    if (i == R.id.optSubtrai)
                        Op=2;
                    else {
                        if (i == R.id.optDivide)
                            Op = 3;
                        else {
                            Op= 4;
                        }
                    }
                }
            }
        });

    }

    public void calcular (View v){
        Num1 = Double.parseDouble(txtValor1.getText().toString());
        Num2 = Double.parseDouble(txtValor2.getText().toString());

        if (Op == 1 ){
        result = Num1 + Num2;
        }else {
            if (Op == 2) {
                result = Num1 - Num2;
            }else {
                if (Op == 3) {
                    result = Num1 / Num2;
                }else {
                    result = Num1 * Num2;
                }
            }
        }

        lblResultado.setText("Resultado"+ result);

    }

}