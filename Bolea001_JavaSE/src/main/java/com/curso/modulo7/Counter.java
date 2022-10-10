package com.curso.modulo7;

public class Counter {
	
	private int serialNumber ;
	private static int counter = 0;
	
	public Counter() {
		this.serialNumber= ++counter;
	}
	
	public  int getSerialNumber() {
		//this.counter ++;
		return serialNumber;
	}

	//declaro el metodo static para poder
	//leer el valro de la variable estatica counter
	//sin necesidad de crear una instancia de la clase
	public static int getCounter() {
		return counter;
	}
	
	
	
}
