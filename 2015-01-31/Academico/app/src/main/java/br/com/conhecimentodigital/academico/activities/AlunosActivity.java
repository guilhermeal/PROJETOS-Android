package br.com.conhecimentodigital.academico.activities;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.conhecimentodigital.academico.R;
import br.com.conhecimentodigital.academico.adapters.AlunosAdapter;
import br.com.conhecimentodigital.academico.domain.Aluno;

public class AlunosActivity extends ActionBarActivity {

    private ListView listaAlunos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alunos);

        setTitle("Alunos");

        listaAlunos = (ListView) findViewById(R.id.listaAlunos);

        ArrayList<Aluno> alunos = (ArrayList<Aluno>) getIntent().getSerializableExtra("alunos");
        AlunosAdapter adapter = AlunosAdapter.getInstance(this, alunos);
        listaAlunos.setAdapter(adapter);
    }

}
