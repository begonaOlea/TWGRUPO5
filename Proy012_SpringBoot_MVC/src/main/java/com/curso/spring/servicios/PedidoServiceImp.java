package com.curso.spring.servicios;

import java.util.Collection;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.curso.spring.entidades.Pedido;
import com.curso.spring.repositorio.PedidoJPARepository;
import com.curso.spring.repositorio.PedidoRepository;

@Service
//@Scope(value = "singleton")
//@Lazy
public class PedidoServiceImp implements PedidosService {

	private static Logger log = LoggerFactory.getLogger(PedidoServiceImp.class);

	//@Autowired
	//@Qualifier("pedidoRepo")
	//private PedidoRepository repo;	
	
	@Autowired
	private PedidoJPARepository repoJPA;
	
	public PedidoServiceImp() {
		log.info("... instanciando PedidoServiceImp " + repoJPA);
	}
	
	@PostConstruct
	public void init() {
		log.info("... postcosntruct " + repoJPA);
	}

	@Override
	public void generarPedido(Pedido p) {

		log.info("gestiono un pedido");
		//repo.add(p);
		// inventariorepo.update(inventario)
		repoJPA.saveAndFlush(p);
	}
	
	@Override
	public Collection<Pedido> getPedidos(String user) {
		if(user == null ) {
			//return repo.getAll();
			return repoJPA.findAll();
		}else {
			//return repo.getPedidosByUser(user);
			Pedido pFiltro = new Pedido();
			pFiltro.setUser(user);
			
			return repoJPA.findByUser(user);
			
		}
	}
	
	@Override
	public Pedido getPedido(Integer id) {
		
		return repoJPA.getReferenceById(id);
		
		//return repo.getById(id);
	}

}
