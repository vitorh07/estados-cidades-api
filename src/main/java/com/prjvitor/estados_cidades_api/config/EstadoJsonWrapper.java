package com.prjvitor.estados_cidades_api.config;

import java.util.List;

import lombok.Data;

@Data
public class EstadoJsonWrapper {
    private List<EstadoJson> estados;
}
