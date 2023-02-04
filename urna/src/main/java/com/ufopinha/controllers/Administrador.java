package com.ufopinha.controllers;

import com.ufopinha.daos.CargoDAO;
import com.ufopinha.daos.EleitorDAO;
import com.ufopinha.daos.PartidoDAO;
import com.ufopinha.models.Cargo;
import com.ufopinha.models.Eleitor;
import com.ufopinha.models.Partido;

public class Administrador {
    public void registrarPartido(String nome, Integer numero) {
        PartidoDAO partidoDao = new PartidoDAO();

        try { partidoDao.register(new Partido(nome, numero)); }
        catch (Exception e) { System.out.println(e.getMessage()); }

    }

    public void registrarCargo(String nome) {
        CargoDAO cargoDao = new CargoDAO();

        try { cargoDao.register(new Cargo(nome)); }
        catch (Exception e) { System.out.println(e.getMessage()); }
    }

    public void registrarEleitor(String nome, String cpf, String titulo, Integer zona, Integer secao) {
        EleitorDAO eleitorDao = new EleitorDAO();
        
        try { eleitorDao.register(new Eleitor(nome, cpf, titulo, zona, secao)); }
        catch (Exception e) { System.out.println(e.getMessage()); }
        
    }

    /*public void registrarCandidato(String nome, String cpf, String titulo, Integer zona, Integer secao, Integer numero, Cargo cargo, Partido partido) {
        CandidatoDAO candidatoDao = new CandidatoDAO();
        
        candidatoDao.register();

    }*/

}
