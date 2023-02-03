package com.ufopinha.controllers;

import com.ufopinha.daos.EleitorDAO;
import com.ufopinha.models.Eleitor;
import com.ufopinha.daos.CargoDAO;

public class Administrador {
    public void registrarEleitor(String nome, String cpf, String titulo, Integer zona, Integer secao) {
        EleitorDAO eleitorDao = new EleitorDAO();
        CargoDAO cargo = new CargoDAO();
        eleitorDao.create(new Eleitor(nome, cpf, titulo, zona, secao));
    }
}
