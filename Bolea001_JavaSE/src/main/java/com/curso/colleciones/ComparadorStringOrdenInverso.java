package com.curso.colleciones;

import java.util.Comparator;

public class ComparadorStringOrdenInverso 
             implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return s2.compareTo(s1);
	}
		

}
