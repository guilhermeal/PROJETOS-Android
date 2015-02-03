package com.example.guilhermealmeida.calculadora;

import android.annotation.SuppressLint;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends ActionBarActivity

    implements View.OnClickListener {
    EditText edtTexto;
    double valorTotal;
    double valorMemoria;
    char limparTela;
    String operacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTexto = (EditText) findViewById(R.id.editText);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);

        Button button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);

        Button button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);

        Button button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);

        Button button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);

        Button buttonPonto = (Button) findViewById(R.id.buttonponto);
        buttonPonto.setOnClickListener(this);


        Button buttonMulti = (Button) findViewById(R.id.buttonmultiplicar);
        buttonMulti.setOnClickListener(this);

        Button buttonDivi = (Button) findViewById(R.id.buttondividir);
        buttonDivi.setOnClickListener(this);


        Button buttonSoma = (Button) findViewById(R.id.buttonmais);
        buttonSoma.setOnClickListener(this);

        Button buttonSubt = (Button) findViewById(R.id.buttonmenos);
        buttonSubt.setOnClickListener(this);

        Button buttonIgual = (Button) findViewById(R.id.buttonigual);
        buttonIgual.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()) {

            case R.id.buttonponto: {
                if(limparTela == 1) { edtTexto.setText(""); } else { limparTela = 0; }
                String retorno =  ".";
                String texto = edtTexto.getText().toString();
                String concat = texto + retorno;
                edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button1: {
                if(limparTela == 1) { edtTexto.setText(""); } else { limparTela = 0; }
                String retorno =  "1";
                String texto = edtTexto.getText().toString();
                String concat = texto + retorno;
                edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button2: {
                if(limparTela == 1) { edtTexto.setText(""); } else { limparTela = 0; }
                String retorno =  "2";
                String texto = edtTexto.getText().toString();
                String concat = texto + retorno;
                edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button3: {
                if(limparTela == 1) { edtTexto.setText(""); } else { limparTela = 0; }
                String retorno =  "3";
                String texto = edtTexto.getText().toString();
                String concat = texto + retorno;
                edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button4: {
                if(limparTela == 1) { edtTexto.setText(""); } else { limparTela = 0; }
                String retorno =  "4";
                String texto = edtTexto.getText().toString();
                String concat = texto + retorno;
                edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button5: {
                if(limparTela == 1) { edtTexto.setText(""); } else { limparTela = 0; }
                String retorno =  "5";
                String texto = edtTexto.getText().toString();
                String concat = texto + retorno;
                edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button6: {
                if(limparTela == 1) { edtTexto.setText(""); } else { limparTela = 0; }
                String retorno =  "6";
                String texto = edtTexto.getText().toString();
                String concat = texto + retorno;
                edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button7: {
                if(limparTela == 1) { edtTexto.setText(""); } else { limparTela = 0; }
                String retorno =  "7";
                String texto = edtTexto.getText().toString();
                String concat = texto + retorno;
                edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button8: {
                if(limparTela == 1) { edtTexto.setText(""); } else { limparTela = 0; }
                String retorno =  "8";
                String texto = edtTexto.getText().toString();
                String concat = texto + retorno;
                edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button9: {
                if(limparTela == 1) { edtTexto.setText(""); } else { limparTela = 0; }
                String retorno =  "9";
                String texto = edtTexto.getText().toString();
                String concat = texto + retorno;
                edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.button0: {
                if(limparTela == 1) { edtTexto.setText(""); } else { limparTela = 0; }
                String retorno =  "0";
                String texto = edtTexto.getText().toString();
                String concat = texto + retorno;
                edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.buttonmais: {

                //String retorno =  "+";
                String texto = edtTexto.getText().toString();
                valorMemoria = Double.parseDouble(texto);
                limparTela = 1;
                operacao = "soma";
                //String concat = texto + retorno;
                //edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.buttonmenos: {
                //String retorno =  "-";
                String texto = edtTexto.getText().toString();
                valorMemoria = Double.parseDouble(texto);
                limparTela = 1;
                operacao = "subtrai";
                //String texto = edtTexto.getText().toString();
                //String concat = texto + retorno;
                //edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.buttonmultiplicar: {
                //String retorno =  "*";
                String texto = edtTexto.getText().toString();
                valorMemoria = Double.parseDouble(texto);
                limparTela = 1;
                operacao = "multiplica";
                //String texto = edtTexto.getText().toString();
                //String concat = texto + retorno;
                //edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.buttondividir: {
                //String retorno =  "/";
                String texto = edtTexto.getText().toString();
                valorMemoria = Double.parseDouble(texto);
                limparTela = 1;
                operacao = "divide";
                //String texto = edtTexto.getText().toString();
                //String concat = texto + retorno;
                //edtTexto.setText(concat);
                //Toast.makeText(this, retorno, Toast.LENGTH_SHORT).show();
                break;
            }
            case R.id.buttonigual: {
                String texto = edtTexto.getText().toString();
                switch (operacao) {
                    case "soma": {
                        valorTotal = valorMemoria + (Double.parseDouble(texto));
                        break;
                    }
                    case "subtrai": {
                        valorTotal = valorMemoria - (Double.parseDouble(texto));
                        break;
                    }
                    case "multiplica": {
                        valorTotal = valorMemoria * (Double.parseDouble(texto));
                        break;
                    }
                    case "divide": {
                        valorTotal = valorMemoria / (Double.parseDouble(texto));
                        break;
                    }
                }
                String total = String.valueOf(valorTotal);
                //String total = String.valueOf(total2);
                // Toast.makeText(this, protein, Toast.LENGTH_SHORT).show();
                edtTexto.setText(total);
                break;
            }

        }
    }
}
