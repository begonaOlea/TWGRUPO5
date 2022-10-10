package com.curso.modulo7;

public class PruebasCounter {
	// pruebas
		public static void main(String[] args) {
			
			System.out.printf("counter vale %d %n ",Counter.getCounter());
			
			//crear 3 objetos Counter
			Counter c1 = new Counter();
			Counter c2 = new Counter();
			
			//Counter.counter = 9;
			
			Counter c3 = new Counter();
			
			//ver sus serial numbers 
			
			System.out.printf("c1 %d %n c2 %d %n c3 %d %n"
					, c1.getSerialNumber()
					, c2.getSerialNumber()
					, c3.getSerialNumber());
			//y ver lo que vale ahora counter
			System.out.printf("counter vale ahora %d %n ",Counter.getCounter());
			
			
		}

}
