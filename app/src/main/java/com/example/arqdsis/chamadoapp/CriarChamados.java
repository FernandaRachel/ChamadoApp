package com.example.arqdsis.chamadoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by arqdsis on 09/05/2017.
 */
public class CriarChamados extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.criar_chamados);

        // SPINNER RESPONSÁVEL
        Spinner spinnerResponsável = (Spinner) findViewById(R.id.responsavel_chamado);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.responsavel_chamado, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerResponsável.setAdapter(adapter);

        // SPINNER PRIORIDADE
        Spinner spinnerPrioridade = (Spinner) findViewById(R.id.prioridade_chamado);
        ArrayAdapter<CharSequence> adapterPrioridade = ArrayAdapter.createFromResource(this,
                R.array.prioridade_chamado, android.R.layout.simple_spinner_item);
        adapterPrioridade.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerPrioridade.setAdapter(adapterPrioridade);

        // SPINNER STATUS
        Spinner spinnerStatus = (Spinner) findViewById(R.id.status_chamado);
        ArrayAdapter<CharSequence> adapterStatus = ArrayAdapter.createFromResource(this,
                R.array.status_chamado, android.R.layout.simple_spinner_item);
        adapterStatus.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerStatus.setAdapter(adapterStatus);


    }


    public void backToMenu(View view) {
        Intent intent = new Intent(this, MenuActvity.class);
        startActivity(intent);
    }
}
