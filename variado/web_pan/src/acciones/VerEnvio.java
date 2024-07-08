package acciones;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VerEnvio
 */
@WebServlet("/VerEnvio")
public class VerEnvio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerEnvio() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		
		
		
		
	}
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    		try {
			
			enviaProducto(request,response);
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		
		
	}

	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request,response);
		
			
		
		
		
		
	}

	private void enviaProducto(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// TODO Auto-generated method stub
		
		String pruebaDatos=request.getParameter("nomyape");
		
		request.setAttribute("envioProducto", pruebaDatos);
		
		RequestDispatcher elDispat=request.getRequestDispatcher("/leeEnvio.jsp");
		
		elDispat.forward(request, response);
		
		/*
		LosUsuarios elProducto=new LosUsuarios("zz","ww",25,"zz","ww","zz","ww","zz","ww");
		
		request.setAttribute("envioProducto", elProducto);
		
		RequestDispatcher elDispat=request.getRequestDispatcher("/leeEnvio.jsp");
		
		elDispat.forward(request, response);
		*/
		
	}

	
}
