package com.ufopinha.controllers;

import com.ufopinha.daos.CandidatoDAO;
import com.ufopinha.daos.CargoDAO;
import com.ufopinha.daos.EleitorDAO;
import com.ufopinha.daos.PartidoDAO;
import com.ufopinha.models.Candidato;
import com.ufopinha.models.Cargo;
import com.ufopinha.models.Eleitor;
import com.ufopinha.models.Partido;

public class Administrador {
    private PartidoDAO partidoDao;
    private CargoDAO cargoDao;
    private EleitorDAO eleitorDao;
    private CandidatoDAO candidatoDao;

    public Administrador() {
        this.partidoDao = new PartidoDAO();
        this.cargoDao = new CargoDAO();
        this.eleitorDao = new EleitorDAO();
        this.candidatoDao = new CandidatoDAO();

    }

    public void registrarPartido(String nome, Integer numero) {
        try { this.partidoDao.register(new Partido(nome, numero)); }
        catch (Exception e) { System.out.println(e.getMessage()); }

    }

    public void registrarCargo(String nome) {
        try { this.cargoDao.register(new Cargo(nome)); }
        catch (Exception e) { System.out.println(e.getMessage()); }
    }

    public void registrarEleitor(String nome, String cpf, String titulo, Integer zona, Integer secao) {  
        try { this.eleitorDao.register(new Eleitor(nome, cpf, titulo, zona, secao)); }
        catch (Exception e) { System.out.println(e.getMessage()); }
        
    }

    public void registrarCandidato(String nome, String cpf, String titulo, Integer zona, Integer secao, Integer numero, Integer idCargo, Integer numeroPartido) {
        try { this.candidatoDao.register(new Candidato(nome, cpf, titulo, zona, secao, numero, cargoDao.getCargoById(idCargo), partidoDao.getPartidoByNumero(numeroPartido))); } 
        catch (Exception e) { System.out.println(e.getMessage()); }

    }

}
