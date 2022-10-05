package com.flota.dominio;

public class Caja {
	
	private double peso;	
	
	//constructor
	// crear el objeto reservando la memoria
	// necesaria para guardar todos sus atributos
	// Asegura de iniciarlizar los atributos
	// para que el objeto sea consistente  (preparado)
	public Caja() {
	   this.peso = 100;	   
	}

	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		//TODO LO QUE SEA
		//validar peso > 0
		if(peso <= 0) {
			throw new RuntimeException("La caja debe pesar algo");
		}
		this.peso = peso;
	}
}
