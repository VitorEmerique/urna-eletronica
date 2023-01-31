package com.ufopinha.dao;

import com.ufopinha.models.Eleitor;
import java.sql.*;

public class EleitorDAO extends SQLiteJDBCDriverConnection {
    public EleitorDAO () {
        super();

        try {
            Statement statement = connection.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS pessoa ( id INTEGER not NULL PRIMARY KEY, nome VARCHAR, cpf VARCHAR )");
            statement.execute("CREATE TABLE IF NOT EXISTS eleitor ( id INTEGER not NULL PRIMARY KEY, id_pessoa INTEGER, titulo VARCHAR, zona INTEGER, secao INTEGER, foreign key(id_pessoa) references pessoa(id) )");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void create(Eleitor eleitor) {
        try {
            PreparedStatement statement;

            statement = connection.prepareStatement("insert into pessoa (nome, cpf) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, eleitor.getNome());
            statement.setString(2, eleitor.getCpf());
            statement.execute();

            ResultSet resultado = statement.getGeneratedKeys();

            System.out.println(resultado.getInt(1));
            
            statement = connection.prepareStatement("insert into eleitor (titulo, id_pessoa, zona, secao) values (?, ?, ?, ?)");
            statement.setString(1, eleitor.getTitulo());
            statement.setInt(2, resultado.getInt(1));
            statement.setInt(3, eleitor.getZona());
            statement.setInt(4, eleitor.getSecao());
            statement.execute();

        } catch (Exception e) {
            System.out.println("error");
        }
    }

}
