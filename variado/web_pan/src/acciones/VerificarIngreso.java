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
 * Servlet implementation class VerificarIngreso
 */
@WebServlet("/VerificarIngreso")
public class VerificarIngreso extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	LosUsuarios elUsuario=null;
	
	@Resource(name="jdbc/panChaval")
	private DataSource panPool;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerificarIngreso() {
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
		// TODO Auto-generated method stub
		PrintWriter salida=response.getWriter();
		
		String usuario=request.getParameter("usuario");
		String clave=request.getParameter("clave");
		
		Connection ingConexion=null;
		PreparedStatement ingState=null;
		ResultSet logRs=null;
		
		
		try {
			
			ingConexion=panPool.getConnection();
			
			String selec="SELECT * FROM USUARIOS WHERE USUARIO=? AND CLAVE=?";
			
			ingState=ingConexion.prepareStatement(selec);
			
			ingState.setString(1, request.getParameter("usuario"));
			ingState.setString(2, request.getParameter("clave"));
			
			logRs=ingState.executeQuery();
			
			
			
			
			if(logRs.absolute(1)) {
				//logRs.next(); //YA NO SE USA EL NEXT, YA QUE EL METODO usado atras nos devuelve una fila de
				//la tabla
				
				elUsuario=new LosUsuarios(logRs.getString(1),logRs.getString(2),logRs.getInt(3),
						logRs.getString(4),logRs.getString(5),logRs.getString(6),logRs.getString(7),
						logRs.getString(8),logRs.getString(9));
				
				
				
				salida.print("Bievenido "+elUsuario.getNombres());
				
			
				
			}else {
				
				salida.print("usuario no registrado");
			}
			
		} catch (Exception e) {

				e.printStackTrace();
		}

		
		
		
	}

}
