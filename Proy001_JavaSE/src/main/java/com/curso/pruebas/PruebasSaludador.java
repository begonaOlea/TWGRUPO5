package com.curso.pruebas;
import java.util.Date;

import com.curso.varios.Saludador;


public class PruebasSaludador {

	public static void main(String[] args) {
		// Uso de la clase Saludador
		
		int numeroCamiones = 2;
		Date fecha  = new Date();
		
		
		//1. Se puede crear un objeto Saludador
		//    crear un objeto de la clase, instanciar un objeto de la clase
		// s1 es una variable de referencia que apunta a objetos de tipo
		// Saludador 
		//com.curso.varios.Saludador s1;
		Saludador s1 = new Saludador();
		
		//2. Pedir saludar pasando nombre -> muestra "Hola" + nombre
		
		//escribo syso    y luego  control + espacio
		System.out.println(s1.saluda("Begoña Olea"));
		

		//3. Pedir saludar sin nombre -> muestra "Hola Amigo"
		System.out.println(s1.saluda());
		
		//4. Crear un saludador en el que indice el saludo
		Saludador s2 = new Saludador("Buenos días");
		
		//5. Pedir saludo sin nombre "Buenos días Amigo"
		System.out.println(s2.saluda());
		
		
		
		
	}

}
