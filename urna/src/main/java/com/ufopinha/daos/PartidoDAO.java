package com.ufopinha.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ufopinha.models.Partido;
import com.ufopinha.utils.SQLiteConnection;

public class PartidoDAO {
    protected SQLiteConnection database;

    public PartidoDAO() { this.database = new SQLiteConnection(); }

    public void register(Partido partido) throws Exception {
        Connection conn = this.database.connect();

        PreparedStatement statement = conn.prepareStatement("insert into partido (nome, numero) values (?, ?)");

        statement.setString(1, partido.getNome());
        statement.setInt(2, partido.getNumero());
        statement.execute();

        conn.close();

    }

    public Partido getPartidoByNumero(Integer numero) throws Exception {
        Connection conn = this.database.connect();

        PreparedStatement statement = conn.prepareStatement("select * from partido where numero = (?)");

        statement.setInt(1, numero);
        statement.execute();

        ResultSet result = statement.getResultSet();

        Partido partido = new Partido(result.getInt(1), result.getInt(2), result.getString(3));

        conn.close();

        return partido;

    }

    public Partido getPartidoById(Integer id) throws Exception {
        Connection conn = this.database.connect();

        PreparedStatement statement = conn.prepareStatement("select * from partido where id = (?)");

        statement.setInt(1, id);
        statement.execute();

        ResultSet result = statement.getResultSet();

        Partido partido = new Partido(result.getInt(1), result.getInt(2), result.getString(3));

        conn.close();

        return partido;

    }

}
