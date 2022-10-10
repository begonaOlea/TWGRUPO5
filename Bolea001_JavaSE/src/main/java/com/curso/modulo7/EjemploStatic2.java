package com.curso.modulo7;

import java.sql.Connection;

//    ConexionesBDUtil
public final class EjemploStatic2 {
	
	public static final String USER_DB = "alfresco";
	public static final String URL_DB = "asdfasdfas";
	
	// No que se instancien objetos de la EjemploStatic2
	// se declara el constructor private
	private EjemploStatic2() {
		
	}
	
	public static Connection getConection() {
		return null;
	}
	
	
	
	
}
