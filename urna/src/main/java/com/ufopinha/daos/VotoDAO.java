package com.ufopinha.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.ufopinha.models.Voto;
import com.ufopinha.utils.SQLiteConnection;

public class VotoDAO {
    protected SQLiteConnection database;

    public VotoDAO() {
        this.database = new SQLiteConnection();
    }

    
}
