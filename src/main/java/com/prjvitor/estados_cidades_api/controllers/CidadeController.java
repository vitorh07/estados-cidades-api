package com.prjvitor.estados_cidades_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prjvitor.estados_cidades_api.models.Cidade;
import com.prjvitor.estados_cidades_api.repositories.CidadeRepository;

@RestController
@RequestMapping("api/cidades")
public class CidadeController {
    
    @Autowired
    private final CidadeRepository cidadeRepository;

    public CidadeController(CidadeRepository cidadeRepository){
        this.cidadeRepository = cidadeRepository;
    }

    @GetMapping
    public List<Cidade> listarCidades(){
        return cidadeRepository.findAll();
    }
}
