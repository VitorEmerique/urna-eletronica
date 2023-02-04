package com.ufopinha.models;

public class Voto {
    private Eleitor eleitor;
    private Partido partido;
    private Eleicao eleicao;
    private Integer numero;

    public Voto(Eleitor eleitor, Partido partido, Eleicao eleicao, Integer numero) {
        this.eleicao = eleicao;
        this.partido = partido;
        this.eleitor = eleitor;
        this.numero = numero;

    }

    public Voto(Integer numero) {
        this.numero = numero;

    }

    public Eleitor getEleitor() {
        return this.eleitor;
    }

    public void setEleitor(Eleitor eleitor) {
        this.eleitor = eleitor;
    }

    public Partido getPartido() {
        return this.partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Eleicao getEleicao() {
        return this.eleicao;
    }

    public void setEleicao(Eleicao eleicao) {
        this.eleicao = eleicao;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

}
