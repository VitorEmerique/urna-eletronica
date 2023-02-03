package com.ufopinha.models;

public class Cargo {
    private Integer id;
    private String nome;

    public Cargo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }

}
