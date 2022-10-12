package com.edutecno.controldestinos.destinos.dto;

import java.util.List;

import com.edutecno.controldestinos.destinos.modelo.Pasajero;

public class PasajeroDTO extends GenericDTO{

	private List<Pasajero> pasajeros;

	public PasajeroDTO(List<Pasajero>pasajeros,String mensaje,String codigo) {
		super(mensaje,codigo);
		this.pasajeros=pasajeros;
	}
	
	public PasajeroDTO() {
		super();
	}

	@Override
	public String toString() {
		return "PasajeroDTO [pasajeros=" + pasajeros + "]";
	}

	public PasajeroDTO(List<Pasajero> pasajeros) {
		super();
		this.pasajeros = pasajeros;
	}



	public List<Pasajero> getPasajeros() {
		return pasajeros;
	}



	public void setPasajeros(List<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}


	

}
