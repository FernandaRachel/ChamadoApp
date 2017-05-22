package com.example.arqdsis.chamadoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by fernandat on 16/05/2017.
 */

public class MenuActvity  extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

    }

    public void chamarTelaChamados(View view){
        Intent intent = new Intent(this, CriarChamados.class);
        startActivity(intent);
    }

    public void chamarTelaFila(View view){
        Intent intent = new Intent(this, GerenciarFila.class);
        startActivity(intent);
    }

    public void chamarTelaUsuário(View view){
        Intent intent = new Intent(this, Chamado.class);
        startActivity(intent);
    }
}
