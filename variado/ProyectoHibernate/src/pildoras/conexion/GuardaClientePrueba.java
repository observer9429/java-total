package pildoras.conexion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GuardaClientePrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//le indicamos la ruta cml, la clase con la que creara los objetos--que constry¿uya un sesionFactory
		SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		Session miSession=miFactory.openSession();

		try {
			
			Clientes cliente1=new Clientes("batman","nnn","mar");
			
			//comenzamos la transaccion
			
			miSession.beginTransaction();
			
			miSession.save(cliente1);
			
			miSession.getTransaction().commit();
			
			System.out.println("registro insertado correctamente en DDBB");
			
			//lectura de registro
			miSession.beginTransaction();
			
			System.out.println("lectura de registro con Id "+cliente1.getId());
			
			Clientes clienteInsertado=miSession.get(Clientes.class, cliente1.getId());
			
			System.out.println("Registro: "+clienteInsertado);
			
			miSession.getTransaction().commit();
			
			System.out.println("terminado");
			
			miSession.close();
			
		}finally {
			
			miFactory.close();
			
		}
	}

}
