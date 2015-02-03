package br.com.conhecimentodigital.academico.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import br.com.conhecimentodigital.academico.R;
import br.com.conhecimentodigital.academico.domain.Aluno;

/**
 * Created by fernandooliveira on 31/01/15.
 */
public class AlunosAdapter extends BaseAdapter {

    private Activity activity;
    private List<Aluno> alunos;

    public static AlunosAdapter getInstance(Activity activity, List<Aluno> alunos) {
        AlunosAdapter alunosAdapter = new AlunosAdapter();
        alunosAdapter.activity = activity;
        alunosAdapter.alunos = alunos;

        return alunosAdapter;
    }

    private AlunosAdapter() {
    }

    ;

    @Override
    public int getCount() {
        return alunos.size();
    }

    @Override
    public Object getItem(int position) {
        return alunos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return alunos.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Infla o layout de um item da lista
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.alunos_list_item, null);
        }

        // Recupera aluno
        Aluno aluno = (Aluno) getItem(position);

        // Pega view no layout xml
        TextView nomeAluno = (TextView) convertView.findViewById(R.id.nomeAluno);
        TextView cpf = (TextView) convertView.findViewById(R.id.cpf);

        // Coloca valores no layout
        nomeAluno.setText(aluno.getNome());
        cpf.setText(aluno.getCpf());

        return convertView;
    }
}
