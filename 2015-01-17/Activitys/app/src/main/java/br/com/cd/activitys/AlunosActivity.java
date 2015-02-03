package br.com.cd.activitys;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class AlunosActivity extends ListActivity {

    private String[] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /* VERIFICA SE data ESTA ARMAZENADA NO BUNDLE - SE TIVER, NÃO REMONTA NOVAMENTE */
        if(savedInstanceState != null){
            data = (String[]) savedInstanceState.getSerializable("data");
        } else {
            data = new String[]{"Helder", "Cesar", "Guilherme", "Hermogenes", "Bruno"};
        }


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        setListAdapter(adapter);
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable("data", data);
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Toast.makeText(this, data[position], Toast.LENGTH_LONG).show();
    }
}
