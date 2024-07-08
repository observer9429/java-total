package pildoras.spring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//@RequestMapping() va funcionar como raiz relativa, para acceder a esta ruta
@Controller
@RequestMapping("/principal")
public class HolaAlumnosControlador {
	
	
	
	//ahora le indicamos con la anotacion requestmapping
		//mapea la vista que queremos ver
		
		// en parentesis especificamos la URL que el usuario tendra que utilizar, para que le devuelvan
		//el formulario, no es obligatorio que tenga el nombre del metodo que lo llama
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario() {//proporciona el formulario
		
		return "HolaAlumnosFormulario";
	}
	
	
	
	//ahora el metodo que procesa la informacion que el usuario ha brindado
	
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario() {
		
		return "HolaAlumnosSpring";
	}
	
	
	
	
	
	//ahora usaremos el @RequestParam pero como parametro del metodo, el cual ya no será algo mas facil de usar
	
	
	
	@RequestMapping("/procesarFormulario2")
	//ejemplo anterior public String otroProcesoFormulario(HttpServletRequest request,Model modelo) {
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre,Model modelo) {
		
		//usando el requestparam ya no es necesario usar el metodo de la interfaz Http
		//String nombre=request.getParameter("nombreAlumno");
		
		nombre+=" es el mejor alumno";
		 
		String mensajeFinal="¿quien es el mejor alumno? "+nombre;
		
		//agregando informacion al modelo
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		
		return "HolaAlumnosSpring";
	}



}
