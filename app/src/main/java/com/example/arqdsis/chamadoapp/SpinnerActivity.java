package com.example.arqdsis.chamadoapp;

import android.view.View;
import android.widget.AdapterView;

/**
 * Created by arqdsis on 09/05/2017.
 */
public class SpinnerActivity extends CriarChamados implements AdapterView.OnItemSelectedListener {


    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}