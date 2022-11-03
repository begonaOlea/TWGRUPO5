package com.curso.spring.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.curso.spring.entidades.Usuario;

@Controller
@SessionAttributes("usuario")
public class LoginController {
	
	//@Autowired
	//private LoginService loginService;
	
	//formulario en el que pido usuario y clave
	@GetMapping("/login")
	public String loginPage(Model model) {
		model.addAttribute("usuarioForm", new Usuario());
		return "login";
	}
	
	//recogo los datos del formulario
	@PostMapping("/login")
	public String irAHome(
			Model model,
			@ModelAttribute("usuarioForm") @Valid Usuario usuario,
			BindingResult bindingResult
			) {
		
		//ver si pasó la validación
		if(bindingResult.hasErrors()) {
			return "login";
		}
		
		
		 boolean valido = true; // loginService.validaLog(nombre,clave)
		//TODO  llamara un service para que haga la tare login
		
		if(usuario.getNombre().trim().equalsIgnoreCase("LUIS")) {
			usuario.setRol("cliente");	
		}else {
			usuario.setRol("admin");	
		}
		if(valido) model.addAttribute("usuario", usuario);

		return "home";
	}
	
	

}
