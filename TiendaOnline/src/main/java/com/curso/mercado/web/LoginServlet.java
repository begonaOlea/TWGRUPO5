package com.curso.mercado.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.curso.mercado.entidades.Usuario;

@WebServlet(urlPatterns = "login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//leer parametros
		
		String nombre = request.getParameter("nombre");
		String rol = request.getParameter("nombre");

		
		
		if(nombre == null || nombre.trim().length()==0) {
			nombre = "invitado";
		}
		if(rol == null || rol.trim().length()==0) {
			rol = "cliente";
		}
		
		Usuario usuario = new Usuario(nombre, rol);
		
		//modo 1. ÁMBITO DE PETICIÓN (REQUEST)
//		request.setAttribute("usuario", usuario);	
//		
//		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//		rd.forward(request, response);
		
		
		//modo 2. ÁMBITO DE SESIÓN (MEJOR)
		
		HttpSession sesion= request.getSession();
		
		sesion.setAttribute("usuario", usuario);
			
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
		
		
		
		
	}

}
