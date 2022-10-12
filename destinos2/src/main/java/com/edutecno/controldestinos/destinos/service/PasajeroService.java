package com.edutecno.controldestinos.destinos.service;

import com.edutecno.controldestinos.destinos.dto.PasajeroDTO;
import com.edutecno.controldestinos.destinos.modelo.Pasajero;

public interface PasajeroService {

	PasajeroDTO save(Pasajero pasajero);
	PasajeroDTO findAll();
}
