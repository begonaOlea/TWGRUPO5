package com.curso.jpa.pruebas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curso.jpa.entidades.Customer;
import com.curso.jpa.entidades.Record;

public class PruebaOneToOne {

	public static void main(String[] args) {
	
		
		//1. Crear una Factoria de Entiny Manager
		EntityManagerFactory factory =
						Persistence.createEntityManagerFactory("OraceHRPU");
				
		//2. Obtenemos un Entity Manager 
		 
		EntityManager em = factory.createEntityManager();
		
		
		//3. transaccion
		em.getTransaction().begin();
		
		//crear un record
		//crear un cliente que tenga es record
		//buscar el cliente que acabamos de crear
		// y mostar sus datos y  los de su recotd
		Record rec = new Record(null,"REC UNO");
		em.persist(rec);
	    
		Customer cliente = new Customer(null, "Luis Ramos", rec);
		
		em.persist(cliente);
		
		
		em.getTransaction().commit();
		
		int id = 7;//cliente.getId();
		System.out.println ("Buscar el empleado cuyo id es " + id);
	
		Customer cEncontrado = em.find(Customer.class, id);
		if(cEncontrado != null) {
		System.out.printf( "El cliente %s tiene el record %s",
				cEncontrado.getCustomerName(),
				cEncontrado.getRecord().getName());
		}else {
			System.out.println("cliente no encontrado");
		}
		
		
	}

}
