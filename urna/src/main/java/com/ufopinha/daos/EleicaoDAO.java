package com.ufopinha.daos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ufopinha.models.Eleicao;
import com.ufopinha.utils.SQLiteConnection;

public class EleicaoDAO {

    protected SQLiteConnection database;

    public EleicaoDAO() {
        this.database = new SQLiteConnection();

    }

    public Integer register(Eleicao eleicao) throws Exception {

        Connection conn = database.connect();

        PreparedStatement statement = conn.prepareStatement("insert into eleicao (nome,data) values (?,?)");

        statement.setString(1, eleicao.getNome());
        statement.setString(2, eleicao.getMydateObj());

        statement.execute();

        ResultSet result = statement.getGeneratedKeys();

        Integer id = result.getInt(1);

        conn.close();

        return id;
    }

}
