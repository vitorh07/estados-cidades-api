package com.prjvitor.estados_cidades_api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prjvitor.estados_cidades_api.models.Estado;
import com.prjvitor.estados_cidades_api.repositories.EstadoRepository;

@RestController
@RequestMapping("api/estados")
public class EstadoController {
    
    @Autowired
    private final EstadoRepository estadoRepository;

    public EstadoController(EstadoRepository estadoRepository){
        this.estadoRepository = estadoRepository;
    }

    @GetMapping
    public List<Estado> listarEstados(){
        return estadoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Estado listarEstadoPorId(@PathVariable Long id){
        return estadoRepository.findById(id).orElse(null);
    }
}
