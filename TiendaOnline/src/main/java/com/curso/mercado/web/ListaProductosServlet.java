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


@WebServlet(urlPatterns = "listaProductos")
public class ListaProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListaProductosServlet() {
        super();

    }

    
    // en el navegador pones /tienda/listaProductos  
     // S.A. lee web.xml  url la atiende este Servlet  
    //  enlace / direccion del naveador -> GET
    // viaja la petición desde el navegador al serlet ListaProductosServlet
    // en modo get por lo que llamamos al método doGet
    // le pasa como argumentos obj HttpServletRequest y HttpServletRespose
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// recuperar todos los productos
		ProductosService service = new ProductosService();
		List<Producto> lista = service.dameTodosLosProductos();
		
		// añadir el atributo lista con todos los productos  a la request
		request.setAttribute("lista", lista);
		
		// despachar la peticion a lista-productos.jsp
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/vistas/lista-productos.jsp");
		rd.forward(request, response);
	
	}


}
