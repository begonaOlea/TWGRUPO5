package com.curso.varios;

/*
 *   JVM  cargar la clase com.curso.varios.Saludador  (Full Qualified Name)
 */

public class Saludador {

	// atributos
	private String saludo;

	// constructores
	public Saludador() {   //constructor
		super();
		this.saludo = "Hola";
	}
	// public void Saludador() { } // OJO esto es un método

	public Saludador(String saludo) {
		this.saludo = saludo;
	}

	// métodos
	public String saluda(String nombreUsuario) {
		return this.saludo + nombreUsuario;
	}

	// sobrecargar el metodo
	public String saluda() {
		return  this.saludo + " Amigo";
	}

}
