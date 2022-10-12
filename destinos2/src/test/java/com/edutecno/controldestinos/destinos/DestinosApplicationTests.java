package com.edutecno.controldestinos.destinos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.edutecno.controldestinos.destinos.modelo.Destino;
import com.edutecno.controldestinos.destinos.modelo.Pasajero;
import com.edutecno.controldestinos.destinos.repository.DestinoRepository;
import com.edutecno.controldestinos.destinos.repository.PasajeroRepository;


@SpringBootTest
class DestinosApplicationTests {

	@Autowired
	private PasajeroRepository pasajeroRepository;

	@Autowired
	private DestinoRepository destinoRepository;


	@Test
	public void validadestino() {
		
   Pasajero pasajero =new Pasajero(null,"109-9","Pedro","Pascal","34","Santiago");
	 pasajeroRepository.save(pasajero);
	 
	Destino destino= new Destino(null,"Angelmo","Chile","13-09-2022",pasajero);
     destinoRepository.save(destino);
		
     
     
	}
	
	  
	  

	}


