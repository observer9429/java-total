package pildorasIOC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cargar el cml de configuracion 
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext3.xml");

		//obtencion del bean
		
		Empleado Juan=contexto.getBean("miEmpleado",Empleado.class);
		
		System.out.println(Juan.getInforme());
		
		//cerrar el contexto
		
		contexto.close();
		
	}

}
