package com.curso.mercado.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.mercado.entidades.Producto;
import com.curso.mercado.servicios.ProductosService;

@WebServlet(urlPatterns = "altaProducto",loadOnStartup = 2)
public class AltaProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	//ATRIBUTOS
    ProductosService productoService = new ProductosService();
	
    //CONSTRUCTORES
    public AltaProductoServlet() {
        super();
        System.out.println(".... instanciando AltaProductoServlet");
    	
    }
    
    //METODOS
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
			
		
		//------------
		
		if(msgError.length()>0) {
			System.out.println("fallo " + msgError);
			
			//despache la pagina alta-producto.jsp
			
			//response.getWriter().append("error "  + msgError);
			
			request.setAttribute("errorBego", msgError);
			
			RequestDispatcher rd = request.getRequestDispatcher("alta-producto.jsp");
			rd.forward(request, response);
			
			
		}else {
		
			
			Producto p = new Producto(null, paramDescripcion, precio);
			System.out.println("vamos a dar de alta " + p);
			productoService.darAltaUnproducto(p);
			
			//response.getWriter().append("ok grabó "  + p);
			//despache la pagina lista-productos.jsp
			
			List<Producto> listaProductos = productoService.dameTodosLosProductos();
			
			request.setAttribute("lista", listaProductos);
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/vistas/lista-productos.jsp");
			rd.forward(request, response);
			
		}
		
		
		
	
	}//fin doPost

}
