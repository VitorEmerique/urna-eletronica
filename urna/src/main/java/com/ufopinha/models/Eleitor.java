package com.ufopinha.models;

public class Eleitor extends Pessoa {
    private String titulo;
    private Integer zona, secao;

    public Eleitor(String nome, String cpf, String titulo, Integer zona, Integer secao) {
        super(nome, cpf);
        this.titulo = titulo;
        this.zona = zona;
        this.secao = secao;

    }

    public String getTitulo() {
        return this.titulo;
    }

    public Integer getZona() {
        return this.zona;
    }

    public Integer getSecao() {
        return this.secao;
    }

}
