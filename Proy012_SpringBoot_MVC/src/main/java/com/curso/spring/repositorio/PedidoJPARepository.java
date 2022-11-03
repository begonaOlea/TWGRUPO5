package com.curso.spring.repositorio;


import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.curso.spring.entidades.Pedido;

@Repository
public interface PedidoJPARepository 
       extends JpaRepository<Pedido, Integer> {
	
	public static Logger log = LoggerFactory.getLogger(PedidoJPARepository.class);
	
	
	// añadiríamos mas métodos mios si los necesito
	
	@Query("SELECT p FROM Pedido p WHERE p.user = ?1")
	public Collection<Pedido> getAllByUser(String userName);
	
	List<Pedido> findByUser(String user);
	List<Pedido> findByDesc(String desc);
	List<Pedido> findByFechaPedido(Date fechaPedido);
	
	
}




