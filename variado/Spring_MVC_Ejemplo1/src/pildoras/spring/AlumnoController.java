package pildoras.spring;

import javax.validation.Valid;


import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {
	
	
	
	//metodo para validar el nombre, espacios vacios
	@InitBinder
	public void miBinder(WebDataBinder binder) {
		
		StringTrimmerEditor recortaEspaciosBlanco=new StringTrimmerEditor(true);
		
		binder.registerCustomEditor(String.class, recortaEspaciosBlanco);
	}
	
	
	
	//en el parametro el tipo Model es una interfaz de spring, es el puente entre el controlador y las vistas
	//algo como setAtributte en jsp
	@RequestMapping("/muestraFormulario")
	public String muestraFormulario(Model modelo) {
		
		Alumno elAlumno=new Alumno();
		//elnombre alumno, asi se llamará el objeto en la pagina que lo recibe y alli recien guardará datos
		//en dicho objeto
		modelo.addAttribute("envioAlumno", elAlumno);
		
		return "alumnoRegistroFormulario";
		
	}
	
	//en el parametro anotacion nueva, debemos especificar el nombre q le pusimos al momento que se enviará
	//ahora se le pasa automacticamente un objeto BindingResult que devuelve si he puesto bien o no el nombre-validado
	//para indicarle que estamos usando validacion ponemos como primer parametro
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(@Valid @ModelAttribute("envioAlumno") Alumno alumno,
			BindingResult resultadoValidacion) {
		
		if(resultadoValidacion.hasErrors()) {
			
			return "alumnoRegistroFormulario";
		}else {
			
			return "confirmacionRegistroAlumno";
		}
		
		
		
	}

}
