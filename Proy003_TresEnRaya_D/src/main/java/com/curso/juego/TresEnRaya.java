package com.curso.juego;

/**
 * Implementa el juego de tres en raya
 * 
 * REQUISITO 01 Una pieza puede colocarse en cualquier espacio vacio de una
 * tablero de 3 x 3 . Cuando una pieza se coloca fuera del eje de las X se lanza
 * un RuntimeException . Cuando una pieza se coloca fuera del eje de las Y se
 * lanza un RuntimeException . Cuando una pieza se coloca en un espacio ocupado
 * por otra pieza se lanza un RuntimeException . cuando una pieza se coloca en
 * un espacio libre y dentro del tablero
 * 
 * * REQUISITO 02
 *   Debemos poder averiguar qué jugador deberá jugar a continuación
 *      . El primer turno debe ser jugado por X
 *      . Si el último turno fue jugado por X, entonces el siguiente turno lo debe jugar Y
 *      . Si el último turno fue jugado por Y, entonces el siguiente turno lo debe jugar x
 * 
 * 
 * @author begonaolea
 */

public class TresEnRaya {

	// atritubos

	private Character[][] tablero;
	private Character jugadorActual;

	// constructor
	public TresEnRaya() {
		this.tablero = new Character[3][3]; // todas las celdas tendran null
		this.jugadorActual = 'X';
	}

	// métodos

	public int suma(int n, int n2) {
		return n + n2;
	}

	public void jugar(int x, int y) {

		validarCoordenadaX(x);
		validarCoordenadaY(y);
        ponerFicha(x,y);


	}// fin ponerFicha

	public Character verFicha(int x, int y) {
		validarCoordenadaX(x);
		validarCoordenadaY(y);
		return this.tablero[x][y];
	}

	private void validarCoordenadaX(int x) {
		// valida x
		if (x < 0 || x > 2) {
			throw new RuntimeException("la ficha no se puede posicionar " + "fuera del tablero. " + "Coordenada x mal");
		}
	}

	private void validarCoordenadaY(int y) {
		// valida y
		if (y < 0 || y > 2) {
			throw new RuntimeException("la ficha no se puede posicionar " + "fuera del tablero. " + "Coordenada y mal");
		}
	}
	
	private void ponerFicha(int x, int y) {
		// valida que no hay ya una pieza en x,y
		if (tablero[x][y] != null) {
			throw new RuntimeException("Ya hay una ficha en esta posición");
		}

		tablero[x][y] = this.jugadorActual;
		
		if(this.jugadorActual == 'X') {
			this.jugadorActual = 'O';
		}else {
			this.jugadorActual = 'X';
		}
	}
	
	public Character getJugadorActual() {
		return jugadorActual;
	}
	
	
	
	

}
