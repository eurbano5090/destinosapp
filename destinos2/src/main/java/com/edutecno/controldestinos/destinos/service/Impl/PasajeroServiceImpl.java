package com.edutecno.controldestinos.destinos.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edutecno.controldestinos.destinos.dto.PasajeroDTO;
import com.edutecno.controldestinos.destinos.modelo.Pasajero;
import com.edutecno.controldestinos.destinos.repository.PasajeroRepository;
import com.edutecno.controldestinos.destinos.service.PasajeroService;

@Service
public class PasajeroServiceImpl implements PasajeroService{
	private static final Logger log =LoggerFactory.getLogger(PasajeroServiceImpl.class);


	@Autowired
	private PasajeroRepository dao;
	private PasajeroDTO respuesta;
	

	@Override
	@Transactional(readOnly = true)
	public PasajeroDTO findAll() {
		respuesta = new PasajeroDTO(new ArrayList<Pasajero>(), "Ha ocurrido un error", "102" );
				try {
				respuesta.setPasajeros((List<Pasajero>) dao.findAll());
				respuesta.setMensaje(String.format("Se ha/n encontrado %dregistro/s", respuesta.getPasajeros().size()));
				respuesta.setCodigo("0");
				} catch (Exception e) {
				log.trace("Error en findAll", e);
				}
				return respuesta;
	}

	
	@Override
	@Transactional
	public PasajeroDTO save(Pasajero pasajero) {
		respuesta = new PasajeroDTO(new ArrayList<Pasajero>(), "Ha ocurrido un error", "104" );
				try {
				dao.save(pasajero);
				respuesta.setMensaje(String.format("Se ha guardado correctamente el pasajero %s", pasajero.getNombre()));
				respuesta.setCodigo("0");
				} catch (Exception e) {
				log.trace("Cliente Service: Error en add", e);
				}
				return respuesta;
	
	}

}
