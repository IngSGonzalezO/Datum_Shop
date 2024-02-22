package com.datumredsoft.shop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.datumredsoft.shop.entidades.Productos;

public interface ProductosDao extends CrudRepository<Productos, Long>  {

	@Query(value="SELECT p FROM Productos p")
	public List<Productos> getAllProductoLimite(int limite);
	
}
