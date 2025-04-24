package com.prjvitor.estados_cidades_api.config;

import java.util.List;

import lombok.Data;

@Data
public class EstadoJson {
    private String sigla;
    private String nome;
    private List<String> cidades;
}
