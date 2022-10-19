package com.curso.mercado.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.curso.mercado.entidades.Usuario;

@WebServlet(urlPatterns = "login",loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

    public LoginServlet() {
        super();
        System.out.println(".... instanciando LoginServlet");
        
        
    }
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	//contexto de la aplicación
    	// CREO UN ATRIBUTO DE ÁMBITO DE APLICACIÓN
    	// es para todos los usuarios en todas las pagínas/Servlets/jsp
    	System.out.println("..... " + config.getServletContext());
    	config.getServletContext().setAttribute("tituloTienda", "LAS MARAVILLAS");
    }

    
    
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//leer parametros
		
		String nombre = request.getParameter("nombre");
		String rol = request.getParameter("rol");

		
		
		if(nombre == null || nombre.trim().length()==0) {
			nombre = "invitado";
		}
		if(rol == null || rol.trim().length()==0) {
			rol = "cliente";
		}
		
		
		//creo un objeto  por defecto sol esta diponible doPost
		
		Usuario usuario = new Usuario(nombre, rol);
		
		//modo 1. ÁMBITO DE PETICIÓN (REQUEST)
		//objeto usuario ahora lo asigno como un atributo de la peticion
		//solo esta disponble durante el tiempo que dure la petición
	
	//	request.setAttribute("usuario", usuario);	
		
		//sin rd  una vez terminado el doPost finaliza la petición
		//se envía la respuesta al navegador
		//response.getWriter().append("usuario " + usuario.getNombre());
		
		//despacho la petición a un jsp y le envio en atributo
		//colgando de la request
		
	//	RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
	//	rd.forward(request, response);


		//modo 2. ÁMBITO DE SESIÓN (MEJOR)
		
		// getSession obtiene la httpsession del usuario si existe
		//            y sino la crea y me la devuelve
		HttpSession sesion= request.getSession();
		//sesion.isNew()
		//sesion.invalidate();
		//sesion.setMaxInactiveInterval(0); //segundos
		
		sesion.setAttribute("usuario", usuario);
			
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
	
		
		
	}

}
