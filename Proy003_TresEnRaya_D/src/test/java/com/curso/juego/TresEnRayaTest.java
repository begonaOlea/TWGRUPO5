package com.curso.juego;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TresEnRayaTest {

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
	public void sumarDosMasDosDara4() {
		
		//datos entra 
		TresEnRaya juego = new TresEnRaya();
		int n = 2;
		int n2 = 2;
		
		//resultado esperado
		
		int espero = 4;
		
		//resultado real 
				
		int r = juego.suma(n,n2);		
		
		//si no coinciden fallo
		if(espero != r)  fail("No sumado 2 + 2 = 4 sino que elr " + r);
	}
	
    @Test(expected = RuntimeException.class)
	public void PonerFichaEnCoordenadaXMalLanzaUnaExcepcion() {
		
    	TresEnRaya juego = new TresEnRaya();
    	// 3 filas y 3 columnas ( 0 a 2)
    	juego.jugar(4,2); //falla si no lanza un RuntimeException
    	
	}
    
    @Test(expected = RuntimeException.class)
  	public void ponerFichaEnCoordenadaYMalLanzaUnaExcepcion() {
  		
      	TresEnRaya juego = new TresEnRaya();
      	// 3 filas y 3 columnas ( 0 a 2)
      	juego.jugar(2,4); //falla si no lanza un RuntimeException
      	
  	}
    
    @Test(expected = RuntimeException.class)
    public void ponerFichaEnPosicionQueYahayOtraLanzaUnaExcepcion() {
    	
    	//Preparar escenario
    	TresEnRaya juego = new TresEnRaya();
    	juego.jugar(0, 0);
    	
    	juego.jugar(0, 0); //debe lanzar una Excepcion
    	
    }
    
    @Test
    public void ponerFichaXeYBienEsperaQueEnEstaPosicionYanoseaNull () {
    	
    	TresEnRaya juego = new TresEnRaya();
    	juego.jugar(0, 0);
    	
    	if(juego.verFicha(0,0) == null ) {
    		fail("La ficha debe estar en esta posición y no hay ficha");
    	}
    	
    }
    
    
    @Test
    public void primerJugadorEsX() {
    	TresEnRaya juego = new TresEnRaya();
    	
    	if (juego.getJugadorActual() != 'X') {
    		fail("El primer judagor debe ser X ");
    	}
  
    }
    
    @Test
    public void siAnterioJugadorEsXAhoraEsO() {
    	TresEnRaya juego = new TresEnRaya();
    	juego.jugar(0, 0);
    	if (juego.getJugadorActual() != 'O') {
    		fail("El primer judagor debe ser O ");
    	}
    }
    
    @Test
    public void siAnterioJugadorEsOAhoraEsX() {
    	TresEnRaya juego = new TresEnRaya();
    	juego.jugar(0, 0);
    	juego.jugar(0, 2);
    	if (juego.getJugadorActual() != 'X') {
    		fail("El primer judagor debe ser X ");
    	}
    }
    
	
	
	

}
