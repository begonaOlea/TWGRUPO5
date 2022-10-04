package com.curso.varios;

public class EjemploVariablesReferenciaHeap {
	
	//main - 1er metodo que será llamado
	public static void main(String[] args) {		
		Alumno a = new Alumno(1);
		metodo1(a);
		System.out.println(" id alumno es " + a.getId());
		System.out.println("fin main");				
	}
	
	public static void metodo1(Alumno a) {
		Alumno b = a;
		b.setId(33);
		metodo2();
		
		System.out.println("fin m1");
	}
	
	public static void metodo2() {		
		Alumno c = new Alumno(3);
		
		System.out.println("fin m2");
	}
	

}
