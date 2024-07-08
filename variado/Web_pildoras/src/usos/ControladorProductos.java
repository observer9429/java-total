package usos;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class ControladorProductos
 */
@WebServlet("/ControladorProductos") 
public class ControladorProductos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Modelo_Producto el_modelo;
	@Resource(name="jdbc/nombresp")
	private DataSource elPool;
	
	
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		
		try {
			
			el_modelo=new Modelo_Producto(elPool);
			
		} catch (Exception e) {
			
			throw new ServletException(e);
						
		}
		
		
		
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		//SEPARAMOS LAS ACCIONES EN 2 METODOS PARA VER LIMPIO EL CODIGO
		
		
		
		//leer	 el parametro del formulario
		String elComando=request.getParameter("instruccion");
		
		
		//sino se enviar el parametro,listar el formulario
		
		if(elComando==null) {
			
			elComando="listar";
		}
		
		//redirigir el flujo de informacion al metodo adecuado
		
		switch(elComando) {
		
		case "listar":
		
			obtenerProductos(request,response);
			break;
			
		case "insertarBBDD":
			
			agregarProductos(request,response);
			break;
			
		case "cargar":
			
			try {
				cargaProductos(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
			
		case "actualizarBBDD":
			
			try {
				actualizaProducto(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
			
		case "eliminar":
			
			try {
				eliminarProducto(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
			
		default 	:
			obtenerProductos(request,response);
		}
		
		 
	}



	private void eliminarProducto(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// capturar el codigo articulo
		
		String codigo=request.getParameter("codigo"); 
		//borrar producto de la bbdd
		
		el_modelo.eliminarProducto2(codigo);
		//volver a listar los productos
		obtenerProductos(request,response);
	}



	private void actualizaProducto(HttpServletRequest request, HttpServletResponse response) throws Exception{
		// leer datos que vengan del formulario
		
		String codigo=request.getParameter("codigo"); 
		String seccion=request.getParameter("seccion");
		String nombreart=request.getParameter("nomart");
	
		
		double precio=Double.parseDouble(request.getParameter("precio"));
		
		
		String importado=request.getParameter("fecha");
		String porigen=request.getParameter("porigen"); 
		
		//crear un objeto de tipo producto con la info del formulario
		
		Productos editarProducto=new Productos(codigo,seccion,nombreart,precio,importado,porigen);
		//actualizar la bbdd con la info del objeto producto
		
		el_modelo.actualizaProducto(editarProducto);
		//volver al listado con la info actualizada
		obtenerProductos(request,response);
	}



	private void cargaProductos(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// leer el codigo que viene del listado
		
		String elCodigo=request.getParameter("codigo");
						
		//enviar el codigo al modelo
		
		Productos elProducto=el_modelo.verProducto(elCodigo);
		
		//colocar atributo correspondiente al codigo
		
		request.setAttribute("productoActualizar", elProducto);
		
		//enviar producto al formulario de actualizar(jsp)
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/actualizarProducto.jsp");
		
		dispatcher.forward(request, response);
	}



	private void agregarProductos(HttpServletRequest request, HttpServletResponse response) {
		
		//leer la informacion del producto que viene del formulario
		
		String codigo=request.getParameter("codigo"); 
		String seccion=request.getParameter("seccion");
		String nombreart=request.getParameter("nomart");
		//String tempo=request.getParameter(precio)
		
		double precio=Double.parseDouble(request.getParameter("precio"));
		
		
		String importado=request.getParameter("fecha");
		String porigen=request.getParameter("porigen"); 
		//crear un objeto de tipo producto
		
		Productos nuevoProducto=new Productos(codigo,seccion,nombreart,precio,importado,porigen);
		
		//enviar el objeto al modelo e inserta el objeto producto a la base
		
		el_modelo.agregarNuevoProducto(nuevoProducto);
		
		//volver al listado del producto
		
		obtenerProductos(request,response);
		
		
		
		
		
	}



	private void obtenerProductos(HttpServletRequest request, HttpServletResponse response) {
		
		//obtener la lista del modelo
		List<Productos> productos;
		
		try {
			
		productos=el_modelo.getProductos();
		
		//agregar lista de productos al request
		
		request.setAttribute("listaproductos", productos);
		
		//envair el request  a la pagina jsp
		
		RequestDispatcher miDispatcher=request.getRequestDispatcher("/ListaProductos.jsp");
		
		miDispatcher.forward(request, response);
		
		
		} catch (Exception e) {
		
		e.printStackTrace();	
		}
		
	}

}
