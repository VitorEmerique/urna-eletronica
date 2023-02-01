package com.ufopinha.dao;

import com.ufopinha.models.Eleitor;

import java.sql.*;

public class EleitorDAO extends PessoaDAO {
    public EleitorDAO () {
        super();

        try {
            Connection conn = super.database.connect();

            Statement statement = conn.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS eleitor ( id INTEGER not NULL PRIMARY KEY, id_pessoa INTEGER, titulo VARCHAR unique, zona INTEGER, secao INTEGER, foreign key(id_pessoa) references pessoa(id) )");

            conn.close();

        } catch (Exception e) { System.out.println(e); }
    }

    public void create(Eleitor eleitor) {
        try {

            Connection conn = super.database.connect();

            PreparedStatement statement;

            
            Integer id = super.create(eleitor);

            System.out.println(id);

            System.out.println("aq");
            
            statement = conn.prepareStatement("insert into eleitor (titulo, id_pessoa, zona, secao) values (?, ?, ?, ?)");
            statement.setString(1, eleitor.getTitulo());
            statement.setInt(2, id);
            statement.setInt(3, eleitor.getZona());
            statement.setInt(4, eleitor.getSecao());
            statement.execute();

            conn.close();

        } catch (Exception e) { System.out.println(e); }
    }

}
