package com.curso.test2.pregunta2;

public class App {
	
	public static void main (String [] args) { 
		Customer c1 = new Customer("Larry", "Smith");
		Customer c2 = new Customer("Pedro", "Gonzales"); 
		Customer c3 = new Customer("Penny", "Jones"); 
		Customer c4 = new Customer("Lars", "Svenson"); 
		c4 = null;
		c3 = c2;
		System.out.println (Customer.getCount());
	}

}
