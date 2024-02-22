package com.datumredsoft.shop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datumredsoft.shop.dao.UsuariosDao;
import com.datumredsoft.shop.entidades.Usuarios;
import com.datumredsoft.shop.interfaces.UsuariosInterface;
import com.datumredsoft.shop.modelo.CredencialesModelo;
import com.datumredsoft.shop.modelo.RespuestaModelo;
import com.datumredsoft.shop.modelo.UsuarioModelo;

@Service("UsuariosServices")
public class UsuariosServices implements UsuariosInterface {
	
	@Autowired
	UsuariosDao usuariosDao;
	
	@Override
	public List<Usuarios> getAllUsuarios() {
		return  (List<Usuarios>) usuariosDao.findAll();
	}

	@Override
	public Optional<Usuarios> getUsuarioById(Long usuarioId) {

		return usuariosDao.findById(usuarioId);
	}

	@Override
	public RespuestaModelo createUsuario(UsuarioModelo crearUsuario) {
		
		RespuestaModelo respuesta = new RespuestaModelo();
		
		crearUsuario.setIdUsuario(null);
		
		Usuarios usuario = new Usuarios(crearUsuario);
		
		respuesta.setEstado("Exitoso");
		respuesta.setUsuarioRespuesta(usuariosDao.save(usuario));
		
		return respuesta;
	}

	@Override
	public RespuestaModelo updateUsuario(UsuarioModelo updateUsuario) {
		RespuestaModelo respuesta = new RespuestaModelo();
		
		Usuarios usuario = new Usuarios(updateUsuario);
		
		respuesta.setEstado("Exitoso");
		respuesta.setUsuarioRespuesta(usuariosDao.save(usuario));
		
		return respuesta;
	}

	@Override
	public RespuestaModelo deleteUsuarioById(Long usuarioId) {
		
		RespuestaModelo respuesta = new RespuestaModelo();
		
		usuariosDao.deleteById(usuarioId);
		respuesta.setEstado("Exitoso");
		respuesta.setUsuarioRespuesta(null);
		
		
		return respuesta;
	}

	@Override
	public RespuestaModelo getCredenciales(CredencialesModelo credenciales) {
		RespuestaModelo respuesta = new RespuestaModelo();
		
		if(usuariosDao.getCredenciales(credenciales.getUsuario(), credenciales.getContrasenia()) != null) {
			respuesta.setEstado("Exitoso");
			respuesta.setUsuarioRespuesta(null);
			return respuesta;
		}
		
		respuesta.setEstado("Error");
		respuesta.setUsuarioRespuesta(null);
		return respuesta;
	}

}
