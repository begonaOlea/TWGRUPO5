package com.curso.modulo4;

public class Producto {
	
	//atributos 
	//variables de instancia
	private int id; //= 0
	private String descripcion; // =null
	private double precio; // = 0.0
	
	//static - variable de clase
	//final - constante
	public static final double PRECIO_MINIMO = 1.2;
		
	
	//constructor
	public Producto(String s, double precio) {
		if ( s != null) {
			this.descripcion = s;
		}else {
			this.descripcion = "";// "INDEFINIDO";
		}
		if(precio > 0) {
			this.precio = precio;
		}
	}
		
	public Producto(int id, String descripcion, double precio) {		
		this(descripcion, precio); // llama al constructo Producto(String s) 
		this.id = id;		
	}
	
	public Producto(int id, String descripcion) {
		this(id,descripcion, PRECIO_MINIMO);
	}

	
	public void incrementarPrecio() {
		int incremento =2;
		this.precio += incremento/200;
	}

	public void prueba() {
		int x = (int)(Math.random() * 100);
		int y;
		int z;
		if (x > 50) {
			y = 9;
		}
	//	z = y + x; 
	}
	
}
