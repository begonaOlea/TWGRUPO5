package com.curso.modulo6;

import com.curso.modulo5.Punto;

public class EjemploArgVariable {
	
	
	private static int suma(int n, int nn, int nnn) {  // uno
		return n + nn + nnn;
	}
	
	private static int suma(int n, int nn) {   //dos
		return n + nn ;
	}
	
	private static int suma(int... numeros) {  // tres
		int r = 0;
		for(int i :numeros) {
			r += i;
		}
		return r;
	}
	
	
	private void  opera(String tipo, Punto ... datos) {
		
	}
	
	
	public static void main(String[] args) {
		
		suma(2,2,3);  // uno
		suma(2,4); //dos
		
		int[] numerosAsumar = {4,5,6,8};
		suma(numerosAsumar);  //tres
		
		suma(2,3,4,5,55,553,333); //tres
		
	}

}
