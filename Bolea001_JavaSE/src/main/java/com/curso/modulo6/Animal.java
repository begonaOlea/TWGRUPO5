package com.curso.modulo6;

public class Animal {
	private String sonido;
	
	public void comer() {
		System.out.println("estoy comiendo");
	}
}

class Perro extends Animal{
	private String raza;
	
	@Override
	public void comer() {
		System.out.println("como huesos o pienso");
	}
}

class PerroCaza extends Perro{
	private int altura;
	
	public void olfatearPresa() {
		System.out.println("oliendo la presa");
	}
	
	@Override
	public void comer() {
		System.out.println("como lo que he cazado");
	}
	
}

class Gato extends Animal{
	
	@Override
	public void comer() {
		System.out.println("como ratones");
	}
	
}

class Vaca extends Animal{
	@Override
	public void comer() {
		System.out.println("como hierba");
	}
	
}

