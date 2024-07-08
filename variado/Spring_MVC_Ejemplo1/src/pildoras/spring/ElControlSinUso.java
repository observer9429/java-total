package pildoras.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
@RequestMapping("/secundario")
public class ElControlSinUso {

	
	
	
	
	@RequestMapping("/procesarFormulario2")
	//ejemplo anterior public String otroProcesoFormulario(HttpServletRequest request,Model modelo) {
	public String otroProcesoFormulario(@RequestParam("nombreAlumno") String nombre,Model modelo) {
		
		//usando el requestparam ya no es necesario usar el metodo de la interfaz Http
		//String nombre=request.getParameter("nombreAlumno");
		
		nombre+=" es el mejor alumno";
		 
		String mensajeFinal="¿la wea poo xd? "+nombre;
		
		//agregando informacion al modelo
		modelo.addAttribute("mensajeClaro", mensajeFinal);
		
		
		return "HolaAlumnosSpring";
	}
	
	
}
