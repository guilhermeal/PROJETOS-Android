package br.com.conhecimentodigital.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Toast;



public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostraForm(View v) {
        Intent intent = new Intent(this, FormActivity.class);
        startActivityForResult(intent, FormActivity.REQUEST_CODE);
    }

    public void mostrarLista(View v) {
        Intent intent = new Intent(this, AlunosActivity.class);
        startActivity(intent);
    }

    public void ligarParaProfessor(View v) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:+558288417959"));

        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Toast.makeText(this, "Nome: " + data.getStringExtra("nome"), Toast.LENGTH_LONG).show();

    }


}














