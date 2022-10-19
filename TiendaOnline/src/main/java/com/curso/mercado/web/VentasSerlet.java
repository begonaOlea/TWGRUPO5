package com.curso.mercado.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "comprar")
public class VentasSerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public VentasSerlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//leer parametro que recibe el idProducto
		//comprar 1 unidad
		
	}

	
}
