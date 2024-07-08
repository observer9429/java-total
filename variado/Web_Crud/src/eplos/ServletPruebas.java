package eplos;

import java.io.IOException;



import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.*;

import java.sql.*;
import java.util.Date;

/**
 * Servlet implementation class ServletPruebas
 */
@WebServlet("/ServletPruebas")
public class ServletPruebas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//definir o establecer el SataSource
	
	@Resource(name="jdbc/Productos")
	private DataSource miPool;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPruebas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//crear el objeto printWritter
		PrintWriter salida=response.getWriter();
		
		response.setContentType("text/plain");
		
		//crear conexion con la base de datos
		
		Connection miConexion=null;
		
		Statement miStatement=null;
		
		ResultSet miResultSet=null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			miConexion=miPool.getConnection();
			
			String miSql="SELECT * FROM PRODUCTOS"; 
			
			miStatement=miConexion.createStatement();
			
			miResultSet=miStatement.executeQuery(miSql);
			
			salida.println(miResultSet.getString(3));
			
			while(miResultSet.next()) {
				
				System.out.println("empezamos");
				System.out.println("empezamos");
				System.out.println("empezamos");
				
				String ve=miResultSet.getString(3);
				
				
				System.out.println("terminamois");
				System.out.println("terminamois");
				System.out.println("terminamois");
				
				
				salida.println(ve);
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
			salida.println("error al conextaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"
					+ "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
			
		
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
