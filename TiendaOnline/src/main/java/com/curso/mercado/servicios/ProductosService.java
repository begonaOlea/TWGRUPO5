package com.curso.mercado.servicios;

import java.util.List;

import com.curso.mercado.entidades.Producto;
import com.curso.mercado.persistencia.GenericDAO;
import com.curso.mercado.persistencia.ProductoInMemoryDAO;

public class ProductosService {
	
	GenericDAO<Producto> dao = new ProductoInMemoryDAO();
	
	public void darAltaUnproducto(Producto p) {
		// valida que p no es null
		//validar descripcion 
		//validar precio
		
		dao.add(p);
		
	}
	
	public List<Producto>  dameTodosLosProductos() {
		return dao.getAll();
	}

}
