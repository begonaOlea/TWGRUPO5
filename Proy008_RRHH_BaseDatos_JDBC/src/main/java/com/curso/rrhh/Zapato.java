package main.java.com.curso.rrhh;

public class Zapato implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("... soy zapato cerrandome");
	}

}
