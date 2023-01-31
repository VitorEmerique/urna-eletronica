package com.ufopinha.models;

public class Eleitor extends Pessoa {
    String titulo;

    public Eleitor(String nome, String titulo) {
        super(nome);
        this.titulo = titulo;

    }

    public String getTitulo() {
        return this.titulo;
    }

}
