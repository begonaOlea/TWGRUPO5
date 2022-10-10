package com.curso.modulo6;

public class Granja {
	
	
	public void alimentarAnimales(Animal[] lista) {
		
		for(Animal a : lista) {
			if( a instanceof PerroCaza) {
				((PerroCaza) a).olfatearPresa();
			}
			a.comer();
		}
	}
	
	public static void main(String[] args) {
		
		Animal[] animales = {
				new Perro(),
				new Gato(),
				new Perro(),
				new PerroCaza(),
				new Vaca()
		};
		
		Granja granja = new Granja();
		granja.alimentarAnimales(animales);
		
	}

}
