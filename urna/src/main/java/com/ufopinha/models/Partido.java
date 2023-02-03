package com.ufopinha.models;

public class Partido {  
    private Integer id, numero;
    private String nome;

    public Partido(Integer numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getId() {
        return id;
    }

}
