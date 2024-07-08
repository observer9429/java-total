package usos;

import java.util.*;
import java.util.Date;

import javax.sql.DataSource;
import java.sql.*;

public class Modelo_Producto {

	
	private DataSource origenDatos;
	
	public Modelo_Producto(DataSource origenDatos) {
		
		this.origenDatos=origenDatos;
		
						
	}
	
	public List<Productos> getProductos() throws Exception{
	
	 List<Productos> losproductos=new ArrayList<>();
	
	Connection miConexion=null;
	Statement miState=null;
	ResultSet miRs=null;
	//establecer la conexion
	miConexion=origenDatos.getConnection();
	
	//crear sentencia sql Y EL STATEMENT
	String orden="SELECT * FROM PRODUCTOS";
	
	miState=miConexion.createStatement();
	//ejecutar la sentencia sql
	
	miRs=miState.executeQuery(orden);
	
	//recorrer el resultset obtenido
	
	while(miRs.next()) {
		
			String codigo=miRs.getString(1); 
	 		String seccion=miRs.getString(2);
	 		String nombreart=miRs.getString(3);
	 		double precio=miRs.getDouble(4);
	 		//Date fecha=miRs.getDate(5);
	 		String importado=miRs.getString(6);
	 		String porigen=miRs.getString(7); 
		
		Productos tempProductos=new Productos(codigo,seccion,nombreart,precio,importado,porigen);
		
		losproductos.add(tempProductos);
		
	}
	
	return losproductos;
	}

	public void agregarNuevoProducto(Productos nuevoProducto) {

		try {
		
		//obtener la conexion
		
		Connection miCon=null;
		PreparedStatement miState=null;
		try {
			
			miCon=origenDatos.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//creal instruccion sql
		
		String inserta="INSERT INTO PRODUCTOS(CÓDIGOARTÍCULO,SECCIÓN,NOMBREARTÍCULO,PRECIO,IMPORTADO,PAÍSDEORIGEN) "
				+ "VALUES(?,?,?,?,?,?)";
		
		
			miState=miCon.prepareStatement(inserta);
		
		
		//establecer los parametros para el producto
		
		miState.setString(1, nuevoProducto.getCodigo());
		miState.setString(2, nuevoProducto.getSeccion());
		miState.setString(3, nuevoProducto.getNombreart());
		miState.setDouble(4, nuevoProducto.getPrecio());
		miState.setString(5, nuevoProducto.getImportado());
		miState.setString(6, nuevoProducto.getPorigen());
		
		//ejecutar la instruccion sql
		
		miState.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Productos verProducto(String elCodigo) {
		
		Productos esteProducto=null;
		Connection miCon=null;
		PreparedStatement miPrep=null;
		ResultSet miRs=null;
		
		String codArt=elCodigo;
		
		try {
			
		
		// establecer conexion con ddbb	
		miCon=origenDatos.getConnection();
		
		//crear sql que busque el producto
		
		String sql="SELECT * FROM PRODUCTOS WHERE CÓDIGOARTÍCULO=?";
		//crear la consulta preparada
		miPrep=miCon.prepareStatement(sql);
		
		//establkecer los parametros
		miPrep.setString(1, codArt);
		
		//ejecutar la consulta
		miRs=miPrep.executeQuery();
		
		if(miRs.next()) {
			String codigo=miRs.getString(1); 
	 		String seccion=miRs.getString(2);
	 		String nombreart=miRs.getString(3);
	 		double precio=miRs.getDouble(4);
	 		//Date fecha=miRs.getDate(5);
	 		String importado=miRs.getString(6);
	 		String porigen=miRs.getString(7); 
	 		
	 		esteProducto=new Productos(codigo,seccion,nombreart,precio,importado,porigen);
			
		}else {
			
			throw new Exception("no hemos encontrado el producto con el código "+codArt);
			
		}
		
		
		//obtener datos de respuesta 
		} catch (Exception e) {
			// TODO: handle exception
		}
		return esteProducto;
	}

	public void actualizaProducto(Productos editarProducto) throws Exception{
		
		Connection laCon=null;
		PreparedStatement elState=null;
		// establkecer la conexion
		
		laCon=origenDatos.getConnection();
		
		//crear sentencia sql
		String elsql="UPDATE PRODUCTOS SET SECCIÓN=?, NOMBREARTÍCULO=?,PRECIO=?,IMPORTADO=?,PAÍSDEORIGEN=?"
				+ " WHERE CÓDIGOARTÍCULO=?";
		
		//creal la consulta preparada
		
		elState=laCon.prepareStatement(elsql);
		
		//establecer los parametros
		
		elState.setString(1, editarProducto.getSeccion());
		elState.setString(2, editarProducto.getNombreart());
		elState.setDouble(3, editarProducto.getPrecio());
		elState.setString(4, editarProducto.getImportado());
		elState.setString(5, editarProducto.getPorigen());
		
		elState.setString(6, editarProducto.getCodigo());
		//ejecutar la instruccion sql
		
		elState.execute();
		
	}

	public void eliminarProducto2(String codigo) throws Exception{
		// establecer la conexion con ddbb
		Connection laCon=null;
		PreparedStatement elState=null;
		// establkecer la conexion
		
		try {
		laCon=origenDatos.getConnection();
		
		//crear instruccion sql de eliminacion
		
		String sqleli="DELETE FROM  PRODUCTOS WHERE CÓDIGOARTÍCULO=?";
		
		//preparar la consulta
		
		elState=laCon.prepareStatement(sqleli);
				
				
		//establecer los parametros de consulta
		
		elState.setString(1, codigo);
		
		//ejecutar sentencia sql
		elState.execute();
		
		}finally {
			elState.close();
			laCon.close();
		}
	}
}
