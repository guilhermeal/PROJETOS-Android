package com.example.guilherme.dialogs;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by guilherme on 31/01/15.
 */
public class MeuDialogo extends DialogFragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.dialog_layout, null);
        getDialog().setTitle("Aguarde");
        return view;
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
