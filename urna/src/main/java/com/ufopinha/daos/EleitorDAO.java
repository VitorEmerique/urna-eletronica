package com.ufopinha.daos;

import com.ufopinha.models.Eleitor;
import com.ufopinha.models.Pessoa;

import java.sql.*;

public class EleitorDAO extends PessoaDAO {
    public EleitorDAO() {
        super();

        try {
            Connection conn = super.database.connect();

            Statement statement = conn.createStatement();

            statement.execute(
                    "CREATE TABLE IF NOT EXISTS eleitor ( id INTEGER not NULL PRIMARY KEY, titulo VARCHAR unique, zona INTEGER, secao INTEGER, foreign key(id) references pessoa(id) ON DELETE CASCADE )");

            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void create(Eleitor eleitor) {
        try {

            Connection conn = super.database.connect();

            PreparedStatement statement;

            Integer id = super.create(eleitor);

            System.out.println(id);

            System.out.println("aq");

            statement = conn.prepareStatement("insert into eleitor (id, titulo, zona, secao) values (?, ?, ?, ?)");
            statement.setInt(1, id);
            statement.setString(2, eleitor.getTitulo());
            statement.setInt(3, eleitor.getZona());
            statement.setInt(4, eleitor.getSecao());
            statement.execute();

            conn.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void delete(String titulo) {

        try {

            Connection conn = super.database.connect();

            PreparedStatement statement;

            statement = conn.prepareStatement("delete from eleitor where titulo = ? ");
            statement.setString(1, titulo);
            statement.execute();

            conn.close();

        } catch (Exception e) {
            System.out.println("EleitorDao");
        }
    }

}
