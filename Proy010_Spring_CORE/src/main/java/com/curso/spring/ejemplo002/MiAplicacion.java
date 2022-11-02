package com.curso.spring.ejemplo002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MiAplicacion {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx =
				new ClassPathXmlApplicationContext("beans-con-anotaciones.xml");
		
		NominasService s = (NominasService) ctx.getBean("nominas");
	//	NominasService s = (NominasService) ctx.getBean("nominasServiceImp");
		
		s.calcularNomina();
	}

}
