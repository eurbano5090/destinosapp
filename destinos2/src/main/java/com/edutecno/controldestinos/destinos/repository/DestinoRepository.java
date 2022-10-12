package com.edutecno.controldestinos.destinos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.controldestinos.destinos.modelo.Destino;

@Repository
public interface DestinoRepository extends CrudRepository<Destino, Integer>{

}
