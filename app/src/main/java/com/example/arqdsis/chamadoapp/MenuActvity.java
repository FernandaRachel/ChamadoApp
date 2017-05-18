package com.example.arqdsis.chamadoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

/**
 * Created by fernandat on 16/05/2017.
 */

public class MenuActvity  extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

    }

    public void chamarTelaChamados(){
        Intent intent = new Intent(this, Chamado.class);
        startActivity(intent);
    }

    public void chamarTelaFila(){
        Intent intent = new Intent(this, Chamado.class);
        startActivity(intent);
    }

    public void chamarTelaUsuário(){
        Intent intent = new Intent(this, Chamado.class);
        startActivity(intent);
    }
}
