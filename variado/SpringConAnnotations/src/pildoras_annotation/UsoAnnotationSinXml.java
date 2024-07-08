package pildoras_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotationSinXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//ahora no usaremos el xml si no lo llamaremos desde una clase
		//leer de el classs de configutacion
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		/*
		//pedir un Bean al contenedor, primer parametro es el nombre del bean o nombre del metodo
		Empleados empleado=contexto.getBean("directorFinanciero",Empleados.class);
		System.out.println(empleado.getTareas());
		System.out.println(empleado.getInforme());
		*/
		
		DirectorFinanciero empleado=contexto.getBean("directorFinanciero",DirectorFinanciero.class);
		System.out.println("email del director: "+empleado.getEmail());
		System.out.println("nombre de la empresa: "+empleado.getNombreEmpresa());
		
		
		//cerrar el contexto
		contexto.close();
	}

}
