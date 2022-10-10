package com.curso.modulo7;

public class EjemplosStatic {
	
	private static int revision;
	private int numero;
	
	private static void hazAlgo() {
		
	}
	
	public static class ClaseInterna{
		private int uno;
	}

	public static void main(String[] args) {
		/*
		 *  La variable estatica revisión se crea la primera vez
		 *  que se carga la Clase EjemploStatic y solo hay una
		 *  para toda la aplicación 
		 */
	//	EjemplosStatic.revision = 3;
		EjemplosStatic c = new EjemplosStatic();
		
		
		
		
		
	}//fin main
}



