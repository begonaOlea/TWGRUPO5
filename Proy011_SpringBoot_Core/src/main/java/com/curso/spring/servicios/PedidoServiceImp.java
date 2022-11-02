package com.curso.spring.servicios;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.curso.spring.entidades.Pedido;
import com.curso.spring.repositorio.PedidoRepository;

@Service
//@Scope(value = "singleton")
//@Lazy
public class PedidoServiceImp implements PedidosService {

	private static Logger log = LoggerFactory.getLogger(PedidoServiceImp.class);

	@Autowired
	@Qualifier("pedidoRepoJPA")
	private PedidoRepository repo;	
	
	public PedidoServiceImp() {
		log.info("... instanciando PedidoServiceImp " + repo);
	}
	
	@PostConstruct
	public void init() {
		log.info("... postcosntruct " + repo);
	}

	@Override
	public void generarPedido(Pedido p) {

		log.info("gestiono un pedido");
		repo.add(p);
		// inventariorepo.update(inventario)
	}

}
