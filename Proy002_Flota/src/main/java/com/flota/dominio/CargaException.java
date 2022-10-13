package com.flota.dominio;

public class CargaException extends Exception{
	
	//atributos que quiero informar 
	private double excesoCarga;
	
	public CargaException(String msg, double excesoCarga) {
		super(msg);
		this.excesoCarga = excesoCarga;
	}

	public double getExcesoCarga() {
		return excesoCarga;
	}
}
