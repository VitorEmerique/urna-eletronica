package com.ufopinha.utils;

import java.sql.Connection;
import java.sql.Statement;

public class CreateTables {
    public static void createTables() {
        SQLiteConnection database = new SQLiteConnection();
        Connection conn = database.connect();

        try {
            Statement statement = conn.createStatement();
            statement.execute(
                    "CREATE TABLE IF NOT EXISTS pessoa ( id INTEGER not NULL PRIMARY KEY, nome VARCHAR, cpf VARCHAR unique )");
            statement.execute(
                    "CREATE TABLE IF NOT EXISTS eleitor ( id INTEGER not NULL PRIMARY KEY, titulo VARCHAR unique, zona INTEGER, secao INTEGER, foreign key(id) references pessoa(id) ON DELETE CASCADE )");

            statement.execute("CREATE TABLE IF NOT EXISTS cargo ( id INTEGER not NULL PRIMARY KEY, nome VARCHAR )");
            statement.execute(
                    "CREATE TABLE IF NOT EXISTS partido ( id INTEGER not NULL PRIMARY KEY, numero INTEGER unique, nome VARCHAR )");

            statement.execute("CREATE TABLE IF NOT EXISTS " +
                    "candidato ( id INTEGER not NULL PRIMARY KEY, numero INTEGER unique, " +
                    "id_cargo INTEGER, id_partido INTEGER, foreign key(id_cargo) references cargo(id) " +
                    "ON DELETE CASCADE, foreign key(id_partido) references partido(id) )");

            statement.execute(
                    "CREATE TABLE IF NOT EXISTS eleicao ( id INTEGER not NULL PRIMARY KEY, nome VARCHAR, data VARCHAR)");

            statement.execute(
                    "CREATE TABLE IF NOT EXISTS voto ( id INTEGER not NULL PRIMARY KEY, id_eleitor INTEGER, id_partido INTEGER,"
                            +
                            "id_eleicao, numero INTEGER, foreign key(id_eleitor) references eleitor(id)," +
                            "foreign key(id_partido) references partido(id)," +
                            "foreign key(id_eleicao) references eleicao(id))");

            conn.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());

            try {
                conn.close();
            } catch (Exception ex) {
            }

        }
    }
}
