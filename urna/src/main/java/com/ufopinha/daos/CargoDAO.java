package com.ufopinha.daos;

import java.sql.Statement;
import java.sql.Connection;

import com.ufopinha.utils.SQLiteConnection;

public class CargoDAO {
    protected SQLiteConnection database;

    public CargoDAO() {
        this.database = new SQLiteConnection();

        try {
            Connection conn = database.connect();

            Statement statement = conn.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS cargo ( id INTEGER not NULL PRIMARY KEY, nome VARCHAR )");

            conn.close();

        } catch (Exception e) { System.out.println(e); }
    } 

}
