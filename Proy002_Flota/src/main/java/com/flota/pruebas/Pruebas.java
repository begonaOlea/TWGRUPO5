package com.flota.pruebas;

import com.flota.dominio.Vehiculo;

public class Pruebas {

	public static void main(String[] args) {

		Vehiculo camion = new Vehiculo("2345JJJ", 500.10);
//	 camion.cargaMaxima = -555.25;  //atribuot cargaMaxima es public

		try {

			camion.setCargaMaxima(560);
			
			System.out.printf("El camión con matrícula %s "
					+ "tiene una carga actual de %f kg %n",
					camion.getMatricula(), 
					camion.getCargaActual());
			
			System.out.println("cago una caja de 560 kg");
			camion.cargarCaja(460);
			
			System.out.printf("El camión con matrícula %s "
					+ "tiene una carga actual de %f kg %n",
					camion.getMatricula(), 
					camion.getCargaActual());
			
			System.out.println("cago una caja de 100 kg");
			camion.cargarCaja(100); // aqui
			
			
			

		} catch (Exception e) {
			System.out.println("No pudo cargar " + e.getMessage());
		}
	}//fin main
	
	
}//fin clase
