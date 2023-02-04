package com.ufopinha.utils;

import java.sql.*;

public class SQLiteConnection {
    public Connection connect() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:src/main/java/com/ufopinha/database.db");
            System.out.println("conectado");

            return connection;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
