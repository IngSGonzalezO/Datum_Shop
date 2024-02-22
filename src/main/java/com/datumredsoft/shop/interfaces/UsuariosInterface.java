package com.datumredsoft.shop.interfaces;

import java.util.List;
import java.util.Optional;

import com.datumredsoft.shop.entidades.Usuarios;
import com.datumredsoft.shop.modelo.CredencialesModelo;
import com.datumredsoft.shop.modelo.RespuestaModelo;
import com.datumredsoft.shop.modelo.UsuarioModelo;

public interface UsuariosInterface {

	/**
	 * Método que obtiene todas los Usuarios
	 * @return una lista objecto de tipo Usuario
	 */
	public List<Usuarios> getAllUsuarios();
	
	/**
	 * Método que obtiene el Usuarios por id
	 * @param id Id del Usuario a buscar
	 * @return un objecto de tipo Usuario
	 */
	public Optional<Usuarios> getUsuarioById(Long id);
	
	/**
	 * Método que valida la credenciales para el login
	 * @param credenciales Objecto con las credenciales.
	 * @return Retorna el estado exitoso.
	 */
	public RespuestaModelo getCredenciales (CredencialesModelo credenciales);
	
	/**
	 * Método que realiza el guardado del objeto del Usuarios
	 * @param Usuarios Objeto a guardar en el Usuario.
	 * @return un objecto de tipo Usuario
	 */
	public RespuestaModelo createUsuario(UsuarioModelo usuarios);
	
	
	/**
	 * Método que realiza el guardado del objeto del Usuarios
	 * @param Usuarios Objeto a actualizar en el Usuario clasificador.
	 * @return un objecto de tipo Usuario
	 */
	public RespuestaModelo updateUsuario(UsuarioModelo updateUsuario);

	/**
	 * Método que realiza la eliminacion de los Usuarios a partir del id del clas 
	 * @param clasId Id del clasificador 
	 * @return un objecto de tipo booleano con el estado del proceso
	 */
	public RespuestaModelo deleteUsuarioById(Long usuarioId);
	
}
