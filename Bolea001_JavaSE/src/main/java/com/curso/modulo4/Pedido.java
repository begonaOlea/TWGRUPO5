package com.curso.modulo4;

import java.io.Serializable;
import java.util.Date;
/*
 *  Clase entidad 
 *  Represta los datos de un pedido
 */
public class Pedido  implements Serializable {
	
	//atributos
	private int idPedido;
	private Date fechaPedido;
	private int idProducto;
	private int cantidad;
	private String observaciones;
	
	//constructores
	public Pedido(int idPedido, 
			      Date fechaPedido,
			      int idProducto, 
			      int cantidad, 
			      String observaciones) {
		 super(); // la primera inst super() 
		   // llamar al constructor del padre  lo ponga o no
		this.idPedido = idPedido;
		this.fechaPedido = fechaPedido;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.observaciones = observaciones;
	}

	public Pedido(int idPedido) {
		//super(); error poner supper porque this()llama a uns cont que asu ves llama a super
		this(idPedido, new Date(), 0, 0, "");		
	}
	
	
	//getters y setters

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public Date getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		//super.toString()
		return  "Pedido [idPedido=" + idPedido + ", fechaPedido=" + fechaPedido + ", idProducto=" + idProducto
				+ ", cantidad=" + cantidad + ", observaciones=" + observaciones + "]";
	}
	

}
