package com.curso.jpa.pruebas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curso.jpa.entidades.Departamento;
import com.curso.jpa.entidades.Empleado;

public class PruebasEmpleado {
 
	
	public static void main(String[] args) {
	
	   //1. crear la factoria de EM
	   //2. crear un Em
	  // 3. crear una transaccion
	 //   4. crear un EMpleado nuevo  
	    //5. perisistirlo en bd
		//6  confirmar transaccion si ok rollback si fallo
		
		//1. Crear una Factoria de Entiny Manager
		EntityManagerFactory factory =
						Persistence.createEntityManagerFactory("OraceHRPU");
				
		//2. Obtenemos un Entity Manager 
		 
		EntityManager em = factory.createEntityManager();
		
		
		//3. transaccion
		em.getTransaction().begin();
		
		try {			
		
			Empleado e = new Empleado();
			e.setNombre("Luis");
			e.setApellidos("Ramos");

			e.setFechaContratacion(new java.util.Date());
			Departamento d = new Departamento();
			d.setId(10);
			e.setDepartamento(d);
			e.setIdTrabajo("ST_MAN");
			e.setEmail("luis.ramos@curso.es");			
						
			em.persist(e);
			
			System.out.println("Creo el empleado. Nuevo id " + e.getId());
			
			em.getTransaction().commit();
			
		}catch(Exception e) {
			em.getTransaction().rollback();
		}
		
		
		
				
				
	  
   }
}
