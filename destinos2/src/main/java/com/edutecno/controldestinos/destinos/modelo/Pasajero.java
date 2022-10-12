package com.edutecno.controldestinos.destinos.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "SQ_PASAJERO", initialValue = 1, sequenceName = "SQ_PASAJERO", allocationSize = 1)
public class Pasajero {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PASAJERO")
	private Integer id;
	private String rut;
	private String nombre;
	private String apellido;
	private String edad;
	private String ciudadNatal;
    
    
	public Pasajero() {
		super();
	}

	public Pasajero(Integer id, String rut, String nombre, String apellido, String edad, String ciudadNatal) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ciudadNatal = ciudadNatal;

	}

	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", edad="
				+ edad + ", ciudadNatal=" + ciudadNatal + "]";
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getCiudadNatal() {
		return ciudadNatal;
	}

	public void setCiudadNatal(String ciudadNatal) {
		this.ciudadNatal = ciudadNatal;
	}

}
