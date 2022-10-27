package com.curso.jpa.pruebas;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.criteria.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.curso.jpa.entidades.ConsultasRRHH;
import com.curso.jpa.entidades.Departamento;
import com.curso.jpa.entidades.Empleado;

public class PruebasConsultasJPA {
	
	public static void main(String[] args) {
		
		//1. Crear una Factoria de Entiny Manager
		EntityManagerFactory factory =
					Persistence.createEntityManagerFactory("OraceHRPU");
						
		//2. Obtenemos un Entity Manager 
				 
		EntityManager em = factory.createEntityManager();
				
		
		Departamento d = em.find(Departamento.class, 10);
		System.out.println("el departamento es " + d);
		
		
		//QUERY NATIVA (BD)  =>SELECT * FROM DEPARTMENTS;
		//JPA QUERY => SELECT d FROM Departamento d;
		
		// MODO 1 
		Query consulta = em.createQuery("SELECT d "
				+ " FROM Departamento d "
				+ " WHERE d.idManager IS NULL");
		
		List<Departamento> lista =  consulta.getResultList();
		
		System.out.println("Lista de departamentos SIN MANAGER");
		for(Departamento d2 : lista) {
			System.out.println(d2);
		}
		
		
		// MODO 2 - NAMED QUERIES
		Query consulta2 = em.createNamedQuery(ConsultasRRHH.DEPARTAMENTO_ALL);
		
        List<Departamento> lista2 =  consulta2.getResultList();
		
		System.out.println("Lista de todos los departamentos");
		for(Departamento d2 : lista2) {
			System.out.println(d2);
		}

		// MODO 3 - QUERY NATIVA
		Query consulta3 = em.createNativeQuery(
				        "SELECT * FROM DEPARTMENTS", 
						Departamento.class);
		List<Departamento> lista3 =  consulta3.getResultList();
			
		System.out.println("Lista de todos los departamentos");
		for(Departamento d2 : lista3) {
			System.out.println(d2);
		}
		
		// EJECUTAR UNA CONSULTA CON PARAMETROS
		
		Query qConParam = em.createNamedQuery("Departamento.findByManager");
		qConParam.setParameter("idManager", 108);
		
		List<Departamento> departamentos108 = qConParam.getResultList();
		
		System.out.println("Los departamentos del manager 108 son");
		for(Departamento d2 : departamentos108) {
			System.out.println(d2);
		}
		
		
		/*
		SELECT E.*
FROM DEPARTMENTS D INNER JOIN EMPLOYEES E ON  D.MANAGER_ID = E.EMPLOYEE_ID
WHERE D.LOCATION_ID= 1700;

		 */

		String consultaEmpleadoDptoLoc1700 =
				  "SELECT e  FROM Empleado e "
				+ "WHERE e.departamento.idLocalidad = :idLoc";
		
		int idLocalidad = 1700;
		
		Query q = em.createQuery(consultaEmpleadoDptoLoc1700);
		q.setParameter("idLoc", idLocalidad);
		
		List<Empleado> listEmp = q.getResultList();
		
		System.out.println("Lista de empleados depart localidad 1700");  
		
		for(Empleado e : listEmp) {
			System.out.println(e);
		}
		
		
		//CRITERIA
		
		// PANTALLA  Filtro busqeda / lista resultado de la búsqueda
		
		// filtro   NOMBRE 
		// filtro   ID TRABAJO
		 //...
		
		
		String nombre =  "Steven";//null; //""
		String apellido =  null; //"King";
		String idJob = null; //""
		Double salario = 999.0;
		
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		
		// Entidades quiero recuperar 
		CriteriaQuery<Empleado> cq = cb.createQuery(Empleado.class);
		
		//FROM
		Root<Empleado> empleado = cq.from(Empleado.class);
		
		// objeto Predicate que va montando las condiciones del where
				
		Predicate miWhere = null;
		List<Predicate> condiciones = new ArrayList();
		
		//si me has pasado un nombre de empleado lo añado en el where
		if( nombre != null) {
			condiciones.add(cb.equal(empleado.get("nombre"), nombre));			
		}
		if( apellido != null) {
			condiciones.add(cb.equal(empleado.get("apellidos"), apellido));			
		}		
		if( salario != null) {
			condiciones.add(cb.greaterThan(empleado.get("salario"), salario));
		}
		
		// OR  JOBID = 'AD_ASST'
		Predicate todosAnd = cb.and(condiciones.toArray(new Predicate[0]));
		Predicate job = cb.equal(empleado.get("idTrabajo"), "AD_ASST");
		
		Predicate whereFinal = cb.or(todosAnd,job);
		
		cq.where(whereFinal);
			
		//WHERE
	//	if(condiciones.size()>0) {
			//ArrayList  en un array de Predicate
//			Predicate[] condicionesFinal = new Predicate[condiciones.size()];
//		    condiciones.toArray(condicionesFinal);
//			cq.where(condicionesFinal);
//			
			//cq.where( condiciones.toArray(new Predicate[0]));
			
			
	//	}

		
		//ejecutar la consulta
		Query qCriteria = em.createQuery(cq);
		List<Empleado> listaEmpleados = qCriteria.getResultList();
		
		System.out.println(".... LOS EMPLEADOS: ");
		
		for(Empleado emp : listaEmpleados) {
			System.out.printf(" %s %s %n", emp.getNombre(), emp.getApellidos());;
		}
		
		
		
		
		
		
		
	} //fin main
	
}
