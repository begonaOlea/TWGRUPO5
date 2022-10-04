package com.curso.varios;

public class EjemploVariablesPila {
	
	//main - 1er metodo que será llamado
	public static void main(String[] args) {		
		int a = 2;
		metodo1(a);
		System.out.println("fin main");				
	}
	
	public static void metodo1(int a) {
		int b = a;		
		metodo2();
		
		System.out.println("fin m1");
	}
	
	public static void metodo2() {		
		int c = 3;
		//if (c == 3) throw new RuntimeException("la has liado");
		String s = null;
		s.toUpperCase(); // NullpointerException
		System.out.println("fin m2");
	}
	

}
