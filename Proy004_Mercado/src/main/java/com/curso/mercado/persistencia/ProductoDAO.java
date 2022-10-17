package com.curso.mercado.persistencia;

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
public class ProductoDAO implements GenericDAO<Producto> {

	
	private BaseDatosMercado bd = new BaseDatosMercado();
	
	@Override
	public void add(Producto entidad) {
	   System.out.println("graba en bd " + entidad);
		
	}

	@Override
	public List<Producto> getAll() {
		// TODO crear y devolver una lista de productos
		return null;
	}

}
