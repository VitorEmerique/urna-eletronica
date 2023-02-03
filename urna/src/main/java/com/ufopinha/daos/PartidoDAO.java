package com.ufopinha.daos;

import java.sql.Statement;
import java.sql.Connection;

import com.ufopinha.utils.SQLiteConnection;

public class PartidoDAO {
    protected SQLiteConnection database;

    public PartidoDAO() {
        this.database = new SQLiteConnection();

        try {
            Connection conn = database.connect();

            Statement statement = conn.createStatement();

            statement.execute("CREATE TABLE IF NOT EXISTS partido ( id INTEGER not NULL PRIMARY KEY, numero INTEGER, nome VARCHAR )");

            conn.close();

        } catch (Exception e) { System.out.println(e); }
    } 

}
