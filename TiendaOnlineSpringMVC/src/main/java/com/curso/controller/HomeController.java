package com.curso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String inicio(Model model) {
		model.addAttribute("saludo", "Bienvenido a la tienda Online !!");
		model.addAttribute("linea1", "Los mejores precios");
		return "home";		 // WEB-INF/vistas/home.jsp
	}
	
	
	
	
}
