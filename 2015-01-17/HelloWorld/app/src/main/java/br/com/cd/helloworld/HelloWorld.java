package br.com.cd.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by cd-108 on 10/01/2015.
 */
public class HelloWorld extends Activity {

    private TextView texto;
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world);

        texto = (TextView)findViewById(R.id.texto);
        input = (EditText)findViewById(R.id.input);
    }

    public void trocarTexto(View view)
    {
        String novotexto = input.getText().toString();
        texto.setText(novotexto);

        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("nome",novotexto);

        startActivity(intent);

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"Pausado",Toast.LENGTH_LONG);
    }
}
