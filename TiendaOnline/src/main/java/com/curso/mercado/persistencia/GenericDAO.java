package com.curso.mercado.persistencia;

import java.util.List;

public interface GenericDAO<T> {
	
	public void add(T entidad);
	public List<T> getAll();
	public T getByID(int id);

}
