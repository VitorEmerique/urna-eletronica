package com.ufopinha.controllers;

import com.ufopinha.daos.EleitorDAO;
import com.ufopinha.models.Eleitor;

public class Mesario {
    private EleitorDAO eleitorDAO;

    public Mesario() {
        this.eleitorDAO = new EleitorDAO();
    }

    public Eleitor autenticaEleitor(String titulo) {

        try {
            return eleitorDAO.getEleitorByTitulo(titulo);
        } catch (Exception e) {
            return null;
        }

    }

}
