package com.ufopinha.utils;

import java.sql.*;

public class SQLiteJDBCDriverConnection { 
    public SQLiteJDBCDriverConnection() {

    }  

    public Connection connect() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:urna/src/main/java/com/ufopinha/database.db");
            System.out.println("conectaod");

            return connection;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

}

