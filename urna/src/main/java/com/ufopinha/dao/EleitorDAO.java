package com.ufopinha.dao;

import com.ufopinha.models.Eleitor;
import java.sql.*;

public class EleitorDAO extends SQLiteJDBCDriverConnection {
    public EleitorDAO () {
        super();

        try {
            Statement statement = connection.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS eleitor ( id INTEGER not NULL PRIMARY KEY, nome VARCHAR, titulo VARCHAR )");

        } catch (Exception e) {
            System.out.println("deu erro");
        }
    }

    public void create(Eleitor eleitor) {
        String sql = "insert into eleitor (nome, titulo) values (?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, eleitor.getNome());
            statement.setString(2, eleitor.getTitulo());
            statement.execute();

        } catch (Exception e) {
            System.out.println("error");
        }
    }

}
