package com.curso.modulo5;

/**
 * Clase que modela un punto de las coordenadas cartesianas
 * 
 * @author begonaolea
 */
public class Punto {
	
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return "[" + x + ", " + y + "]";
	}

}
