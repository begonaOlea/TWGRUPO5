package com.curso.mercado.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.mercado.entidades.Producto;

public class AltaProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AltaProductoServlet() {
        super();
        System.out.println(".... instanciando AltaProductoServlet");
    }

	protected void doPost(HttpServletRequest request, 
			              HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("..... estoy en el doPost");
		
		//leer los parametros que recibo en la petición HTTP
		//si el parametro no existe devuelve null
		
		String paramDescripcion = request.getParameter("descripcion");
		String paramPrecio = request.getParameter("precioUnidad");
		
		//validar parametros
		String msgError = "";
		
		if(paramDescripcion == null || paramDescripcion.trim().length() == 0 ) {
			msgError = "Debes indicar una descripción para el producto";
		}
		
		double precio = 0;
		if(paramPrecio == null || paramPrecio.trim().length() == 0 ) {
			msgError = "Debes indicar un precio para el producto";
		}else {
			// String precio en un double
			precio = Double.parseDouble(paramPrecio); //falta controlar excepcion
		}
			
		Producto p = new Producto(null, paramDescripcion, precio);
		System.out.println("das de alta " + p);
		
		
		
	
	}//fin doPost

}
