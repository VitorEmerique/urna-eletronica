package com.ufopinha.controllers;

import com.ufopinha.daos.EleitorDAO;
import com.ufopinha.daos.PartidoDAO;
import com.ufopinha.models.Eleitor;
import com.ufopinha.daos.CandidatoDAO;
import com.ufopinha.daos.CargoDAO;

public class Administrador {
    public void registrarEleitor(String nome, String cpf, String titulo, Integer zona, Integer secao) {
        EleitorDAO eleitorDao = new EleitorDAO();
        CargoDAO cargo = new CargoDAO();
        PartidoDAO partido = new PartidoDAO();
        CandidatoDAO candidato = new CandidatoDAO();
        eleitorDao.create(new Eleitor(nome, cpf, titulo, zona, secao));
    }
}
