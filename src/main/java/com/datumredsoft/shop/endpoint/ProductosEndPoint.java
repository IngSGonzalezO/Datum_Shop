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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datumredsoft.shop.entidades.Productos;
import com.datumredsoft.shop.interfaces.ProductosInterface;
import com.datumredsoft.shop.modelo.ProductoscModelo;
import com.datumredsoft.shop.modelo.RespuestaModelo;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/shop/adm/productos")
public class ProductosEndPoint {

	@Autowired
	@Qualifier("ProductosServices")
	ProductosInterface productoServices;

	@GetMapping(path = "/getAllProductos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Productos> getAllProductos() {
		return productoServices.getAllProductos();
	}

	@GetMapping(path = "/getAllProducto1By1/{limite}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Productos> getAllProducto1By1(@PathVariable("limite")  int limite) {
		return productoServices.getAllProducto1By1(limite);
	}
	
	@GetMapping(path = "/getProductosById/{productoId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Productos> getProductosById(@PathVariable("productoId")  Long productoId) {
		return productoServices.getProductosById(productoId);
	}
	
	@PostMapping(path = "/createProductos", consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
	public RespuestaModelo createProductos(@RequestBody  List<ProductoscModelo>  crearProductos) {
		return productoServices.createProductos(crearProductos);
	}
	
	@PutMapping(path = "/updateProductos", consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
	public RespuestaModelo updateProductos(@RequestBody  ProductoscModelo  crearProductos) {
		return productoServices.updateProductos(crearProductos);
	}
	
}
