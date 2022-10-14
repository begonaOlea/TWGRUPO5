package com.curso.colleciones;

import java.util.Objects;

public class Punto implements Comparable<Punto> {
	
	private int x;
	private int y;
	
	public Punto(int x , int y) {
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
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return x == other.x && y == other.y;
	}

	/**
	 * Nos dice si el objeto punto o recibido es 
	 * mayor, menor o igual
	 * 
	 * return  int  0 si son iguales, 
	 *              >0 si es mayor
	 *              <0 si es menor
	 * 
	 */
	@Override
	public int compareTo(Punto o) {
		
		if (this.x == o.x && this.y == o.y)
			return 0;
		
		if (this.x == o.x) {
			return this.y - o.y;
		}else {
			return this.x - o.x;
		}
		
	}

	
	
	
	

}
