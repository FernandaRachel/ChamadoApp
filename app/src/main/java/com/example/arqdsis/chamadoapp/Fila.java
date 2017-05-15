package com.example.arqdsis.chamadoapp;

/**
 * Created by fernandat on 15/05/2017.
 */

public class Fila {

    private String id;
    private String nomeFila;

    public Fila(String id, String nomeFila) {
        this.id = id;
        this.nomeFila = nomeFila;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeFila() {
        return nomeFila;
    }

    public void setNomeFila(String nomeFila) {
        this.nomeFila = nomeFila;
    }
}
