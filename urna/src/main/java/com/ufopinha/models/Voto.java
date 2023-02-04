package com.ufopinha.models;

public class Voto {
    private Eleitor eleitor;
    private Partido partido;
    private Eleicao eleicao;
    private Candidato candidato;

    public Voto(Eleitor eleitor, Candidato candidato,Partido partido) {
        this.partido = partido;
        this.candidato = candidato;
        this.eleitor = eleitor;

    }

    public Eleitor getEleitor() { return this.eleitor; }

    public Partido getPartido() { return this.partido; }

    public Eleicao getEleicao() { return this.eleicao; }

    public Candidato getCandidato() { return this.candidato; }

}
