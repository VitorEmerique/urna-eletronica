package com.ufopinha.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Eleicao {
    private Integer id;
    private String nome;
    final LocalDateTime myDateObj = LocalDateTime.now();
    final DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    private String data = myDateObj.format(myFormatObj).toString();

    public Eleicao(String nome) {
        this.nome = nome;

    }

    public Integer getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getMydateObj() {
        return data;
    }

}
