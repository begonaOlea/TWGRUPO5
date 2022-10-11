package com.curso.modulo6.equals;

import java.util.Objects;

public class Cliente {
	
	private int id;
	private String nombre;
	
	
	public Cliente(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Cliente other = (Cliente) obj;
		return id == other.id ;
	}


	
	
	
	
	

}
