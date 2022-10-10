package com.curso.modulo7.enumeraciones;

import static com.curso.modulo7.enumeraciones.Palos.*;
import static java.lang.Math.*;


public class JuegoCartas {
	
	public static void main(String[] args) {
		
		
		Carta c1 = new Carta(OROS, 2);
		
		
		System.out.println(Palos.OROS);
		System.out.println(Palos.OROS.ordinal());
		
		Palos[] valores = Palos.values();
		
		System.out.println(".... los palos son ");
		for(Palos p: valores) {
			System.out.printf(" %s ordinal %d %n", p , p.ordinal());
			
		}
		
		if(c1.getPalo() == Palos.OROS) {
			System.out.println("..... eres el mejor");
		}
		
		double area = 2* PI * 323.9;
		double aleator  = random();
		
		
		
		
	}

}
