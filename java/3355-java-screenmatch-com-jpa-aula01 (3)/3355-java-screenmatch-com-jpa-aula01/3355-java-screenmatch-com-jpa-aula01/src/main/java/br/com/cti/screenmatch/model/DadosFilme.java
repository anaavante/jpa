package br.com.cti.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public record DadosFilme(@JsonAlias("Title") String titulo,
                             @JsonAlias("Year") Integer ano,
                             @JsonAlias("Type") String tipo){}

