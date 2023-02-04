package com.ufopinha.models;

public abstract class Pessoa {
    private String nome, cpf;
    private Integer id;

    public Pessoa(Integer id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

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
