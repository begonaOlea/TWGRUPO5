package com.curso.modulo4;

public class Producto {
	
	//atributos
	private int id; //= 0
	private String descripcion; // =null
	private double precio; // = 0.0
	
	//static - variable de clase
	//final - constante
	public static final double PRECIO_MINIMO = 1.2;
	
	public Producto(String s) {
		this.descripcion = s;
		this.precio = PRECIO_MINIMO;
	}
	
	public void incrementarPrecio() {
		int incremento =2;
		this.precio += incremento/200;
	}

}
