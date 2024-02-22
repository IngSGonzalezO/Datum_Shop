package com.datumredsoft.shop.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name = "PRODUCTOS")
public class Productos implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Productos() {
		//Constructor
	}
	

	public Productos(Productos producto) {
		
		this.nombreProducto = producto.getNombreProducto();
		this.descripcion = producto.getDescripcion();
		this.precio = producto.getPrecio();
		this.marca = producto.getMarca();
		this.moneda = producto.getMoneda();
		this.ranking = producto.getRanking();
		this.imagen = producto.getImagen();
	}



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ID_PRODUCTOS")
	private Long idProductos;

	@Column(name = "NOMBRE_PRODUCTO")
	private String nombreProducto;

	@Column(name = "DESCRIPCION")
	private String descripcion;

	@Column(name = "PRECIO")
	private Long precio;

	@Column(name = "MARCA")
	private String marca;
	
	@Column(name = "MONEDA")
	private String moneda;
	
	@Column(name = "RANKING")
	private Long ranking;

	@Lob
	@Column(name = "IMAGEN")
	private String imagen;

	public Long getIdProductos() {
		return idProductos;
	}

	public void setIdProductos(Long idProductos) {
		this.idProductos = idProductos;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public Long getRanking() {
		return ranking;
	}

	public void setRanking(Long ranking) {
		this.ranking = ranking;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	
}
