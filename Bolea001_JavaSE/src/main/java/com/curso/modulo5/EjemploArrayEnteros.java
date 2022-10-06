package com.curso.modulo5;

public class EjemploArrayEnteros {
	
	public static void main(String[] args) {
		
		int[] numeros;  //declaro un array de tipos int
		
		numeros = new int[4]; //creo un array de enteros inicializados a 0
		
		numeros[0] = 7;
		//numeros[4] = 8;  //java.lang.ArrayIndexOutOfBoundsException:
		
		for(int n : numeros) {
			System.out.println(n);
		}
		
		
		// declarar e inicializar 
		
		int[] cantidades = { 1, 34, 56, 0,23 }; //crea array de 5 enteros
		
		int[] c ;
		c = new int[] {2,3,0};
		
		
		
	}

}
