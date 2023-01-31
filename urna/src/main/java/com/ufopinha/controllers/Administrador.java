package com.ufopinha.controllers;

import com.ufopinha.dao.EleitorDAO;
import com.ufopinha.models.Eleitor;

public class Administrador {
    public void registrarEleitor(String nome, String titulo) {
        EleitorDAO eleitorDao = new EleitorDAO();
        eleitorDao.create(new Eleitor(nome, titulo));
    }
}
