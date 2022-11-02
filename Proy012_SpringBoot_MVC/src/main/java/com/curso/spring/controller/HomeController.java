package com.curso.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.curso.spring.entidades.Usuario;
//Modelo-Vista-Controlador
@Controller
@SessionAttributes("usuario")
public class HomeController {
	
	@GetMapping("/")
	public String inicio(Model model) {
		//model.addAttribute("nombre","Luis");
		if(model.getAttribute("usuario") == null) {
			
			return "redirect:/login";
		}
		return "home";
	}
	
	
}
