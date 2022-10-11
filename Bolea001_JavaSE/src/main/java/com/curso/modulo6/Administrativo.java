package com.curso.modulo6;

import java.util.Date;

public class Administrativo extends Empleado {
	
	private int id;

	public Administrativo(String nombre, double salario, Date fechaNacimiento) {
		super(nombre, salario, fechaNacimiento);
		// TODO Auto-generated constructor stub
		this.id = 88;
	}
	
	

}
