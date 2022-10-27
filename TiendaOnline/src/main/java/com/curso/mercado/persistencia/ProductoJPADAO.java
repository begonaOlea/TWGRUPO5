package com.curso.mercado.persistencia;

import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.curso.mercado.entidades.Producto;

public class ProductoJPADAO implements GenericDAO<Producto> {

	public static 	EntityManagerFactory factory =
			Persistence.createEntityManagerFactory("OracleHRPU");
	
		
	@Override
	public void add(Producto entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Producto entidad) {
		// TODO Auto-generated method stub
		
	}

}
