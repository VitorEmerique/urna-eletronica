package com.ufopinha.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ufopinha.models.Cargo;
import com.ufopinha.utils.SQLiteConnection;

public class CargoDAO {
    protected SQLiteConnection database;

    public CargoDAO() { this.database = new SQLiteConnection(); }

    public void register(Cargo cargo) throws Exception {
        Connection conn = this.database.connect();

        PreparedStatement statement = conn.prepareStatement("insert into cargo (nome) values (?)");

        statement.setString(1, cargo.getNome());
        statement.execute();

        conn.close();

    }

    public Cargo getCargoById(Integer id) throws Exception {
        Connection conn = this.database.connect();

        PreparedStatement statement = conn.prepareStatement("select * from cargo where id = (?)");

        statement.setInt(1, id);
        statement.execute();

        ResultSet result = statement.getResultSet();

        Cargo cargo = new Cargo(result.getString("nome"), result.getInt("id"));

        conn.close();

        return cargo;

    }

}
