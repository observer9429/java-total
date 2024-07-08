package the.wolf;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registro_usuario
 */
@WebServlet("/registro_usuario")
public class registro_usuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registro_usuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		PrintWriter salida=response.getWriter();
		
       salida.println("<html><body>");
		
		salida.println("<h1 style='text-align:center'>Prueba Servlet</h1>");
		
		salida.println("Nombre introducido "+ request.getParameter("nombre"));
		
		salida.println("<br/> <br/>");
		
		salida.println("Apellido introducido "+ request.getParameter("apellido"));
		
		salida.println("fecha y hora actual"+ new Date());
		
		salida.println("</body></html>");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		//en el metodo post hay que definir en que formato se va a ver el contenido
		
		response.setContentType("text/html");
	}

}
