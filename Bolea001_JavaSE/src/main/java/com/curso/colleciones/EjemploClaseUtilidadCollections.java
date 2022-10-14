package com.curso.colleciones;

import java.util.*;

public class EjemploClaseUtilidadCollections {
	
	public static void main(String[] args) {
		
		Set<Integer> valores = new HashSet();
		valores.add(25);
		valores.add(42);
		valores.add(3);
		valores.add(8);
		valores.add(12);
		
		for(Integer i : valores) {
			System.out.println(i);
		}
		
		
		
	}

}
