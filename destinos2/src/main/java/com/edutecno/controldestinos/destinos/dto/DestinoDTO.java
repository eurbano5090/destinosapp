package com.edutecno.controldestinos.destinos.dto;

import java.util.List;

import com.edutecno.controldestinos.destinos.modelo.Destino;

public class DestinoDTO extends GenericDTO{

	private List<Destino> destinos;
	
	
	public DestinoDTO() {
		super();
	}


	public DestinoDTO(List<Destino> destinos) {
		super();
		this.destinos = destinos;
	}


	public DestinoDTO(List<Destino> destinos, String mensaje, String codigo) {
	super(mensaje, codigo);
	this.destinos = destinos;
}


	public List<Destino> getDestinos() {
		return destinos;
	}


	public void setDestinos(List<Destino> destinos) {
		this.destinos = destinos;
	}



	
	
}
