package com.curso.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.curso.spring.entidades.Pedido;
import com.curso.spring.servicios.PedidosService;

@SpringBootApplication
public class Proy011SpringBootCoreApplication implements CommandLineRunner {

	
	@Autowired	
	private PedidosService servicio;
	
    @Autowired
	private PedidosService servicio2;
	
	public static void main(String[] args) {
		SpringApplication.run(Proy011SpringBootCoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		servicio.generarPedido(new Pedido());		
		servicio2.generarPedido(new Pedido());
	}
	

}
