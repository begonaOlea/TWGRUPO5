package com.curso.modulo4;

public class EjemploConversiones {

	
	public static void main(String[] args) {
	
		// 8 tipos primitivos
		
		//entero
		byte b = 1;  // 8 bits  -129 .. 0 .. 127
		short s = 1; // 16 bits
		int i = 1; //32 bits
		long l = 11; //64 bits
		
		// literales enteros
		int numero = 1; // literal de tipo int 32bis
		long n2 = 1; // literal entero 32 bits 1 cabe en un long de 64 bits
		long n3 = 1L; // literal long 64 bits
		//int n4 = 1L; 
		
		//casting enteros
		
		int x = 2;
		long y = x; // cabe  casting implicito
		
		long z = 9999999999L;
		int zz = (int)z; //casting explicito 
		                 // jvm mete la tijera y corta 
		                 // los 33 primeros bits de los 64 existentes
		//0000000000000...00001
		//xxxxxxxxx  00000000...01
		System.out.println(z);
		System.out.println(zz);
		
		//decimales
		float  f = 45.5f;   // 32 bits
		double d = 333.0;  // 64 bits
		
		//literal double 1.0
		//literal flota  1.0f  F o f
		
		long sss = 1;
		
		//caracter
		char letra = 'x';   // 64 bits
		char letra2 = '\u03A6';
		
		System.out.println(letra2);
		
		int valor = letra;
		System.out.println(letra);
		System.out.println((char)(++valor));
		
		
		
		
		
		
	}
}
