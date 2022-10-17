package com.curso.test2.pregunta4;

public class Pregunta4 {
	
	 int c; //atribu de la clse Pregunta 4
	 String s;
	 
	 
	public static void main(String[] args) {
		
		
		int a =0;
		int b = 2+ a;
		String ss = null;
		
		
		Pregunta4 p4 = new Pregunta4(); 
		//el constructor se encarga de 
		// crear el objeto en memoria heap (dinamica) 
		// con los atributos (c y s ) y que se inicialicen
		// c = 0    s = null
		
		
		
		

	}

}

interface Downloadable{
    public void download();
}
interface Readable extends Downloadable {  // line n1
    public void readBook();
}
abstract class Book implements Readable { // line 2
    public void readBook(){
        System.out.println("Read Book");
    }
}
class EBook extends Book{  // line n3
    public void readBook(){
        System.out.println("Read E-Book");
} }
