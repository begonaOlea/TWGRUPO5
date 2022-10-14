package com.curso.colleciones;

import java.util.*;

public class EjemplosMap {
	
	public static void main(String[] args) {
		
		
		// Map <<Interface>>
		
		//  . solo trabaja con objetos
		//  . key - único NO DUPLICADOS
		//  . value  - si duplicados 
		
		Map map;
		//map.put(key, value)
		//map.get(key):value
		
		 // key no duplicado - value  
		map = new HashMap();  // no ordenado
		
		
		Map<Integer, Punto> figura = new HashMap();//HashMap();
		
		figura.put(1, new Punto(0,0));
		figura.put(10, new Punto(4,6));
		figura.put(10, new Punto(8,8)); //ahora 10 apunta a (8,8)
		
		
		System.out.println(figura.get(10));
		
		//figura.remove(1);
		System.out.println(figura.get(1));
		
		
		//añado mas puntos
		figura.put(10, new Punto(4,6));
		figura.put(2, new Punto(6,6));
		figura.put(7, new Punto(6,6));
		
		
		Collection<Punto> valores = figura.values();
		Set<Integer> claves = figura.keySet();
		
		
		System.out.println("... recorre los valores");
		for(Punto p : valores) System.out.println(p);
		
		
		System.out.println("....recorre las claves  y sus valores");
		
		for(Integer clave : claves) {
			System.out.println(clave + " " + figura.get(clave));
		}
		
		
		//-----------------
		
		
		
		//HashMap   - recorro la colección a través key no orden
		//LinkedHashMap   - recorro la colección a través key por orden de insercion
		//TreeMap   - recorro la colección a través key por orden de Comparable/Comparato
		

		
		
	}

}
