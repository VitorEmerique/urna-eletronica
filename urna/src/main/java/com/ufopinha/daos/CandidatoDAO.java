package com.ufopinha.daos;

import java.sql.Connection;
import java.sql.Statement;

public class CandidatoDAO extends EleitorDAO {
    public CandidatoDAO() {
        super();

        try {
            Connection conn = super.database.connect();

            Statement statement = conn.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS candidato ( id INTEGER not NULL PRIMARY KEY, nome VARCHAR,numero INTEGER unique, id_cargo INTEGER, id_partido INTEGER, foreign key(id_cargo) references cargo(id), foreign key(id_partido) references partido(id) )");

            conn.close();

        } catch (Exception e) { System.out.println(e); }
    }

}


