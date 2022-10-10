package com.curso.modulo7.enumeraciones;

public enum Palos {
	
	OROS, BASTOS, COPAS, ESPADAS, COMODIN

}

enum ModelosCoche{
	BASICO("Solo tiene motor y ruedas"), //ModelosCoche.BASICO = new ModelosCoche("Solo tiene motor y ruedas")
	MEDIO("tiene aireacondicionado"), 
	SUPERIOR("con navegador");
	
	//atributos
	private String descripcion;
	
	//constructores
	private ModelosCoche(String s) {
		this.descripcion =s;
	}
	//metodos
	public String getDescripcion() {
		return descripcion;
	}
	
}
