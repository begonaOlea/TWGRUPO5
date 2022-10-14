package com.curso.mercado.persistencia;

import java.util.List;

import com.curso.mercado.entidades.Producto;

public class ProductoDAO implements GenericDAO<Producto> {

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
