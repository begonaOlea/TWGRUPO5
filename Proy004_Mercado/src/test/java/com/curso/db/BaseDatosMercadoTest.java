package com.curso.db;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

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

}
