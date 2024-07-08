package pildorasIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleado {

	public static void main(String[] args) {
		
		
		

		/*
		//creacion de objetos tipo empleado
		
		// eplo simple --> JefeEmpleado empleado1=new JefeEmpleado();
		Empleado empleado1=new JefeEmpleado();
		
		Empleado empleado2=new SecretarioEmpleado();
		
		//uso de los objeos creados
		System.out.println(empleado1.getTareas());
		
		*/
		//001:-crear un contexto de la clase path...
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		//002._pedir el bin
		//primer parametro es el id que se le ha puesto al bean en el file xml
		
		
		//lo de abajo si sirve se hizo con inyeccion al constructor
		
		//primer parametro nombre del bean, segundo es el nombre de la interfaz
		JefeEmpleado Juan=contexto.getBean("miEmpleado", JefeEmpleado.class);
		//utilizar el bean
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getClass());
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());
		
		
		
		//Empleado Maria=contexto.getBean("miSecretarioEmpleado", Empleado.class);
		
		/*
		SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		//se sustituyo la interfaz por la clase secreemepleado y la clase o interfaz que hereda, algo asi
		
		
		
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getClass());
		System.out.println(Maria.getInforme());
		
		System.out.println(Maria.getEmail());
		System.out.println(Maria.getNombreEmpresa());
		
		
		SecretarioEmpleado Pablo=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println("email Pablo: "+Pablo.getEmail());
		*/
		
		
		
		//004._cerrar el xml
		contexto.close();
		
		//si queremos objetos de otro tipo, modificamos la ruta de la clase en el archivo xml, el cual
		//esta conmfigurado para dar objetos de tipo SecretarioERmpleado
		
	}

	//PAOSOSA SEGUIR UTILIZANDO UN CONSTRUCTOR CON SPRING BOOT
	//001._CREAR LA CLASE E INTERFAZ DE LA DEPENDENCIA(INFORMES)
	//002._CREACION DE CONSTRUCTOR EN LA CLASE PARA LA INYECCION DE LA DEPENDENCIA
	//003._CONFIGURAR LA INYECCION DE DEPENDENCIA EN ARCHIVO XML (ApplicationContext.xml)
	
	
}
