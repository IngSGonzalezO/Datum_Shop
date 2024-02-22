package com.datumredsoft.shop.modelo;

import com.datumredsoft.shop.entidades.Usuarios;

public class RespuestaModelo {

	private String estado;
	private Usuarios usuarioRespuesta;
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Usuarios getUsuarioRespuesta() {
		return usuarioRespuesta;
	}
	public void setUsuarioRespuesta(Usuarios usuarioRespuesta) {
		this.usuarioRespuesta = usuarioRespuesta;
	}
	
	
}
