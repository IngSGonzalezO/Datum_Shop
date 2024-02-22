package com.datumredsoft.shop.endpoint;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datumredsoft.shop.entidades.Usuarios;
import com.datumredsoft.shop.interfaces.UsuariosInterface;
import com.datumredsoft.shop.modelo.CredencialesModelo;
import com.datumredsoft.shop.modelo.RespuestaModelo;
import com.datumredsoft.shop.modelo.UsuarioModelo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/shop/adm/usuarios")
public class UsuariosEndPoint {

	@Autowired
	@Qualifier("UsuariosServices")
	UsuariosInterface usuariosServices;

	@GetMapping(path = "/getAllUsuarios", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Usuarios> getAllUsuarios() {
		return usuariosServices.getAllUsuarios();
	}

	@GetMapping(path = "/getUsuarioById/{usuarioId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Usuarios> getUsuarioById(@PathVariable("usuarioId")  Long usuarioId) {
		return usuariosServices.getUsuarioById(usuarioId);
	}
	
	@PostMapping(path = "/createUsuario", consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
	public RespuestaModelo createUsuario(@RequestBody  UsuarioModelo crearUsuario) {
		return usuariosServices.createUsuario(crearUsuario);
	}
	
	@PostMapping(path = "/getCredenciales", consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
	public RespuestaModelo getCredenciales(@RequestBody  CredencialesModelo credenciales) {
		return usuariosServices.getCredenciales(credenciales);
	}
}
