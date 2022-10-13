package com.flota.dominio;

public class Camion extends Vehiculo {
	
	private int ejes;
	
	
	public Camion(String matricula, double cargaMaxima, int ejes) {
		super(matricula, cargaMaxima);
		this.ejes = ejes;
	}
	
	
	public Camion(String matricula, double cargaMaxima) {
	//	super(matricula, cargaMaxima);
	//	this.ejes = 2;
		this(matricula, cargaMaxima, 2);
	}


	@Override
	public double consumoFuel() {
		return this.ejes * 10 + this.getCargaActual()*0.07;
	}

}
