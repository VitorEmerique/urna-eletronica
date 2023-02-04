package com.ufopinha.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ufopinha.models.Candidato;

public class CandidatoDAO extends EleitorDAO {
    public void register(Candidato candidato)  throws Exception { 
        Connection conn = super.database.connect();

        PreparedStatement statement;
        System.out.println("aq");

        Integer id = super.register(candidato);

        System.out.println(id);

        System.out.println("aq");

        statement = conn.prepareStatement("insert into candidato (id, numero, id_cargo, id_partido) values (?, ?, ?)");
        statement.setInt(1, id);
        statement.setInt(2, candidato.getNumero());
        statement.setInt(3, candidato.getCargo().getId());
        statement.setInt(4, candidato.getPartido().getId());
        statement.execute();

        conn.close();

    }

}


