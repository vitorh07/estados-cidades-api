package com.prjvitor.estados_cidades_api.config;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prjvitor.estados_cidades_api.models.Cidade;
import com.prjvitor.estados_cidades_api.models.Estado;
import com.prjvitor.estados_cidades_api.repositories.EstadoRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EstadoRepository estadoRepository;

    @Override
    public void run(String... args) throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream inputStream = getClass().getResourceAsStream("/estados-cidades.json");

        EstadoJsonWrapper wrapper = objectMapper.readValue(inputStream, EstadoJsonWrapper.class);

        List<Estado> estados = new ArrayList<>();

        for (EstadoJson estadoJson : wrapper.getEstados()) {
            Estado estado = new Estado();
            estado.setNome(estadoJson.getNome());
            estado.setSigla(estadoJson.getSigla());

            List<Cidade> cidades = estadoJson.getCidades().stream().map(nomeCidade -> {
                Cidade cidade = new Cidade();
                cidade.setNome(nomeCidade);
                cidade.setEstado(estado); // associa a cidade ao estado
                return cidade;
            }).toList();

            estado.setCidades(cidades);
            estados.add(estado);
        }

        estadoRepository.saveAll(estados);
    }

}
