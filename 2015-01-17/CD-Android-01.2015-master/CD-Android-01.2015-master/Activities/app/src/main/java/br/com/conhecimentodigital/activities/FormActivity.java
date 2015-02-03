package br.com.conhecimentodigital.activities;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class FormActivity extends ActionBarActivity {

    public static final int REQUEST_CODE = 0;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        editText = (EditText) findViewById(R.id.editText);
    }


    public void retornar(View v) {
        String nome = editText.getText().toString();

        Intent data = new Intent();
        data.putExtra("nome", nome);

        setResult(RESULT_OK, data);
        finish();
    }
}













