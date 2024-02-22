package com.datumredsoft.shop.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "USUARIO")
public class Usuarios implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Usuarios() {
		//Constructor
	}
	
	public Usuarios(Usuarios usuarioInfo) {
		this.usuario = usuarioInfo.getUsuario();
		this.nombre = usuarioInfo.getNombre();
		this.correoElectronico = usuarioInfo.getCorreoElectronico();
		this.contrasenia = usuarioInfo.getContrasenia();
		this.fechaCreacion = usuarioInfo.getFechaCreacion();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID_USUARIO")
	private Long idUsuario;

	@Column(name = "USUARIO")
	private String usuario;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "CORREO_ELECTRONICO")
	private String correoElectronico;

	@Column(name = "CONTRASENIA")
	private String contrasenia;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm", timezone="America/Tegucigalpa" )
	@Column(name = "FECHA_CREACION")
	private Date fechaCreacion;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
}
