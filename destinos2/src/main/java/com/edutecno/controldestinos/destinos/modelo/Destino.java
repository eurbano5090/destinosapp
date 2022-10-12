package com.edutecno.controldestinos.destinos.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "SQ_DESTINO", initialValue = 1, sequenceName = "SQ_DESTINO", allocationSize = 1)
public class Destino {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DESTINO")
	private Integer id;
	private String ciudad;
	private String pais;
	private String fecha;

	@ManyToOne
	@JoinColumn(name = "pasajero_id", referencedColumnName = "id")
	private Pasajero pasajero;
	
	public Destino() {
		super();
	}

	public Destino(Integer id, String ciudad, String pais, String fecha, Pasajero pasajero) {
		super();
		this.id = id;
		this.ciudad = ciudad;
		this.pais = pais;
		this.fecha = fecha;
		this.pasajero = pasajero;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}
	
	@Override
	public String toString() {
		return "Destino [id=" + id + ", ciudad=" + ciudad + ", pais=" + pais + ", fecha=" + fecha + ", pasajero="
				+ pasajero + "]";
	}

}