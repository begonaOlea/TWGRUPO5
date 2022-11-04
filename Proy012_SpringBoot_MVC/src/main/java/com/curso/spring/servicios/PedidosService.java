package com.curso.spring.servicios;

import java.util.Collection;
import java.util.Optional;

import com.curso.spring.entidades.Pedido;

public interface PedidosService {
	
	Pedido generarPedido(Pedido p);
	Collection<Pedido> getPedidos(String user);
	Optional<Pedido> getPedido(Integer id);

}
