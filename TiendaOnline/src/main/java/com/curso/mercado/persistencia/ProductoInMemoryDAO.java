package com.curso.mercado.persistencia;

import java.util.ArrayList;
import java.util.List;

import com.curso.db.BaseDatosMercado;
import com.curso.mercado.entidades.Producto;
/**
 * 
 * 
 *  DAO - Data Access Object
 *  
 * @author begonaolea
 *
 */
public class ProductoInMemoryDAO implements GenericDAO<Producto> {

	
	@Override
	public void add(Producto entidad) {
	  
       BaseDatosMercado.add(entidad.getDescripcion(), entidad.getPrecio());
		
	}

	@Override
	public List<Producto> getAll() {
		
		return new ArrayList( BaseDatosMercado.getAll());
	}

	@Override
	public Producto getByID(int id) {
		return BaseDatosMercado.findById(id);
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
