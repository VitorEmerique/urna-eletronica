package com.ufopinha.controllers;

import com.ufopinha.daos.CandidatoDAO;
import com.ufopinha.daos.EleitorDAO;
import com.ufopinha.daos.PartidoDAO;
import com.ufopinha.daos.VotoDAO;
import com.ufopinha.models.Voto;

public class Urna {
    private VotoDAO votoDao;
    private EleitorDAO eleitorDao;
    private CandidatoDAO candidatoDao;
    private PartidoDAO partidoDao;

    public Urna() {
        this.votoDao = new VotoDAO();
        this.eleitorDao = new EleitorDAO();
        this.candidatoDao = new CandidatoDAO();
        this.partidoDao = new PartidoDAO();
    }

    public void registrarVoto(String titulo, int numero) {
        try {
            votoDao.register(new Voto(eleitorDao.getEleitorByTitulo(titulo),
                    candidatoDao.getByNumero(numero),
                    partidoDao.getPartidoByNumero(numero)));

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
