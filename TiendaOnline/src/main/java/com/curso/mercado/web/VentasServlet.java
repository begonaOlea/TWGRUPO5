package com.curso.mercado.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.mercado.servicios.VentasService;
import com.curso.mercado.servicios.excepciones.VentasException;

@WebServlet(urlPatterns = "comprar")
public class VentasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
    public VentasServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//leer parametro que recibe el idProducto
		
		String paramId = request.getParameter("idProducto");
		int idProductoComprar = 0;
		if(paramId != null) {
			idProductoComprar = Integer.parseInt(paramId);  //falta controloar excepcion
		}

		//comprar 1 unidad
		VentasService servicio = new VentasService();
		String mensaje  = "";
		try {
			servicio.comprarProducto(idProductoComprar, 1);
			//compra ok
		     mensaje = "Has comprado una unidad ";
			
		} catch (VentasException e) {
			//crear un atributo msgError que indique que ha pasado
			mensaje = "No se ha comprado. " + e.getMessage();
            
		}
		request.setAttribute("mensaje", mensaje);
		
	//	RequestDispatcher rd = request.getRequestDispatcher("lista-productos.jsp");
		
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/listaProductos");
		rd.forward(request, response);
		
		
	}

	
}
