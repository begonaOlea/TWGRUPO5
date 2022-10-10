package com.curso.modulo7;

public  class Cliente {
	
	private static final double DESCUENTO_MAX = 30.0;
	
	private String nombre;
	
	
	public void verDatos() {
		System.out.println("..... los datos del cliente");
	}
	
	public final void hazAlgo() {
		System.out.println("trabajando ...");
	}

}


final class  ClienteVIP extends Cliente{
	
	@Override
	public void verDatos() {
		super.verDatos();
	}
	@Override
	public void hazAlgo() {
		
	}
	
}

class ClienteExtraVIP extends ClienteVIP{} //error compilación

