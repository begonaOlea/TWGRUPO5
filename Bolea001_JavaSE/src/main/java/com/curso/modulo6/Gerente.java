package com.curso.modulo6;

import java.util.Date;

public class Gerente  extends Empleado{
	
	//atributos  = todos los del padre empleado + suyos
	private String departamento;
	
	
	
	// constructores
	public Gerente(String nombre, double salario, Date fNac, String dpto) {
		super(nombre, salario, fNac); // el constructor de la clase Empleado
		this.departamento = dpto;
	}
	
	public Gerente(String nombre, String dpto) {
		super(nombre); // el constructor de la clase Empleado
		this.departamento = dpto;
	}
	
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	
	@Override
	public String getDetails() {
//		return “Nombre: “ + nombre + “\n”
//				+ “Salario: “ + salario + “\n”
//				+ “Gerente de: “ + departamento;
//	
		return super.getDetails() +  "Gerente de: " + departamento ;
	}
	
//	@Override
	public static void saluda() {
		System.out.println("Hola soy un gerente " );
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
