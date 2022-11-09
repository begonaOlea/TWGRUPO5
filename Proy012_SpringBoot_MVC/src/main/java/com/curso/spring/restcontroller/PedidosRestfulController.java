package com.curso.spring.restcontroller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.spring.entidades.Pedido;
import com.curso.spring.excepciones.PedidosException;
import com.curso.spring.servicios.PedidosService;

@RestController
public class PedidosRestfulController {
	
	@Autowired
	private PedidosService pedidoService;
	
	//GET ALL
	@GetMapping("/ws/pedidos")
	public Collection<Pedido> all(){	
		return pedidoService.getPedidos(null);
	}
	
	// GET BY ID
	@GetMapping("/ws/pedidos/{id}")
	public Pedido byId(@PathVariable Integer id){
    
		System.out.println(id);
		Optional<Pedido>  p = pedidoService.getPedido(id);
		return p.get();
	}

	
	//body {"user":"Luis","desc":"Rosa rojas","fechaPedido":"2022-11-03T11:59:31.000+00:00","entregado":true}
	
	//INSERT
	@PostMapping("/ws/pedidos")
	public Pedido add(@RequestBody Pedido newPedido) {
		
		Pedido  pConId = pedidoService.generarPedido(newPedido);
		
		return pConId;
	}

	//UPDATE
	@PutMapping("/ws/pedidos")
	public Pedido update(@RequestBody Pedido pedidoAModificar) {
				
		Pedido  pModif = pedidoService.modificar(pedidoAModificar);
		
		return pModif;
	}	
	
	//DELETE
	@DeleteMapping("/ws/pedidos/{id}")
	public void deleteById(@PathVariable Integer id) throws PedidosException{	       
			pedidoService.borrar(id);
	}
	

}
