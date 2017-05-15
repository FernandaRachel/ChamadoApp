package com.example.arqdsis.chamadoapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by fernandat on 15/05/2017.
 */

public class ListaFila  extends AppCompatActivity{

    public static final String NOME = "br.usjt.arqdesis.clientep2.nome";
    public static final String EMAIL = "br.usjt.arqdesis.clientep2.email";
    public static final String FONE = "br.usjt.arqdesis.clientep2.fone";
    Activity atividade;
    ListView listView;
    ArrayList<String> listaDeFilas;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listar_fila);

        listView = (ListView)findViewById(R.id.lista_fila);
        Intent intent = getIntent();
        String chave = intent.getStringExtra(GerenciarFila.CHAVE);
        listaDeFilas = buscarFilas(chave);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaDeFilas);
        listView.setAdapter(adapter);


    }

    private ArrayList<String> listaDeFilas() {

        ArrayList<String> filas =  new ArrayList<>();
        filas.add("Fila 1");
        filas.add("Fila 2");
        filas.add("Fila 3");
        filas.add("Fila 4");

        return filas;
    }

    private ArrayList<String> buscarFilas(String chave){
        ArrayList<String> filas = listaDeFilas();
        ArrayList<String> resultado =  new ArrayList<>();

        if(chave == null || chave.length() == 0){
            return filas;
        }
        for(String nome:filas){
            if(nome.toUpperCase().contains(chave.toUpperCase())){
                resultado.add(nome);
            }
        }
        return resultado;
    }
}
