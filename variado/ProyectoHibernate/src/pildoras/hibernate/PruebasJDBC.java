package pildoras.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebasJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String jdbcURL="jdbc:mysql://localhost:3306/pruebashibernate?useSSL=false";
		
		String usuario="root";
		
		String contra="";
		
		try {
			
			System.out.println("intentando conecta con al DDBB: "+jdbcURL);
			
			Connection miConexion=DriverManager.getConnection(jdbcURL, usuario, contra);
			
			System.out.println("Conexión exitosa");
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}

	}

}
