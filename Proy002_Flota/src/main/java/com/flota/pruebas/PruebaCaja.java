package com.flota.pruebas;

import com.flota.dominio.Caja;

public class PruebaCaja {

	public static void main(String[] args) {
	
		//variable de tipo primitivo
		int b = 3;
		
		//variable de referencia
		
		Caja c = new Caja();
		Caja c2 = null;
		Caja  c3 = new Caja();
		c2 = c3;
		
		c = null;
		c3 = null;
		
	  
	}

}
