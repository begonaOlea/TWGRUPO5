package com.curso.modulo6;

import java.util.Date;

public class PruebaEmpleados {
	
	
	public static void main(String[] args) {
		
		Empleado e = new Empleado("Luis");
		e.setNombre("Luis");
		e.setSalario(20000.0);
		
		
		Gerente g = new Gerente("Luis","i");
		g.setNombre("Carlos");
		g.setSalario(23423.0);
		g.setDepartamento("INFORMÁTICA");
		
		System.out.println(e.getDetails());
		System.out.println(g.getDetails());
		
		Administrativo a = new Administrativo("Rob",32,null);
		a.setNombre("Roberto");
		a.setSalario(23423.0);
		System.out.println(a.getDetails());
		
		
		
		Empleado e22 = new Gerente("Rosa","s");
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
		
		Gerente ggg = new Gerente("BEGOÑA",450000.0,new Date(),"Desarrollo");
		
		
		System.out.println(mario.getClass());
		System.out.println(mario.toString());  //mario
		
		
	}

}
