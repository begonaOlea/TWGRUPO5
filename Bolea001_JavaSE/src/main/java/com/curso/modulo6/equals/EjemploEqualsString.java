package com.curso.modulo6.equals;

public class EjemploEqualsString {
	
	public static void main(String[] args) {
		
		String s = "Hola";  // coge/crear el obj "Hola" del Pool String
		
		String p = "Hola";  // coge/crear el obj "Hola" del Pool String  
		
		String x = new String("Hola"); // crear un nuevo obj 
		                               // "Hola" en Memoria dinámica o Heap Memory
		
		
		System.out.println("p == s " + (p == s)); //true
		
		System.out.println("p == x " + (p == x)); //false
		
		// "Hola"  se crea un obj String "Hola" en Pool String
		// s y p apuntan al mismo "Hola"
		
		
		
		//STRING CLASE INMUTABLE
		
		s = "Hola";
		
		s = s.toUpperCase(); //crea un obj string "PEPE" que se asigna a s
		
		System.out.println(s);
		
		
		
		
		
		
		
		
		
	}

}
