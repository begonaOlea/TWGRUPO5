package main.java.com.curso.rrhh;

import java.sql.*;


public class EjemploUsoAPIJDBC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// API JDBC    java.sql
		//1. Cargar Driver JDBC Oracle 11
		
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
			
			String url = "jdbc:oracle:thin:@192.168.8.99:49161:xe";
			String usr =  "SYSTEM";
			String clave = "oracle";
			
			try(Connection con = DriverManager.getConnection(url, usr, clave);) {
					
				System.out.println("conectó ok");
		        
				
				//3. consultar la lista de paises
				
				Statement st = con.createStatement();
				
				// st.executeQuery (...) -> ResultSet
//				// st.executeUpdate (...)  -> int numero de reg afectados
				
				
				//3.1. lanzar la cnsulta a la bd
				ResultSet rs = st.executeQuery(
						"SELECT * FROM HR.COUNTRIES");
				
				
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
				
//				String sentenciaInsert = 
//						"INSERT INTO HR.COUNTRIES"
//						+ " VALUES ( 'XX' , 'PAISXX', 4) ";
//				
//				int regAfectado = st.executeUpdate(sentenciaInsert);
//				
//				System.out.printf("insertó %d registros", regAfectado);
//				
				
				//Connection  
			    //        Statement
				//        PreparedStatement
				//        CallableStatement  ( llama a procedimientos
				
				// sentencia sql SELECT, INSERT, DELETE, ... completa
				//Statement sentencia = con.createStatement();
				
				String modifPais = "UPDATE HR.COUNTRIES "
						+ " SET COUNTRY_NAME = ? "
						+ " WHERE COUNTRY_ID = ? "; 
				PreparedStatement ps = con.prepareStatement(modifPais);
				
				String pais = "ArgentinaModif2";
				String codigo = "AR";//"AR' OR '1'='1" ; 
				
				//pasar parametros  
				ps.setString(1, pais);
				ps.setString(2, codigo);
				//ps.setInt(2,  codigo);
				
				
				System.out.println(modifPais);
				
			//	int rows= ps.executeUpdate();
			//	System.out.println(" has modificado el pais " + rows);				
				
			    // crear un objeto oracle PROC ALMACENADO
//				String crearProcAlmacenado = 
//						"create or replace PROCEDURE    HR.Ver_NombrePais "
//						+ "(PARAM_COD_PAIS IN varchar, PARAM_NOMBRE_PAIS OUT VARCHAR ) AS "
//						+ "BEGIN    "
//						+ "      SELECT COUNTRY_NAME  INTO PARAM_NOMBRE_PAIS "
//						+ "      FROM HR.COUNTRIES    "
//						+ "      WHERE COUNTRY_ID = PARAM_COD_PAIS; "
//						+ "END; ";
//				con.createStatement().execute(crearProcAlmacenado);				
				
				//Llamar desde Java a un proc almacenado
				
				CallableStatement call =
						con.prepareCall("{call HR.Ver_NombrePais(?,?)}");
				
				//String codigo = "AR"
				// preparamos el parametro de entrada codigo pais
				call.setString(1, codigo);
				
				//preparar el parametrode salida que es el nombre
				call.registerOutParameter(2, java.sql.Types.VARCHAR);
				
				//ejecutar el proc almacenado
				call.executeQuery();
				
				//leer valor recuperado
				String nombrePaisRecuperado = call.getString(2);
				
				System.out.printf("nombre del país %s es %s. %n",
						codigo, nombrePaisRecuperado);
				
				modificarPaises(con,"AR","US");
				
			} catch (SQLException e) {
                System.out.println("Error conexión " + e.getMessage());
				e.printStackTrace();
			}

			
		
	}
	
	
	public static void modificarPaises(Connection conexion, String... codigos) {
		
		// Crear un contextos transaccional
		// en el que se ejecutan como un todo varias sentencias sql
		// si una falla deben fallar todas
		try {
			conexion.setAutoCommit(false);
			
			String modifPais = "UPDATE HR.COUNTRIES "
					+ " SET COUNTRY_NAME = COUNTRY_NAME" + " || 'ppp' "
					+ " WHERE COUNTRY_ID = ? "; 
			PreparedStatement ps = conexion.prepareStatement(modifPais);
			
			
			for(String codigo: codigos) {
				ps.setString(1, codigo);
				ps.executeUpdate();
			}
			
			//error
			//conexion.createStatement().execute("asdfal");
						
			conexion.commit();
			
		} catch (Exception e) {	
			e.printStackTrace();
			System.out.println(e.getMessage());
			try {
				conexion.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
		
	
		
		
		
	}
	

	
	
	
	
}
