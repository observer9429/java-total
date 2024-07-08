package pildoras.conexion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ObtenerCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//le indicamos la ruta cml, la clase con la que creara los objetos--que constry¿uya un sesionFactory
		SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Cliente.class).addAnnotatedClass(DetallesCliente.class).buildSessionFactory();
		
		Session miSession=miFactory.openSession();
		
		try {
			
			
			
			miSession.beginTransaction();
			
			//obtener DetallesCliente
			
			DetallesCliente verCliente=miSession.get(DetallesCliente.class, 2);
			
			System.out.println(verCliente);
			
			System.out.println(verCliente.getElCliente());
			miSession.getTransaction().commit();
			
			
			
			
			
			miSession.close();
			
		}finally {
			
			miFactory.close();
			
		}

	}

}
