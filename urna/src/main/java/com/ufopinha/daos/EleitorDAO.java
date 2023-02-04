package com.ufopinha.daos;

import com.ufopinha.models.Eleitor;

import java.sql.*;

public class EleitorDAO extends PessoaDAO {
    public Integer register(Eleitor eleitor)  throws Exception { 
        Connection conn = super.database.connect();

        PreparedStatement statement;
        System.out.println("aq");

        Integer id = super.register(eleitor);

        System.out.println(id);

        System.out.println("aq");

        statement = conn.prepareStatement("insert into eleitor (id, titulo, zona, secao) values (?, ?, ?, ?)");
        statement.setInt(1, id);
        statement.setString(2, eleitor.getTitulo());
        statement.setInt(3, eleitor.getZona());
        statement.setInt(4, eleitor.getSecao());
        statement.execute();

        conn.close();

        return id;

    }
}
