package com.ufopinha.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.ufopinha.models.Pessoa;

public class PessoaDAO extends SQLiteJDBCDriverConnection {
    public PessoaDAO () {
        super();

        try {
            Statement statement = connection.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS pessoa ( id INTEGER not NULL PRIMARY KEY, nome VARCHAR, cpf VARCHAR )");

        } catch (Exception e) {
            System.out.println(e);
        }
    } 

    public ResultSet create(Pessoa eleitor) {
        PreparedStatement statement;

        try {
            statement = connection.prepareStatement("insert into pessoa (nome, cpf) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, eleitor.getNome());
            statement.setString(2, eleitor.getCpf());
            statement.execute();

            return statement.getGeneratedKeys();

        } catch (Exception e) {
            return null;
        }
    }

}
