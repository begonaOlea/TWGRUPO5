package com.curso.modulo6;

import java.util.Date;

public class Empleado {
	
	//constantes
	private static final double SALARIO_BASE = 15000.0;
	
	//atributos
	private String nombre;
	private double salario;
	private Date fechaNacimiento;
	
	
	//constructores
	
	
	public Empleado(String nombre, double salario, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Empleado(String nombre, double salario) {
		this(nombre,salario, null);
	}
	public Empleado(String nombre, Date fechaNacimiento) {
		this(nombre,SALARIO_BASE,fechaNacimiento);
		
	}
	
	public Empleado(String nombre) {
		this(nombre, SALARIO_BASE);
	}
	
	
	//métodos

	public String getDetails() {
		return nombre + " tiene salario " + salario;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public static void saluda() {
		System.out.println("Hola soy un empleado a secas");
	}
	
	

}
