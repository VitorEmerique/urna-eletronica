package com.ufopinha.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

import com.ufopinha.models.Pessoa;
import com.ufopinha.utils.SQLiteJDBCDriverConnection;

public class PessoaDAO {
    protected SQLiteJDBCDriverConnection database;

    public PessoaDAO () {
        this.database = new SQLiteJDBCDriverConnection();

        try {
            Connection conn = database.connect();

            Statement statement = conn.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS pessoa ( id INTEGER not NULL PRIMARY KEY, nome VARCHAR, cpf VARCHAR unique )");

            conn.close();

        } catch (Exception e) { System.out.println(e); }
    } 

    public Integer create(Pessoa eleitor) {
        try {

            PreparedStatement statement;

            Connection conn = database.connect();

            statement = conn.prepareStatement("insert into pessoa (nome, cpf) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, eleitor.getNome());
            statement.setString(2, eleitor.getCpf());
            statement.execute();

            ResultSet result = statement.getGeneratedKeys();

            Integer id = result.getInt(1);

            conn.close();

            return id;

            

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}
