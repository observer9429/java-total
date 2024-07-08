package pildoras;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.*;



/**
 * Servlet implementation class Pruebas
 */
@WebServlet("/Pruebas")
public class Pruebas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/nombresDeProductos")
	private DataSource miPool;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Pruebas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter salida=response.getWriter();
		
		response.setContentType("text/plain");
		
		Connection miConexion=null;
		
		Statement miStatement=null;
		
		ResultSet miResultset=null;
		
		try {
			
			miConexion=miPool.getConnection();
			
			String orden="SELECT * FROM PRODUCTOS";
			
			miStatement=miConexion.createStatement();
			
			miResultset=miStatement.executeQuery(orden);
			
			while(miResultset.next()) {
				
				String nomar=miResultset.getString(3);
				
				salida.println(nomar); 
				
			}
			
			
		} catch (Exception e) {
			
			salida.println("falla en algo");
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
