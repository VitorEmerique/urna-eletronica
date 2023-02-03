package com.ufopinha.models;

public abstract class Pessoa {
    private String nome, cpf;
    private Integer id;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Integer getId() {
        return id;
    }

}
