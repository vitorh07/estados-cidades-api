package com.prjvitor.estados_cidades_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjvitor.estados_cidades_api.models.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
    
}
