package com.curso.modulo6;

import java.util.Date;

public class PruebaEmpleados {
	
	
	public static void main(String[] args) {
		
		Empleado e = new Empleado();
		e.setNombre("Luis");
		e.setSalario(20000.0);
		
		
		Gerente g = new Gerente();
		g.setNombre("Carlos");
		g.setSalario(23423.0);
		g.setDepartamento("INFORMÁTICA");
		
		System.out.println(e.getDetails());
		System.out.println(g.getDetails());
		
		Administrativo a = new Administrativo();
		a.setNombre("Roberto");
		a.setSalario(23423.0);
		System.out.println(a.getDetails());
		
		
		
		Empleado e22 = new Gerente();
		e22.setNombre("Rosa");
		
		System.out.println(e22.getDetails());
		e22.saluda(); // no estamos sobrecargando . Ejecuta metodo estatico de 
		              // Empleado, es decir, mira el tipo de la var de ref
		
		Empleado.saluda();
		Gerente.saluda();
		
		
		
		Gerente soyGerente = null;
		
		if(e22 instanceof Gerente) {
			soyGerente = (Gerente) e22;	
		}
		
		
		Empleado mario = new Empleado("Mario", 34000.0,new Date());
		
		Gerente g = new Gerente("BEGOÑA",450000.0,new Date(),"Desarrollo");
		
		
		
		
		
	}

}
