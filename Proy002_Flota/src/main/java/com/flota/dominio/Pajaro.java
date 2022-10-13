package com.flota.dominio;

public class Pajaro implements Volable{

	@Override
	public void despegar() {
		System.out.println("Desdpego desde lo alto");
		
	}
	
	@Override
	public void aterrizar() {
		System.out.println("aterrizo como un pajaro");
		
	}
	
	 @Override
	public void volar() {
		System.out.println("Vuelo batiendo las alas");
		
	}
}
