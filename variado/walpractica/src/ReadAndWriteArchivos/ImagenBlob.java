package ReadAndWriteArchivos;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ImagenBlob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			//crea conexion
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/ver", "root", "");
			//crear objeto statement
			
			
			String sql="INSERT INTO FOTOS(imagenes) VALUES(?)";
			
			PreparedStatement state=miConexion.prepareStatement(sql);
			
			FileInputStream archivolee=new FileInputStream("C:/Users/warez9429/Desktop/ejecutables/we.jpg");
			
			state.setBlob(1, archivolee);
			
			state.execute();
			
			
				System.out.println("agregado con éxito");
			
			
			
		}catch(Exception e) {
			
			System.out.println("NO CONECTA");
			
			e.printStackTrace();
			
			
		}

	}
	
	
	

}
