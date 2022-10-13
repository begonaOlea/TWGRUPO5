package com.flota.dominio;

/**
 * Clase que representa un vehiculo de una flota
 * Puede transportas caja
 * Pero tiene carga máxima permitida
 * 
 * @author Bolea
 * @version 1.0
 *
 */
public abstract class Vehiculo {
	
	//atributos
	private double cargaMaxima;
	private String matricula;
	private double cargaActual = 0;
	private int numCajas =0;
	
	
	//public final double  CARGA_MAXIMA_POR_DEFECTO = 5222.78;

	
	//constructores
	public Vehiculo(String matricula, double cargaMaxima) {
		//validar matricula no null
		//validar carga maxima > 0 
		this.matricula = matricula;
		this.cargaMaxima = cargaMaxima;
				
	}
	
	//métodos
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	public double getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(double cargaMaxima) {
		if(cargaMaxima < 0) {
			throw new RuntimeException("No puede pasar una carga máxima negativa");
		}
		this.cargaMaxima = cargaMaxima;
	}

	/**
	 * Método que recibe el peso de la caja a cargar
	 * y incrementa el peso actual del camión y
	 * el número de cajas cargadas
	 * Si el peso no es válid (<0) lanza una exception
	 * Si el peso a cargar supera el max permitido exce...
	 * 
	 * @param peso  peso de la caja a cargar en kg
	 * @throws RuntimeException  el peso de la caja no es válido o supera la carga maxima permitida
	 * 
	 */
	public void cargarCaja(double peso) {
		//validar que el peso es > 0 
		if(peso <= 0) {
			throw new RuntimeException("La caja debe pesar algo");
		}
		// validar que cabe . Que no supera la carga máxima		
		if(peso+cargaActual > cargaMaxima)  {
			throw new RuntimeException("no caben mas cajas");
		}
		
		//puedo cargar luego incremento carga actual y numero de cajas
		this.cargaActual +=peso;
		this.numCajas ++;
				
	}//fin metodo cargar Caja	
	
	//sobrecargo el método cargarCaja para que permita
	//recibir un objeto Caja
	public void cargarCaja(Caja c) {
		cargarCaja(c.getPeso());
	}
	
	
	public double getCargaActual() {
		return cargaActual;
	}
	
	public int getNumCajas() {
		return numCajas;
	}	
	
	public abstract double  consumoFuel();
	
	
}
