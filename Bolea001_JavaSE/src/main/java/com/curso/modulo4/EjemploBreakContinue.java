package com.curso.modulo4;

public class EjemploBreakContinue {

	public static void main(String... ar) {

		// break y continue

		int a = 7;
		// caso 1. BREAK
//		for (int i = 2; i < a ; i++) {
//			
//			System.out.println(" linea  " + i );
//			if( i == 4 ) break;
//			System.out.println(" y escribo esto   "  );
//			
//		}

		// caso 2. CONTINUE
//		for (int i = 2; i < a; i++) {
//
//			System.out.println(" linea  " + i);
//			if (i == 4)  continue;
//			System.out.println(" y escribo esto   ");
//			// mas codigo 
//            
//		}

		// CASO 3. Break anidado sin etiqueta

		for (int i = 2; i < a; i++) {

			System.out.println(" linea  " + i);

			for (int j = 0; j < 3; j++) {
				System.out.println(j); // 0
				if (i == 4)
					break;
				System.out.println(" y escribo esto   ");
			}
			System.out.println("----- bucle externo ---- ");
			// mas codigo
		}

		// CASO 4. Break anidado con etiqueta
        forexterno:
		for (int i = 2; i < a; i++) {

			System.out.println(" linea  " + i);

			for (int j = 0; j < 3; j++) {
				System.out.println(j); // 0
				if (i == 4)
					break forexterno;
				System.out.println(" y escribo esto   ");
			}
			System.out.println("----- bucle externo ---- ");
			// mas codigo
		}

        
     // CASO 5. Continue anidado con etiqueta
        forexterno:
		for (int i = 2; i < a; i++) {

			System.out.println(" linea  " + i);

			for (int j = 0; j < 3; j++) {
				System.out.println(j); // 0
				if (i == 4)
					continue forexterno;
				System.out.println(" y escribo esto   ");
			}//fin for interno
			System.out.println("----- bucle externo ---- ");
			// mas codigo
		}//fin for externo
        
        
        
        
	}

}
