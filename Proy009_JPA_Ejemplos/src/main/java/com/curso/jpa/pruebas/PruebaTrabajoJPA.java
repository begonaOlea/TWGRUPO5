package com.curso.jpa.pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.curso.jpa.entidades.Trabajo;

public class PruebaTrabajoJPA {
	
	public static void main(String[] args) {
		
		//1. Crear una Factoria de Entiny Manager
		EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("OraceHRPU");
		
		//2. Obtenemos un Entity Manager 
		//   que conecta con HR DE ORACLE y mapea clases entidad 
		EntityManager em = factory.createEntityManager();
		
		
		
		//3. Obtener el trabajo con el id "AD_VP"
		
		Trabajo t = em.find(Trabajo.class, "AD_VP");
		if(t == null ) {
			System.out.println("no existe el trabajo AD_VP");
		}else {
			System.out.println(t);
		}
	
		
		//4. Crear un trabajo
		Trabajo tNuevo = new Trabajo("BE_OL",
				"Tareas Super Dificiles",
				33000.0,53000.0 );
		//inicia una  NUEVA transaccional  
		em.getTransaction().begin();
		
		//em.persist(tNuevo);  //insert
		
		//Obtiene la transaccion y la confirma
		em.getTransaction().commit();
		
		//5. Modificacion
		
		
		
		Trabajo tNuevoModificado = new Trabajo("BE_OL",
				"Tareas Super Dificiles de verdad",
				33000.0,53000.0 );
		
		//5. Modo 1 - modificar despues de un find
		try {
			em.getTransaction().begin();
			Trabajo tDesdeBD = em.find(Trabajo.class,
				           tNuevoModificado.getId());
			tDesdeBD.setTituloTrabajo(tNuevoModificado.getTituloTrabajo());
		
			em.getTransaction().commit();
		}catch(Exception e) {
			em.getTransaction().rollback();
		}
			
		//5. Modificar Modo 2. usando em.merge
		
		Trabajo otraVezTrabajoModif = new Trabajo("BE_OL",
				"Tareas Super Dificiles de verdad *",
				38000.0,553000.0 );
		
		
		em.getTransaction().begin();
	
		System.out.println("... merge");
		Trabajo trabajoEnBD = em.merge(otraVezTrabajoModif); 			
		
		System.out.println("... después de  merge");
		//otraVezTrabajoModif no esta attached contra la bd
		otraVezTrabajoModif.setTituloTrabajo("alsdfjalsjdflakjs");
		
		//trabajoEnB si esta sincronizado con la bd
		trabajoEnBD.setTituloTrabajo("este si esta attached");
		System.out.println("... antes commit");
		
		
		em.getTransaction().commit(); //-> update
		System.out.println("... despues commit");
		
		
		//6. Borrar
		
		em.getTransaction().begin();
		
		Trabajo tABorrar = new Trabajo(); //NO ESTA SINCRONIZADO
		tABorrar.setId("BE_OL");
		
		//find objeto
		Trabajo tBD = em.find(Trabajo.class, tABorrar.getId());
		
		//tBD si está sincronizado

		//remove
		em.remove(tBD);
		
		em.getTransaction().commit();
		
		// 7.  CONSULTA JPAQUERY
		Query consulta = em.createQuery("SELECT t FROM Trabajo t");
		
		List<Trabajo> lista = consulta.getResultList();
		System.out.println(".... lista de trabajos");
		for(Trabajo trabajo : lista) {
			System.out.println(trabajo);
		}
				
		
	}

}
