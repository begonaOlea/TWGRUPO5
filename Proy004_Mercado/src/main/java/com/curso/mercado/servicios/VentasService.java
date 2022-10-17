package com.curso.mercado.servicios;

import java.util.List;

import com.curso.mercado.entidades.Producto;
import com.curso.mercado.persistencia.ProductoInMemoryDAO;
import com.curso.mercado.servicios.excepciones.VentasException;

public class VentasService {
	
	private ProductoInMemoryDAO productoDAO = new ProductoInMemoryDAO();
	
	
	// todos los metodos para gestionar un proceso de venta
	
	public void comprarProducto(int id, int cantidad) throws VentasException{
		 // caso1.  si comprar un producto que no existe.  lanzo una excepcion
		Producto pAVender = productoDAO.getByID(id);
		if ( pAVender == null) {
			throw new VentasException("Error en la venta. No existe el producto con id "+ id);
		}
		 // si existe , se resta la cantidad del stock
		//     . caso2 existe y no hay stock suficiente . lanzo una excepcion
		//     . caso3 existe y hay stock , se resta el stock actual
		
		if(pAVender.getStock()< cantidad ) {
			throw new VentasException("Error en la venta. No hay stock suficiente ");
		}
		
		//resto la cantidad al stock actual
		
		pAVender.setStock(pAVender.getStock() - cantidad);
		
	}

	
	public List<Producto>  listaProductoVenta(){
		return productoDAO.getAll();
	}

}
