package com.datumredsoft.shop.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datumredsoft.shop.dao.ProductosDao;
import com.datumredsoft.shop.entidades.Productos;
import com.datumredsoft.shop.interfaces.ProductosInterface;
import com.datumredsoft.shop.modelo.ProductoscModelo;
import com.datumredsoft.shop.modelo.RespuestaModelo;

@Service("ProductosServices")
public class ProductosServices implements ProductosInterface {
	
	@Autowired
	ProductosDao productosDao;

	@Override
	public List<Productos> getAllProductos() {
		return (List<Productos>) productosDao.findAll();
	}

	@Override
	public List<Productos> getAllProducto1By1(int limite) {
		
		return productosDao.getAllProductoLimite(limite);
		
	}
	
	@Override
	public Optional<Productos> getProductosById(Long id) {
		
		return productosDao.findById(id);
	}

	@Override
	public RespuestaModelo createProductos(List<ProductoscModelo> crearProductos) {
		RespuestaModelo respuesta = new RespuestaModelo();
		List<Productos> listaProductos = new ArrayList<>();
		
		for(int i = 0; i < crearProductos.size(); i++)
		{
			Productos productos = new Productos(crearProductos.get(i));
			productos.setIdProductos(null);
			listaProductos.add(productos);
		}
		
		productosDao.saveAll(listaProductos);
		respuesta.setEstado("Exitoso");
		respuesta.setUsuarioRespuesta(null);
		
		return respuesta;
	}

	@Override
	public RespuestaModelo updateProductos(ProductoscModelo updateProducto) {
		RespuestaModelo respuesta = new RespuestaModelo();
		
		Productos productos = new Productos(updateProducto);
		
		productosDao.save(productos);
		respuesta.setEstado("Exitoso");
		respuesta.setUsuarioRespuesta(null);
		
		return respuesta;
	}

	@Override
	public RespuestaModelo deleteProductoById(Long usuarioId) {
		RespuestaModelo respuesta = new RespuestaModelo();
		
		productosDao.deleteById(usuarioId);
		respuesta.setEstado("Exitoso");
		respuesta.setUsuarioRespuesta(null);
		
		
		return respuesta;
	}

	

}
