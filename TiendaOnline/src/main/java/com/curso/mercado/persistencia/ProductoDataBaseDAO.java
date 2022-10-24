package com.curso.mercado.persistencia;

import java.sql.*;
import java.util.*;

import com.curso.mercado.entidades.Producto;

public class ProductoDataBaseDAO 
		implements GenericDAO<Producto>{

	//atritutos
	private Connection con ;
	
	public ProductoDataBaseDAO(Connection con) {
		this.con = con;
	}
	
	@Override
	public void add(Producto entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> getAll()  {

		ArrayList<Producto> productos = new ArrayList<Producto>();
        String consulta = "SELECT * FROM HR.PRODUCTOS";
        try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(consulta);			
			while(rs.next()) {
				Producto p = new Producto();
				p.setIdProducto(rs.getInt("ID_PRODUCTO"));
				p.setDescripcion(rs.getString("DESCRIPCION"));
				p.setPrecio(rs.getDouble("PRECIO"));
				p.setStock(rs.getInt("STOCK"));
				productos.add(p);
			}
			
		} catch (SQLException e) {			
		//	e.printStackTrace();
			// lanzamos una neuva excepcion pero le 
			//pasamos e (Throwable) para que no pierda la pila de llamadas
			// quien realmente la lanza el error, que en este caso es oracle
			throw new RuntimeException("DB JDBC API. " + e.getMessage(), e);
			
		}
        
		return productos;
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
