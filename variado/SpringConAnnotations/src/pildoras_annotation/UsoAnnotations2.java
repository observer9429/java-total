package pildoras_annotation;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//leer el xml de configuracion
		
		
				ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
				
		
				//pedir un bean al contenedor
				
				Empleados Antonio=contexto.getBean("comercialExperimentado",Empleados.class);
				Empleados Lucia=contexto.getBean("comercialExperimentado",Empleados.class);
				
				//apuntan al mismo objeto en memoria
				
				if(Antonio==Lucia) {
					System.out.println("apuntan al mismo lugar de memoria");
					System.out.println(Antonio +"\n"+Lucia);
				}else {
					System.out.println("no apuntan al mismo lugar en memoria");
					System.out.println(Antonio +"\n"+Lucia);
				}
				
				
				contexto.close();
				
	}

}
