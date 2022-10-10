package com.curso.modulo6;

public class Prueba {
	
	
	public static void main(String[] args) {
		
		Empleado e = new Empleado();
		e.setNombre("Luis Ramos");
		e.setSalario(40.000);
		
		Gerente g = new Gerente();
		g.setNombre("Begoña Olea");
		g.setDepartamento("Desarrollo");
		g.setSalario(70000);
		
		System.out.println("g es un gerente? " 
		      + (g instanceof Gerente));
		
		System.out.println("g es un empleado? " 
			      + (g instanceof Empleado));
		
		System.out.println("e es un gerente? " 
			      + (e instanceof Gerente));
		
		
		//una variable de referencia puede apuntar
		//a objetos de su clase o clases hijas
		
		Empleado carlos = new Gerente();
		
		carlos.setNombre("Carlos Romero");
		carlos.setSalario(45000);
		//carlos.setDepartamento("...."); 
		
		//carlos tiene forma de Empleado
		// solo permite acceder a los metodos 
		// declarados en la clase empleado
		
		
		//carlos.setDepartamento("...."); 
		
		carlos = new Empleado();
		
		
		
		
		
		
	}

}
