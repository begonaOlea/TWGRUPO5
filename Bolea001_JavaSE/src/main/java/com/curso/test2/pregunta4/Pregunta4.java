package com.curso.test2.pregunta4;

public class Pregunta4 {
	public static void main(String[] args) {

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
