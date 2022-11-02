package com.curso.spring.ejemplo001;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiAplicacion {
	
	public static void main(String[] args) {
		
//		//SIN SPRING Inyección de la Dependencia
//		SaludoService servicio = new SaludoServiceImp();		
//		servicio.saludar("Amigo");
//		
//		System.out.println("....................");
		
		//CON SPRING IOC
		// ya no voy yo a crear nunca mas una instancias del la clase 
		// SaludoServiceImp
		// sino que voy a solicitar al Contenedor de Beans de Spring
		// que me entrege una instancia
		
		
		//contenedor de beans de spring
		//  es el que maneja el ciclo de vida de los objetos
		
		
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("mis-beans.xml");
		
	//	System.out.println("...solicito el bean saludor1");
	//	SaludoService s1 = (SaludoService) ctx.getBean("saludador1");
		

//		SaludoService s1 = (SaludoService) ctx.getBean("saludadorPrototipo");
//		s1.saludar("soy saludador1");
//		
//		System.out.println(s1);
//		SaludoService s2 = (SaludoService) ctx.getBean("saludadorPrototipo");
//		System.out.println(s2);
//		
		
//		SaludoService sAdios = (SaludoService) ctx.getBean("saludadorAdios");
//		sAdios.saludar(" Soy saludador");
//		
		
		
	}

}
