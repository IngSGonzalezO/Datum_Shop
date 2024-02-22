package com.datumredsoft.shop.interfaces;

import java.util.List;
import java.util.Optional;

import com.datumredsoft.shop.entidades.Productos;
import com.datumredsoft.shop.modelo.ProductoscModelo;
import com.datumredsoft.shop.modelo.RespuestaModelo;

public interface ProductosInterface {

	
	public List<Productos> getAllProductos();
	
	
	public Optional<Productos> getProductosById(Long id);
	
	public List<Productos> getAllProducto1By1(int limite);
	
	public RespuestaModelo createProductos(List<ProductoscModelo> crearProductos);
	
	
	
	public RespuestaModelo updateProductos(ProductoscModelo updateUsuario);

	
	public RespuestaModelo deleteProductoById(Long usuarioId);
	
}
