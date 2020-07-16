package com.example.projetocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1; // valor 1
    EditText ed2; // valor 2
    EditText edR; // resultado
    Button sm; // soma
    Button sb; // subtracao
    Button mt; // multiplicacao
    Button dv; // divisao
    Button pt; // potencia
    Button pc; // porcentagem
    Button sq; // raiz
    Button md; // mod
    Button lp; // limpar tela

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText)findViewById(R.id.editTextValor1);
        ed2 = (EditText)findViewById(R.id.editTextValor2);
        edR = (EditText)findViewById(R.id.editTextResultado);

        sm = (Button)findViewById(R.id.buttonSoma);
        sb = (Button)findViewById(R.id.buttonSubtr);
        mt = (Button)findViewById(R.id.buttonMulti);
        dv = (Button)findViewById(R.id.buttonDiv);
        pt = (Button)findViewById(R.id.buttonPot);
        pc = (Button)findViewById(R.id.buttonPercent);
        sq = (Button)findViewById(R.id.buttonSqrt);
        md = (Button)findViewById(R.id.buttonMod);
        lp = (Button)findViewById(R.id.buttonClean);


        sm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1; // valor 1
                Double v2; // valor 2
                Double res; // resultado
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                res = v1 + v2;
                edR.setText(res.toString());
            }
        });

        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1; // valor 1
                Double v2; // valor 2
                Double res; // resultado
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                res = v1 - v2;
                edR.setText(res.toString());
            }
        });

        mt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1; // valor 1
                Double v2; // valor 2
                Double res; // resultado
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                res = v1 * v2;
                edR.setText(res.toString());
            }
        });

        dv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1; // valor 1
                Double v2; // valor 2
                Double res; // resultado
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                res = v1 / v2;
                edR.setText(res.toString());
            }
        });

        pt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1; // valor 1
                Double v2; // valor 2
                Double res; // resultado
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                res = Math.pow(v1,v2) ;
                edR.setText(res.toString());
            }
        });

        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1; // valor 1
                Double v2; // valor 2
                Double res; // resultado
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                res = (v1*v2)/100;
                edR.setText(res.toString());
            }
        });

        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v2; // valor 2
                Double res; // resultado
                v2 = Double.parseDouble(ed2.getText().toString());
                res = Math.sqrt(v2);
                edR.setText(res.toString());
            }
        });

        md.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double v1; // valor 1
                Double v2; // valor 2
                Double res; // resultado
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                res = (v1 % v2);
                edR.setText(res.toString());
            }
        });

        lp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
                ed2.setText("");
                edR.setText("");
            }
        });
    }

}
