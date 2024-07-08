package pildoras.spring;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


//la anotacion Controller es apra indicarle que esa clase es el controlador
@Controller
//@RequestMapping("/inservible") CREO QUE EL CONTROLADOR DE CONTROLADORES NO DEBE TENER RUTA ALGUNA
public class Controlador {
	
	//ahora le indicamos con la anotacion requestmapping
	//mapea la vista que queremos ver
	@RequestMapping
	public String muestraPagina() {
		
		return "paginaEjemplo";
	}

}
