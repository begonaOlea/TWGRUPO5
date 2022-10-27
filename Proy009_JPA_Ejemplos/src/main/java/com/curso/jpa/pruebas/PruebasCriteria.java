package com.curso.jpa.pruebas;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.*;

import com.curso.jpa.entidades.Departamento;
import com.curso.jpa.entidades.Empleado;

public class PruebasCriteria {
	
	public static void main(String[] args) {
		
		//1.  Usando CriteriaBuilder
		//    Obtener todos los departamentos
		//    por localidad  OR  manager
		
		// condicion localidad y manager es opcional
	   //  si no me pasas localidad ni manager devuelvo todos
		// si solo me pasas la localidad devuelvo lo que son de esa localidad
		// si solo me pasas la manager devuelvo lo que tienen ese manager
		// si pasas localidad y manager devolver los departamentos 
		//        que pertenecen a esa localida OOOOOO los que tiene el manager
		
		
		Integer idLocalidad = 1800;
		Integer idManager = 200;

		EntityManagerFactory factory =
							Persistence.createEntityManagerFactory("OraceHRPU");
		EntityManager em = factory.createEntityManager();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		
		CriteriaQuery<Departamento> cq = cb.createQuery(Departamento.class);
		
		//FROM
		Root<Departamento> fromDpto = cq.from(Departamento.class);

		Predicate condicionLoc = null;
		Predicate condicionManager = null;
		
		if(idLocalidad != null) {
			condicionLoc = cb.equal(fromDpto.get("idLocalidad"), idLocalidad);
		}
		
		if(idManager != null) {
			condicionManager = cb.equal(fromDpto.get("idManager"), idManager);
		}
		
		Predicate condicionFinal = null;
		
		if(condicionLoc != null && condicionManager != null) {
			condicionFinal =cb.or(condicionLoc, condicionManager);			
		}else if(condicionLoc != null) {
			condicionFinal = condicionLoc;
		}else if (condicionManager != null) {
			condicionFinal  = condicionManager;
		}
		
		//WHERE
		if(condicionFinal != null) cq.where(condicionFinal);
		
		//ORDER BY
		cq.orderBy(cb.desc(fromDpto.get("nombreDepartamento")));
		
		//ejecutar la consulta
		Query qCriteria = em.createQuery(cq);
		List<Departamento> lista = qCriteria.getResultList();
				
	   System.out.println(".... LOS dapartamenots: ");
				
	   for(Departamento dep : lista) {
			System.out.printf(" %s en la localdia %s con el manager %s %n", 
					dep.getNombreDepartamento(),
					dep.getIdLocalidad(),
					dep.getIdManager());
	   }
		
					
	}

}
