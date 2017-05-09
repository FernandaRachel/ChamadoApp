package com.example.arqdsis.chamadoapp;

/**
 * Created by arqdsis on 09/05/2017.
 */
public class SpinnerActivity extends GerenciarChamado implements OnItemSelectedListener {
    ...

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
    }

    public void onNothingSelected(AdapterView<?> parent) {
        // Another interface callback
    }
}