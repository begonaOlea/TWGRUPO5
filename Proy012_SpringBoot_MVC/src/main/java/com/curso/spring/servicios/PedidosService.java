package com.curso.spring.servicios;

import java.util.Collection;

import com.curso.spring.entidades.Pedido;

public interface PedidosService {
	
	void generarPedido(Pedido p);
	Collection<Pedido> getPedidos(String user);

}
