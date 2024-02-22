package com.datumredsoft.shop.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.datumredsoft.shop.entidades.Usuarios;

public interface UsuariosDao extends CrudRepository<Usuarios, Long>  {

	@Query(value="SELECT * FROM USUARIO WHERE USUARIO = :usuario AND CONTRASENIA = :contrasenia", nativeQuery = true)
	public Usuarios getCredenciales (@Param("usuario") String usuario,@Param("contrasenia") String contrasenia);
	
}
