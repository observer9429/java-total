package pildorasIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoSingletonPrototype {

	public static void main(String[] args) {
		
		
		// carga de xml manual
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext2.xml");
		//peticion del bean al contenedor spring
		SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado Pedro=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Maria);
		System.out.println(Pedro);
		
		
		if(Maria==Pedro) System.out.println("puntan al mismo objeto");
		else System.out.println("no se trata del mismo objeto");
		
		
	}

}
