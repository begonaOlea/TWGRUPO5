package com.curso.modulo4;

public class EjemploAmbitos {

	public static void main(String[] args) {
	
		// variable de tipo primitivo
		
		int a = 2;
		
		// variables de referencia
		
		String s = "hola";
		
		// variables por su ámbito
		//   . variable local  
        //         . declarada como argumento de un metodo o const
		//         . declara dentro de un metodo o dentro de un bloque de código
		//   . variable de instancia
		//           . atributos de una clase
		//   . variable de clase (static)
		//           . atributos de la clase estáticos
		
		
		double pm = Producto.PRECIO_MINIMO;
		
		
		Producto p = new Producto(1,"lápiz"); 
		//ram en la memoira de pila una variable local p
		//ram en la memoria dinámica (heap) objeto Producto
		//    con 3 atributos (var de instancia) id, descr ,precio
		
	//	p.PRECIO_MINIMO = 44.9; // mala practica
	//    Producto.PRECIO_MINIMO = 44.9;
		
		Producto p2 = new Producto(2, "zapato");
		
		Producto p3 = new Producto(3,"coche");
		
		
	
		
		
		
		
		
		

	}

}
