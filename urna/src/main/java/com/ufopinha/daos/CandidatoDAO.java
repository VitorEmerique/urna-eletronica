package com.ufopinha.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ufopinha.models.Candidato;
import com.ufopinha.models.Cargo;

public class CandidatoDAO extends EleitorDAO {
    public void register(Candidato candidato)  throws Exception { 
        Connection conn = super.database.connect();

        Integer id = super.register(candidato);

        PreparedStatement statement = conn.prepareStatement("insert into candidato (id, numero, id_cargo, id_partido) values (?, ?, ?, ?)");

        statement.setInt(1, id);
        statement.setInt(2, candidato.getNumero());
        statement.setInt(3, candidato.getCargo().getId());
        statement.setInt(4, candidato.getPartido().getId());

        statement.execute();

        conn.close();

    }

    public Candidato getByNumero(Integer numero) throws Exception {
        Connection conn = this.database.connect();

        PreparedStatement statement = conn.prepareStatement("select * from  candidato, eleitor, pessoa where candidato.id = eleitor.id and candidato.id = pessoa.id and candidato.numero = (?)");

        statement.setInt(1, numero);
        statement.execute();

        ResultSet result = statement.getResultSet();

        Candidato candidato = new Candidato(result.getInt(1),
        result.getString(10), result.getString(11), result.getString(6), result.getInt(7),
        result.getInt(8), result.getInt(2));

        conn.close();

        return candidato;

    }
}


