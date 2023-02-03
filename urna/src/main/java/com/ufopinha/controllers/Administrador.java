package com.ufopinha.controllers;

import com.ufopinha.daos.EleitorDAO;
import com.ufopinha.models.Eleitor;

public class Administrador {
    public void registrarEleitor(String nome, String cpf, String titulo, Integer zona, Integer secao) {
        EleitorDAO eleitorDao = new EleitorDAO();
        eleitorDao.create(new Eleitor(nome, cpf, titulo, zona, secao));
    }
}
