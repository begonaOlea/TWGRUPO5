package com.curso.mercado.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Producto implements Serializable{
	
	private Integer idProducto;
	private String descripcion;
	private double precio;
	
	
	public Producto() {
		super();
	}


	public Producto(Integer idProducto, String descripcion, double precio) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.precio = precio;
	}


	public Integer getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(idProducto);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(idProducto, other.idProducto);
	}
	
	
	

}
