package usos;

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
import javax.sql.DataSource;

/**
 * Servlet implementation class Ver_productos
 */
@WebServlet("/Ver_productos")
public class Ver_productos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/nombresp")
	private DataSource elPool;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ver_productos() {
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
			
			miConexion=elPool.getConnection();
			
			String orden="SELECT * FROM PRODUCTOS";
			
			miStatement=miConexion.createStatement();
			
			miResultset=miStatement.executeQuery(orden);
			
			while(miResultset.next()) {
				
				String cat=miResultset.getString(1);
				
				String nomar=miResultset.getString(3);
				
				salida.println(cat);
				
				salida.println("  ");
				
				salida.println(nomar+"\n");
				
				
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
