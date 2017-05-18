package com.example.arqdsis.chamadoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText email = (EditText) findViewById(R.id.login_email);
        EditText password = (EditText) findViewById(R.id.login_senha);
    }

    public void loginSubmit(View view){
        /*LoginRequester requester = new LoginRequester(this, this);
        String login = editLogin.getText().toString();
        String senha = editSenha.getText().toString();
        if (login.isEmpty() || senha.isEmpty()) {
            Toast.makeText(this, "Login ou senha vazio", Toast.LENGTH_SHORT).show();
        } else {
            requester.execute("http://107.170.41.209:8080/chamado/rest/v1/logar?login=" + login+"&senha="+senha);
        }*/
        Intent intent = new Intent(this, MenuActvity.class);
        startActivity(intent);
    }



}
