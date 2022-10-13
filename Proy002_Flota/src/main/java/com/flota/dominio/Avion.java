package com.flota.dominio;

import java.util.Date;

public class Avion 
       extends Vehiculo 
       implements Volable, Reservable{

	protected Avion(String matricula, double cargaMaxima) {
		super(matricula, cargaMaxima);
	}

	@Override
	public double consumoFuel() {
		return 309.90;
	}

	@Override
	public void despegar() {
		System.out.println("despego por la pista como un avion");
	}

	@Override
	public void aterrizar() {
		System.out.println("aterrizo por la pista como un avion");
		
	}

	@Override
	public void volar() {
		System.out.println("vuelo como un avión de dos motores");
		
	}

	@Override
	public void reservar(Date fechaReserva) {
		System.out.println("REservo un vuelo en la fecha " +fechaReserva);
		
	}

}
