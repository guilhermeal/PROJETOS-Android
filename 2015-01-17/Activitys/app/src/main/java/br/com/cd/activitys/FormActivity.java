package br.com.cd.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by cd-108 on 17/01/2015.
 */
public class FormActivity extends ActionBarActivity{

    public static final int REQUEST_CODE = 0;
    private EditText editText;

    protected void onCreate(Bundle savedInstanceStat){
        super.onCreate(savedInstanceStat);
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
