package pildoras.spring.validacionespersonalizadas;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload; 

@Constraint(validatedBy=CPostalMadridValidacion.class)//futura clase que contendra la logica de la validacion
@Target({ElementType.METHOD, ElementType.FIELD})//destino de nuiestra validacion a metodos o campos
@Retention(RetentionPolicy.RUNTIME)//chekea la anotacion en tiempo de jecucion
public @interface CPostalMadrid {
	
	 
	//definir el c postal por defecto
	
	public String value() default "28";
	
	//definir el mensaje de error
	
	public String message() default "El c postal debe comenzar con  el npumero 28";
	
	//definir los grupos
	
	Class<?>[]  groups() default {};//es apra validarlo por grupos, no se usara aqui
	
	//definir los payloads

	Class<? extends Payload>[]  payload() default {};//se usa mucho para metadatos
}
