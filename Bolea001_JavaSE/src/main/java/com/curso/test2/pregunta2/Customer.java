package com.curso.test2.pregunta2;

public class Customer { 
	private String fName; 
	private String lName; 
	private static int count;
	
	public Customer (String first, String last) {
		fName = first;
		lName = last;
		++count;
	}
	
	static { count = 0; }
	
	public static int getCount() {return count; }
}
