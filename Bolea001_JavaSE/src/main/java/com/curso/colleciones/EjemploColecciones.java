package com.curso.colleciones;

import java.util.*;

public class EjemploColecciones {
	
	
	public static void main(String[] args) {
		
		// Collecion  
		//    Set                     NO DUPLICADOS
		//	     HashSet              no ordenados
		//       LinkedHashSet        ordenados por orden de insercion
		//       TreeSet              orden natural (Comparable/Comparator)
		//    List                     PERMITEN DUPLICADOS   //INDEXADOS        
		//       ArrayList      .add(obj)   .add(indi,obj)  .get(ind):obj
		//       LinkedList
		//       Queu
		
		
		Collection c; // Interfaz
	//	Set<String>  s ; // interfaz   Colecciones NO DUPLICADOS
		
		Set s = new HashSet();
		s.add("Zapato");
		s.add("Avión");
		s.add(new Integer(2));
		s.add(3);
		s.add(3);
		
		s.remove("Avión");
		
		for(Object o : s) {
			System.out.println(o);
		}
		
		
		Set<String> nombres = new TreeSet(); //orden alfabetico
				          // new LinkedHashSet(); //orden insercion
				          // new HashSet();
		
		nombres.add("Begoña");
		nombres.add("Mario");
		nombres.add("Carlota");
		nombres.add("Perico");
		boolean añadido = nombres.add("Begoña");
		
		if(!añadido) System.out.println("No pudo añadir otra vez Begoña");
		
		for(String n : nombres) {
			System.out.println(n.toUpperCase());
		}
		
		
		System.out.println("...................");
		
		
		Punto p1 = new Punto(0,2);
		Punto p2 = new Punto(1,1);
		Punto p3 = new Punto(1,5);
		Punto p4 = new Punto(1,5); // repite

		
		// NO PERMITE DUPLICADO - NO HAY ORDEN
		Set<Punto> figura = new TreeSet();
				// new HashSet();
		
		figura.add(p1);
		figura.add(p2);
		figura.add(p3);
		figura.add(p4);
		
		for(Punto p : figura) {
			System.out.println(p);
		}
		
		
		// Comparator
		

		Set<String> apellidos = new TreeSet(new ComparadorStringOrdenInverso()); 
		
		apellidos.add("Olea");
		apellidos.add("Alonso");
		apellidos.add("Rosales");
		apellidos.add("Rosales");
		apellidos.add("EtxeOndo");
		
		
		for(String n : apellidos) {
			System.out.println(n.toUpperCase());
		}
		
		
		
		//  COLECCIONS DE TIPO LIST
		
		
		List<String>  paises = new ArrayList<String>();
		paises.add("China");
		paises.add("Egipto");
		paises.add("Italia");
		paises.add("Australia");
		paises.add("Perú");
		paises.add("Perú"); 
		
		paises.add(1,"España");  
	//	paises.add(30,"otro");  //lanza una Excepcion
		
		System.out.println("pais en 0 " + paises.get(0));
		
		System.out.println("............ lista paises: ");
		
		for(String p : paises) {
			System.out.println(p);
		}
		
		
		Collections.sort(paises); // es una collecions String 
		                          // ordena tomando el comparable
		
		System.out.println("............ lista paises ordenado: ");
		for(String p : paises) {
			System.out.println(p);
		}
		
		Collections.sort(paises, new ComparadorStringOrdenInverso());
		
		
		System.out.println("............ lista paises orden inverso: ");
		
		System.out.println("............ lista paises ordenado: ");
		for(String p : paises) {
			System.out.println(p);
		}
		
		
		LinkedList<String>  lista = new LinkedList<String>();
		
		lista.addFirst("Hola");
		lista.add("hola2");
		lista.addLast("asds");
		lista.getFirst();
		
		
		//COLAS
		
		PriorityQueue<Integer> cola = new PriorityQueue<Integer>();
		
		
		cola.add(39);
		cola.add(1);
		cola.add(10);
		cola.add(59);
		cola.add(30);
		
		for(Integer i : cola) System.out.println(i);
		
//		Integer trato  = cola.peek();
//		
//		System.out.println(" me entrega " + trato);
//		System.out.println(cola.peek());
//		System.out.println(cola.peek());
		System.out.println(".....................");
		
		System.out.println(cola.poll());
		System.out.println(cola.poll());
		System.out.println(cola.poll());
		
		System.out.println(".....................");
		for(Integer i : cola) System.out.println(i);
		
		
		
		
		
		
		
	}

}
