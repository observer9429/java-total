package pildoras_annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//al agregar la linea de abajo, Spring ya creo un bean

//no es necesario ponerle el mismo nombre de la clase. pero si no se le pone, coge por defecto el nombre de la clase
//pero con la priemra letra en minúscula

//@Component("ElComercial")

@Component

//@Scope("prototype") por el momento con las anotaciones postConstruct y preDestroy no puede
//funcionar con el prototype
public class ComercialExperimentado implements Empleados {

	//ejecucion del codigo despues de la creacion del bean
	
	@PostConstruct
	public void  ejecutaDespuesCreacion() {
		
		System.out.println("ejecutado tras creacion de bean");
	}
	
	
	
	
	//ejecucion del codigo despues de apagar contenedor spring
	@PreDestroy
	public void ejecutaAntesDesctruccion() {
		System.out.println("ejecutando antes de la destruccion");
	}
	
	
	public ComercialExperimentado() {
		
	}
	
	
	
	//con el anotacion autowired spring busca en todo tu proyecto a ver si hay alguna clase que implemente
		//la interfaz CreacionInformeFinanciero
	
	
	//si la clase que va usar el autowired solo tiene un
	//costructor,no es necesario ponerlo, pero si tiene mas de 1, si es obligatorio, si el programa colapsa
	
	
	/*
	
	@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero informeNuevo) {
		super();
		this.informeNuevo = informeNuevo;
	}//mete toda la informacion a la variable informeNuevo

	
	*/
	
	
	/*
	@Autowired
	public void setInformeNuevo(CreacionInformeFinanciero informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "vender, vender y vender más!!!!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeNuevo.getInformeFinanciero();
	}
	
	


//el autowired se puede usar en el metodo, e incluso solamente en el nombre de la variable
	
	//cuando la interfaz es usada por varias clases, se especifica a la clase que se quiere usar
	@Autowired
	@Qualifier("informeFinancieroTrim2")
	private CreacionInformeFinanciero informeNuevo;

}
