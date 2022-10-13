package com.curso.modulo7;

public class EjemplosClasesWrapper {
	
	
	public static void main(String[] args) {
		
		int  numero = 2;
		Integer numero2 = new Integer(2);
		
		Integer numero3 = 2; // internamente new Integer(2)
		
		
		int a = numero3; // .intValue()
		
		
		int b = numero3 + new Integer(4);
		
		
		
		// comparacion del valor de la var de ref , esto es 
		// compara la direccion de memoria  ==
		
		//comparar contenido del objeto  .equals()
		
		Integer n1 = 128;
		Integer n2 = 128;
		Integer n3 = new Integer(128);
		
		
		System.out.println("n1 == n2 " + (n1==n2)); //true
		System.out.println("n1 == n3 " + (n1==n3)); //true
		
		if(n1.equals(n2)) {
			System.out.println("n 1 y n2 son iguales");
		}
		
		
		if(n1.equals(n3)) {
			System.out.println("n1 y n3 son iguales");
		}
		
		
		
		
		
		
	}
	

}
