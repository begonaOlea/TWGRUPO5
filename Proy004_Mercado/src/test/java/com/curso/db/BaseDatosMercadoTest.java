package com.curso.db;

import static org.junit.Assert.*;

import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.curso.mercado.entidades.Producto;
import com.curso.mercado.servicios.VentasService;
import com.curso.mercado.servicios.excepciones.VentasException;

public class BaseDatosMercadoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void insertarUnNuevoProductoDebeDevolverCount4() {
		
		int contadorEspero = 4;
		
		BaseDatosMercado.add("Camisa Amarilla", 5.9);
		
		assertEquals(BaseDatosMercado.getContador(), contadorEspero);
		
		assertEquals(BaseDatosMercado.findById(4).getDescripcion(), "Camisa Amarilla");

		
	}
	
	@Test
	public void getAllProductos() {
		
		
		Collection<Producto> lista = BaseDatosMercado.getAll();
		assertEquals(lista.size(), 4);
	}
	
	
	@Test
	public void compro4LapicesQueExisteYhayStock() {
		
		VentasService ventas = new VentasService();
		try {
			
		    //antes de comprar 4 laplices hay 5  y espero despues que haya 1
			// producot id 3  es Lapices
			ventas.comprarProducto(3, 4);
			assertEquals(BaseDatosMercado.findById(3).getStock(), 1);
			
		} catch (VentasException e) {
			fail("No puede lanzar esta excepción. ");
		}
	
	}

	
	@Test(expected = com.curso.mercado.servicios.excepciones.VentasException.class)
	public void comproMasLapicesdelosQuehay() throws VentasException {
		
		VentasService ventas = new VentasService();
        ventas.comprarProducto(3, 7777);

	}
	
	
	
	
	
	
	

}
