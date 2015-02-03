package com.example.guilherme.dialogs;

import android.content.DialogInterface;
import android.widget.Toast;

/**
 * Created by guilherme on 31/01/15.
 */
public class OKClickListener implements DialogInterface.OnClickListener {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
        }
}
