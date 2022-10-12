package com.edutecno.controldestinos.destinos.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edutecno.controldestinos.destinos.dto.DestinoDTO;
import com.edutecno.controldestinos.destinos.modelo.Destino;
import com.edutecno.controldestinos.destinos.modelo.Pasajero;
import com.edutecno.controldestinos.destinos.repository.DestinoRepository;
import com.edutecno.controldestinos.destinos.service.DestinoService;

@Service
public class DestinoServiceImpl implements DestinoService {
	private static final Logger log =LoggerFactory.getLogger(DestinoServiceImpl.class);
	
	@Autowired
	private DestinoRepository dao;
	private DestinoDTO respuesta;
	
	
	@Override
	@Transactional(readOnly = true)
	public DestinoDTO findAll() {
		respuesta = new DestinoDTO(new ArrayList<Destino>(), "Ha ocurrido un error", "102" );
				try {
				respuesta.setDestinos((List<Destino>) dao.findAll());
				respuesta.setMensaje(String.format("Se han encontrado destinos", respuesta.getDestinos().size()));
				respuesta.setCodigo("0");
				} catch (Exception e) {
				log.trace("Error en findAll", e);
				}
				return respuesta;
	}
	@Override
	@Transactional
	public DestinoDTO save(Destino destino) {
		respuesta = new DestinoDTO(new ArrayList<Destino>(),"Ha ocurrido un error", "104" );
		try {
		dao.save(destino);
		respuesta.setMensaje(String.format("Se ha guardado",destino.getCiudad()));
		respuesta.setCodigo("0");
		} catch (Exception e) {
		log.trace(" Error en save", e);
		}
		return respuesta;
	}
/*	@Override
	public DestinoDTO findByDestinoDTO(Pasajero pasajero) {
		// TODO Auto-generated method stub
		return null;
	}*/


}
