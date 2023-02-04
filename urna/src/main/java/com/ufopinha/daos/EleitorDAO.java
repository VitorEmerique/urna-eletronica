package com.ufopinha.daos;

import com.ufopinha.models.Eleitor;

import java.sql.*;

public class EleitorDAO extends PessoaDAO {
    public Integer register(Eleitor eleitor) throws Exception {
        Connection conn = super.database.connect();

        Integer id = super.register(eleitor);

        PreparedStatement statement = conn
                .prepareStatement("insert into eleitor (id, titulo, zona, secao) values (?, ?, ?, ?)");

        statement.setInt(1, id);
        statement.setString(2, eleitor.getTitulo());
        statement.setInt(3, eleitor.getZona());
        statement.setInt(4, eleitor.getSecao());

        statement.execute();

        conn.close();

        return id;

    }

    public Eleitor getEleitorByTitulo(String titulo) throws Exception {
        Connection conn = this.database.connect();

        PreparedStatement statement = conn.prepareStatement("select pessoa.id, nome, cpf, titulo, zona, secao from eleitor, pessoa where pessoa.id = eleitor.id and eleitor.titulo = (?)");

        statement.setString(1, titulo);
        statement.execute();

        ResultSet result = statement.getResultSet();

        Eleitor eleitor = new Eleitor(result.getInt(1),
                result.getString("nome"),
                result.getString("cpf"),
                result.getString("titulo"),
                result.getInt("zona"),
                result.getInt("secao"));

        conn.close();

        return eleitor;

    }
}
