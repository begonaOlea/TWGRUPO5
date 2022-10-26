package com.curso.jpa.pruebas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curso.jpa.entidades.Customer;
import com.curso.jpa.entidades.Order;

public class PruebaOneToMany {
	
	public static void main(String[] args) {
		
		//1. Crear una Factoria de Entiny Manager
		EntityManagerFactory factory =
						Persistence.createEntityManagerFactory("OraceHRPU");
				
		//2. Obtenemos un Entity Manager 
		 
		EntityManager em = factory.createEntityManager();
		
		//crear un pedido para un cliente (id 7 Begoña)
		
//		Order pedido = new Order();
//		Customer c7 = new Customer();
//		c7.setId(7);
//		
//		pedido.setCliente(c7);
//		pedido.setDescripcion("Pedido super importante ");
//		
//		em.getTransaction().begin();
//		em.persist(pedido);
//		em.getTransaction().commit();
		
		//BUSCAR EL PEDIDO 13 Y TRAE ADEMAS CLIENTE
//		System.out.println("buscando 13 ..... ");
//		Order o = em.find(Order.class, 13L);
//		System.out.printf("el pedido %s ha"
//				+ " sido hecho por %s",
//				o.getDescripcion(),
//				o.getCliente().getCustomerName());
//		
//		em.clear();
//		
//		System.out.println("buscando otra vez 13 ..... ");
//		Order o2 = em.find(Order.class, 13L);
//		System.out.printf("el pedido %s ha"
//				+ " sido hecho por %s",
//				o2.getDescripcion(),
//				o2.getCliente().getCustomerName());
//		
		System.out.println("... buscamos clienste 7 ");
		Customer begona = em.find(Customer.class, 7);
		
		System.out.println("El cliente  " + begona.getCustomerName());
		System.out.println("pedidos:");
		for (Order or : begona.getPedidos()) {
			System.out.println( or.getDescripcion());
		}
		
		
		
		
		
		
		
	}

}
