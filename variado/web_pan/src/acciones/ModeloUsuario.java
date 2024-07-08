package acciones;

import java.sql.*;

import javax.sql.DataSource;



public class ModeloUsuario {

	private DataSource conDatos;
	
	private Connection conex=null;
	private PreparedStatement elState=null;
	private ResultSet elRs=null;

	public ModeloUsuario(DataSource conDatos) {
		
		this.conDatos = conDatos;
	}

	public void registrando(LosUsuarios usuarioNuevo) {
		
		try {
			conex=conDatos.getConnection();
			
			String regis="INSERT INTO USUARIOS(nombres,apellidos,edad,usuario,clave,email,direccion,"
					+"distrito,departamento) VALUES(?,?,?,?,?,?,?,?,?)";
			
			elState=conex.prepareStatement(regis);
			
			elState.setString(1,usuarioNuevo.getNombres() );
			elState.setString(2,usuarioNuevo.getApellidos() );
			
			elState.setInt(3, usuarioNuevo.getEdad());
			elState.setString(4,usuarioNuevo.getUsuario() );
			elState.setString(5,usuarioNuevo.getClave() );
			elState.setString(6, usuarioNuevo.getEmail());
			elState.setString(7,usuarioNuevo.getDireccion() );
			elState.setString(8,usuarioNuevo.getDistrito());
			elState.setString(9,usuarioNuevo.getDepartamento());
			
			elState.execute();
			
			System.out.println("exito al registrar");
			
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			
		}
		
		
		
	}
	
	
	
	
	
	
}
