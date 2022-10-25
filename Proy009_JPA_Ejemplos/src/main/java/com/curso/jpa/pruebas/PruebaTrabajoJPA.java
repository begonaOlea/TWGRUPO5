package com.curso.jpa.pruebas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PruebaTrabajoJPA {
	
	public static void main(String[] args) {
		
		//1. Crear una Factoria de Entiny Manager
		EntityManagerFactory factory =
				Persistence.createEntityManagerFactory("OracleHRPU");
		
		//2. Obtenemos un Entity Manager 
		//   que conecta con HR DE ORACLE y mapea clases entidad 
		EntityManager em = factory.createEntityManager();
		
		
	}

}
