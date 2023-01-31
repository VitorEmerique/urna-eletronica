package com.ufopinha.dao;

import java.sql.*;

public class SQLiteJDBCDriverConnection {
    public static Connection connection;
    
    public SQLiteJDBCDriverConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:banco.db");
            System.out.println("conectaod");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }  

}

