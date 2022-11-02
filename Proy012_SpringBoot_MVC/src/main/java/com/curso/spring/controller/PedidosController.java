package com.curso.spring.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.curso.spring.entidades.Pedido;
import com.curso.spring.servicios.PedidosService;

@Controller
@SessionAttributes("nombre")
public class PedidosController {

	@Autowired
	private PedidosService pedidoService;
	
	@GetMapping("/pedidos")
	public String pedidos(Model model) {
		
		//pedir la lista de pedidos del usuarios session
		String usr = (String) model.getAttribute("nombre");
		System.out.println("en pedidod " + usr);
		Collection<Pedido> lista = pedidoService.getPedidos(usr);
		model.addAttribute("listaPedidos", lista);
		
		return "pedidos";
	}
	
	
	
	
}
