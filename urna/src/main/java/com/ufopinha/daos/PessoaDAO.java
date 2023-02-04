package com.ufopinha.daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

import com.ufopinha.models.Pessoa;
import com.ufopinha.utils.SQLiteConnection;

public class PessoaDAO {
    protected SQLiteConnection database;

    public PessoaDAO() { this.database = new SQLiteConnection(); }

    public Integer register(Pessoa pessoa) throws Exception {
        Connection conn = database.connect();

        PreparedStatement statement = conn.prepareStatement("insert into pessoa (nome, cpf) values (?, ?)", Statement.RETURN_GENERATED_KEYS);

        statement.setString(1, pessoa.getNome());
        statement.setString(2, pessoa.getCpf());
        
        statement.execute();

        ResultSet result = statement.getGeneratedKeys();

        Integer id = result.getInt(1);

        conn.close();

        return id;
    }

    
}
