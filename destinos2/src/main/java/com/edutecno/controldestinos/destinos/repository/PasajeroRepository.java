package com.edutecno.controldestinos.destinos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edutecno.controldestinos.destinos.modelo.Pasajero;

@Repository
public interface PasajeroRepository extends CrudRepository<Pasajero, Integer>{

}
