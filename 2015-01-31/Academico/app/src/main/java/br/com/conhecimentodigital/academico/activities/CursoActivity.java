package br.com.conhecimentodigital.academico.activities;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.conhecimentodigital.academico.R;
import br.com.conhecimentodigital.academico.adapters.AlunosAdapter;
import br.com.conhecimentodigital.academico.domain.Aluno;
import br.com.conhecimentodigital.academico.domain.Curso;


public class CursoActivity extends ActionBarActivity {

    private TextView txtNomeCurso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curso);

        txtNomeCurso = (TextView) findViewById(R.id.txtNomeCurso);

        Intent intent = getIntent();
        Curso curso = (Curso) intent.getSerializableExtra("curso");

        txtNomeCurso.setText(curso.getNome());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_curso, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void listarAlunos (View v) {

        ProgressDialog dialog = new ProgressDialog(this);
        dialog.setMessage("Buscando lista de alunos!");
        dialog.setCancelable(false);
        dialog.show();


        ArrayList<Aluno> alunos = new ArrayList<>();

        Aluno a1 = new Aluno();
        a1.setId(1L);
        a1.setNome("Hermogenes");
        a1.setCpf("43928493898139");

        Aluno a2 = new Aluno();
        a2.setId(2L);
        a2.setNome("Cesar");
        a2.setCpf("78126371263781");

        alunos.add(a1);
        alunos.add(a2);

        dialog.dismiss();

        Intent i = new Intent(this, AlunosActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("alunos", alunos);

        i.putExtras(bundle);

        startActivity(i);
    }
}
