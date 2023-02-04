package com.ufopinha.controllers;

import com.ufopinha.daos.EleitorDAO;
import com.ufopinha.models.Eleitor;

public class Administrador {
    public void registrarEleitor(String nome, String cpf, String titulo, Integer zona, Integer secao) {
        EleitorDAO eleitorDao = new EleitorDAO();
        
        try { eleitorDao.register(new Eleitor(nome, cpf, titulo, zona, secao)); }
        catch (Exception e) { System.out.println(e.getMessage()); }
        
    }

    /*public registrarCandidato(String nome, String cpf, String titulo, Integer zona, Integer secao, Integer numero, Cargo cargo, Partido partido) {
        CandidatoDAO candidatoDao = new CandidatoDAO();
        
        candidatoDao.create();

    }*/

}
