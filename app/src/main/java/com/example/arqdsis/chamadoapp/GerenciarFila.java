package com.example.arqdsis.chamadoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by fernandat on 15/05/2017.
 */

public class GerenciarFila extends AppCompatActivity {
    private EditText nomeFila;
    public static final String CHAVE = "com.example.arqdsis.chamadoapp.chave";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gerenciar_fila);
    }

    public void buscarFila(View view){
        Intent intent = new Intent(this, ListaFila.class);
        String chave = nomeFila.getText().toString();
        intent.putExtra(CHAVE, chave);
        startActivity(intent);
    }

}
