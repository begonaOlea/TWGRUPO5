package com.flota.informes;

import java.io.PrintStream;

import com.flota.dominio.Vehiculo;

public class InformeCombustibleNecesario {
	
	private Vehiculo[] flota ;

	public InformeCombustibleNecesario(Vehiculo[] flota) {
		super();
		this.flota = flota;
	}
	
	
	public void generateText(PrintStream out) {
		
		
		out.println("..... Informe consumo combustible ");
		
		for(Vehiculo v: flota) {
			out.printf(". el vehículo con matricula %s consume %5.2f %n",
					v.getMatricula(),
					v.consumoFuel());
		}
		//TODO el tema total toda la flota
		
	}
	
	

}
