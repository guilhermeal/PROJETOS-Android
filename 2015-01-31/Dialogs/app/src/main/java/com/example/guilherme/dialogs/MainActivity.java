package com.example.guilherme.dialogs;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Meu APP - Diálogos");
    }

    public void mostrarAlerta(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Aviso!")
                .setMessage("Alertas sao Top")
                .setCancelable(false)
                .setIcon(R.drawable.ic_user)
                .setNegativeButton("Oush!?!", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "CERTO SEU BACANA", Toast.LENGTH_LONG).show();
                    }
                })
                .setPositiveButton("OK!", new OKClickListener());

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void mostrarProgresso(View v) {

        ProgressDialog pDialog = new ProgressDialog(this);
        pDialog.setCancelable(true);
        pDialog.setTitle("Por favor, aguarde!");
        pDialog.setMessage("Buscando os dados para você...");
        pDialog.setMax(100);
        pDialog.setProgress(20);
        pDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        pDialog.show();

        pDialog.setProgress(75);
    }

    public void mostrarDialogoCustomizado(View v) {
        FragmentManager fragmentManager = getFragmentManager();
        MeuDialogo meuDialogo = new MeuDialogo();
        meuDialogo.show(fragmentManager, "meu_dialogo");
    }

}
