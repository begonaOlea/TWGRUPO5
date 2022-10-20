package main.java.com.curso.rrhh;

import java.sql.*;

public class EjemploUsoAPIJDBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		//1. Cargar Driver JDBC Oracle 18c
		
			try {

			   Class.forName("oracle.jdbc.driver.OracleDriver");
				
	          //  Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("cargó ok");
			} catch (ClassNotFoundException e) {
				System.out.println("No cargó driver");
				e.printStackTrace();
				return;
			}
			
			//2. Crear una conexión a la BD
			
			String url = "jdbc:oracle:thin:@localhost:49161:xe";
			String usr =  "SYSTEM";
			String clave = "oracle";
			
			try(Connection con = DriverManager.getConnection(url, usr, clave);) {
					
				System.out.println("conectó ok");
		        
				
				//3. consultar la lista de paises
				
				Statement st = con.createStatement();
				
				// st.executeQuery (...) -> ResultSet
//				// st.executeUpdate (...)  -> int numero de reg afectados
				
				
				//3.1. lanzar la cnsulta a la bd
				ResultSet rs = st.executeQuery("SELECT * FROM HR.COUNTRIES");
				
				
				/*
				 *    rs  ->  before resultado
				 *            	registor 1  AR
				 *            	registor 2
				 *            after 
				 * 
				 */
				
		
				while(rs.next()) {
					//leo el primer campo y el segundo
					// columnas van numerada del 1 en adelante
					System.out.print( rs.getString("COUNTRY_ID"));
					System.out.print( rs.getString(2));
					System.out.println( rs.getString(3));
				}
				
			
				//  4. INSERTAR UN PAIS
				
				String sentenciaInsert = 
						"INSERT INTO HR.COUNTRIES"
						+ " VALUES ( 'XX' , 'PAISXX', 4) ";
				
				int regAfectado = st.executeUpdate(sentenciaInsert);
				
				System.out.printf("insertó %d registros", regAfectado);
				
				
				
				
				
				
			} catch (SQLException e) {
                System.out.println("Error conexión " + e.getMessage());
				e.printStackTrace();
			}
			
			
			
			
			
			
		
	}
}
