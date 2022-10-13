package com.curso.modulo8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PruebasExcepciones {
	
	public static void main(String[] args) {
		
		int resultado = doble("2");
		System.out.printf(" el doble de %d es %d %n", 2, resultado);
		
		guardarResultado("restultados.txt", resultado);

	}
	
	
	public static int doble(String numero) {
		//validar que numero es valido
		
		//la clase wrapper Integer metodo parseInt que  convierte
		//un String en un int  
		//si no puede lanza una excepción 
		int numeroInicial = 0;
		try {
		  //este codigo es susceptible de lanzar NumberFormatEXcetion
	      // u otras 
			numeroInicial	= Integer.parseInt(numero);
		    numeroInicial *= 2;
		    
		}catch(NumberFormatException e) {

			System.out.println("No se puede calcular doble: " + e.getMessage() );
		
		}catch(Exception e) {
			System.out.println("Error desconocido");
		}
		
		//calculo el doble (*2)
		return numeroInicial;
	}
	
	
	
	public static void guardarResultado(String nombreFichero, 
			                           int resultaod) {
		
		//import java.io*
		 File f = new File(nombreFichero);
		 File f2 = new File("parametros.txt");
		 
		 try {
			
			 
			 f.createNewFile();  //throw un IOException
			 
			 FileReader fr = new FileReader(f2);  //throw FileNotFoundException
			
			 System.out.println("....aqui");
		 
		 }catch(FileNotFoundException e ) {
			 System.out.println("el fichero parametros.txt no existe");
			 return ; // antes del retur ejecuta finally
			 
		}catch (IOException e) {
			System.out.println("no puedo crear el fichero salida");
			throw new RuntimeException ("LLAKSDFAS"); // antes de irse ejecuta finally
			
		}catch(Exception e) {
			System.out.println("Error desconocido " + e.getMessage());
		}finally {
			System.out.println("........ siempre si o si me ejecuto");
		}
		 
		 
		 System.out.println("despues del try catch");
		 
		 
		
	}
	
	
	

}
