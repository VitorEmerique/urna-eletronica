package com.ufopinha.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
    
}
