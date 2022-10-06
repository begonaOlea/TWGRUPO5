package com.curso.modulo5;

public class EjemploArraysMultidimensional {
	
	
	
	
	public static void main(String[] args) {
		
		int[][][][][][] datos;
		int[][][]  datos2[][][];
		
		int[][] d = new int[3][5];
		
		d[0][1] = 4;
		
		for(int[] f: d) {
			for(int c : f){
				System.out.print(c);
			}
			System.out.println();
		}
	
		
		// crear un array de dos dimensiones pero irregular
		
		int[][] notas = new int[3][];
		notas[0] = new int[2];
		notas[1] = new int[3];
		//notas[2] = new int[5];
		notas[1][2] = 7;
		notas[2][1] = 44; //java.lang.NullPointerException notas[2] es null
		
		
		
		
		
		
		
		
		
	}

}
