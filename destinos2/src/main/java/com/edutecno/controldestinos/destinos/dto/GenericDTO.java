package com.edutecno.controldestinos.destinos.dto;

public class GenericDTO {

	String mensaje;
	String codigo;
	
	public GenericDTO() {
		super();
	}

	public GenericDTO(String mensaje, String codigo) {
		super();
		this.mensaje = mensaje;
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "GenericDTO [mensaje=" + mensaje + ", codigo=" + codigo + "]";
	}
	
	
}

