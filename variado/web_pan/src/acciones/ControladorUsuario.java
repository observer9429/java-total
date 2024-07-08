package acciones;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;



/**
 * Servlet implementation class ControlInicial
 */
@WebServlet("/ControlInicial")
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private ModeloUsuario elUsuario;
	
	@Resource(name="jdbc/panChaval")
	private DataSource elPool;
    /**
     * @see HttpServlet#HttpServlet()
     */
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		try {
			
			elUsuario=new ModeloUsuario(elPool);
			
		} catch (Exception e) {
			
			throw new ServletException(e);
						
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//muestraIndex(request,response);
		
		
	}
	
	/*
	private void muestraIndex(HttpServletRequest request, HttpServletResponse response) {
		
		
		
			try {
			
			String xd="xd";
			
			request.setAttribute("listaproductos", xd);
			
			//envair el request  a la pagina jsp
			
			RequestDispatcher miDispatcher=request.getRequestDispatcher("/index.jsp");
			
			miDispatcher.forward(request, response);
			
			
			} catch (Exception e) {
			
			e.printStackTrace();	
			
			}
		
	}
*/
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		PrintWriter salida=response.getWriter();
		
		String laOpcion=request.getParameter("opcionUsuario");
		
		switch(laOpcion) {
		
		case "registrar":
		
			try {
				registrarUsuario(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
				salida.print("error ewn el metodo registrar");
				
			}
			
			
			break;

			
		default 	:
			
			//muestraIndex(request,response);
			
		}

		
		
	}

	private void registrarUsuario(HttpServletRequest request, HttpServletResponse response) throws Exception{

		String nombres=request.getParameter("nombre");
		String apellidos=request.getParameter("apellido");
		int edad=Integer.parseInt(request.getParameter("edad"));
		String usuario=request.getParameter("usuario");
		String clave=request.getParameter("clave");
		String email=request.getParameter("email");
		String direccion=request.getParameter("direccion");
		String distrito=request.getParameter("distrito");
		 String departamento=request.getParameter("departamento");
		
		
		
		
		 LosUsuarios usuarioNuevo=new LosUsuarios(nombres,apellidos,edad,usuario,clave,email,direccion,distrito,departamento);
		
		elUsuario.registrando(usuarioNuevo);
		
		//muestraIndex(request,response);
		 
	}

}
