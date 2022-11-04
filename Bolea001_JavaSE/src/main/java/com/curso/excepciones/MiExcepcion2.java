package com.curso.excepciones;

import java.io.File;
import java.io.IOException;

//Throable 
//      Error  -  OutOfmemory
//      Exception
//           - RuntimeException  : NullPointerException
//                                   JPA, IllegalArgumentException
//           - las demas:  IOException, SQLException

public class MiExcepcion2  {

	
	public static void main(String[] args) throws IOException {

		
		int i = Integer.parseInt("dos");
		
		File f = new File("carta.txt");
		
		f.createNewFile();
	}
}
