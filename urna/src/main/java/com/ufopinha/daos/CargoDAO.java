package com.ufopinha.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
