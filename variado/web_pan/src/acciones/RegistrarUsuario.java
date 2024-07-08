package acciones;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class RegistrarUsuario
 */
@WebServlet("/RegistrarUsuario")
public class RegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
		@Resource(name="jdbc/panChaval")
		private DataSource panPool;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PrintWriter salida=response.getWriter();
		
			
			
			Connection panConexion=null;
			PreparedStatement panState=null;
			
			
			try {
				panConexion=panPool.getConnection();
				
				String regis="INSERT INTO USUARIOS(nombres,apellidos,edad,usuario,clave,email,direccion,"
						+"distrito,departamento) VALUES(?,?,?,?,?,?,?,?,?)";
				
				panState=panConexion.prepareStatement(regis);
				
				panState.setString(1, request.getParameter("nombre"));
				panState.setString(2, request.getParameter("apellido"));
				int edad=Integer.parseInt(request.getParameter("edad"));
				panState.setInt(3, edad);
				panState.setString(4, request.getParameter("usuario"));
				panState.setString(5, request.getParameter("clave"));
				panState.setString(6, request.getParameter("email"));
				panState.setString(7, request.getParameter("direccion"));
				panState.setString(8, request.getParameter("distrito"));
				panState.setString(9, request.getParameter("departamento"));
				
				panState.execute();
				
				salida.println("éxito al registrar");
				
				
					
				salida.println("<br/>");
				salida.println("<br/>");
				
					salida.println("<body>");
					
					salida.println("<br/>");
					salida.println("<a href='index.html'>Volver al inicio");
					
					salida.println("</a>");
					salida.println("</body>");
				
				
				
				
			} catch (Exception e) {
				
				e.printStackTrace();
				
				salida.print("error al registrar");
			}finally{
				salida.close();
				
				try {
					panConexion.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		
		
	}

}
