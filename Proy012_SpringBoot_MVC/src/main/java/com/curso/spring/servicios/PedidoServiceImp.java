package com.curso.spring.servicios;

import java.util.Collection;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.curso.spring.entidades.Pedido;
import com.curso.spring.excepciones.PedidosException;
import com.curso.spring.repositorio.PedidoJPARepository;
import com.curso.spring.repositorio.PedidoRepository;

@Service
//@Scope(value = "singleton")
//@Lazy
@Transactional(propagation = Propagation.REQUIRED)
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
	public Pedido generarPedido(Pedido p) { 
		//p.setFechaPedido(new java.util.Date()); 
		//p.setEntregado(false);
		log.info("gestiono un pedido");			
        return repoJPA.save(p);
	} 
	
	@Override
	@Transactional(readOnly = true)
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
	@Transactional(readOnly = true)
	public Optional<Pedido> getPedido(Integer id) {

		return repoJPA.findById(id);

		// return repo.getById(id);
	}

	@Override
	public Pedido modificar(Pedido p) {		
		repoJPA.save(p);		
		return p;
	}
	
	@Override
	public void borrar(Integer id) throws PedidosException {
		//primero lo busco si no esta lanzo la exception
		if(! repoJPA.existsById(id)) {
			throw new PedidosException("el pedido no se pudo borrar. "
					+ "No existe el pedido con el id " + id);
		}
		repoJPA.deleteById(id);	
	}


}
