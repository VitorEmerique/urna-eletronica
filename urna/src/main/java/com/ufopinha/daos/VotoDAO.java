package com.ufopinha.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ufopinha.models.Voto;
import com.ufopinha.utils.SQLiteConnection;

public class VotoDAO {
    protected SQLiteConnection database;

    public VotoDAO() {
        this.database = new SQLiteConnection();
    }

    public void register(Voto voto) throws Exception {
        Connection conn = this.database.connect();

        PreparedStatement statement = conn
                .prepareStatement("insert into voto ( id_eleitor, id_candidato, id_partido) values (?, ?, ?)");

        statement.setInt(1, voto.getEleitor().getId());
        statement.setInt(2, voto.getCandidato().getId());
        statement.setInt(3, voto.getPartido().getId());

        statement.execute();

        conn.close();

    }

    public void apurarVotos() throws Exception {
        Connection conn = this.database.connect();

        PreparedStatement statement = conn
                .prepareStatement("select count(id_candidato), pessoa.nome from voto " +  
                "JOIN candidato on candidato.id = voto.id_candidato " +
                "JOIN pessoa on pessoa.id = candidato.id " +
                "GROUP by voto.id_candidato");    

        statement.execute();

        ResultSet result = statement.getResultSet();

        while (result.next()) {
            String lastName = result.getString(2);
            Integer qtdVoto = result.getInt(1);
            System.out.println(lastName + ' ' + qtdVoto);
          }

    }
    
}
