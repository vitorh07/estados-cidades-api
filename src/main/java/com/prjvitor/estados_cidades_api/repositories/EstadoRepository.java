package com.prjvitor.estados_cidades_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjvitor.estados_cidades_api.models.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Long>{
    
}
