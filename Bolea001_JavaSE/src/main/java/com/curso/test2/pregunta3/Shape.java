package com.curso.test2.pregunta3;

abstract class Shape {
	Shape ( ) { 
		System.out.println ("Shape"); 
	}
	protected void area () { 
		System.out.println ("Shape");
	}
}

class Square extends Shape {

	int side;
	Square (int side) {
		//line 1
	}
	public  void area () { 
		System.out.println ("Square");
	}

}

class Rectangle extends Square{
	int len, br;
	Rectangle(int x, int y){
		//line 2
		len = x;
		br = y;
	}
	 void area ( ) { 
		System.out.println ("Rectangle"); 
    }
}