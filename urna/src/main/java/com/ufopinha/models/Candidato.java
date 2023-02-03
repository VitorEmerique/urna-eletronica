package com.ufopinha.models;

public class Candidato extends Eleitor {
    private Integer numero;
    private Cargo cargo;
    private Partido partido;

    public Candidato(String nome, String cpf, String titulo, Integer zona, Integer secao, Integer numero, Cargo cargo, Partido partido) {
        super(nome, cpf, titulo, zona, secao);
        this.numero = numero;
        this.cargo = cargo;
        this.partido = partido;
    }

    public Integer getNumero() {
        return numero;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Partido getPartido() {
        return partido;
    }

}
