package com.flota.pruebas;

import com.flota.dominio.*;
import com.flota.informes.InformeCombustibleNecesario;

public class PruebaAbstraccion {
	
	public static void main(String[] args) {
		
		
		Vehiculo[] flota = new Vehiculo[4];
		flota[0]= new Barcaza("A1111", 1000);
		flota[1]= new Camion("A2222", 1000,3);
		flota[2]= new Barcaza("A33333", 1000);
		flota[3]= new Barcaza("A444", 1000);
		
		for(Vehiculo v: flota) {
			System.out.println(v.getMatricula() + " le cargo una caja");
			v.cargarCaja(new Caja());
		}
		
		InformeCombustibleNecesario inf = 
				new InformeCombustibleNecesario(flota);
		
		inf.generateText(System.out);
		
		
		
		
		
	}

}
