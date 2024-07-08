package pildoras.conexion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ActualizaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//le indicamos la ruta cml, la clase con la que creara los objetos--que constry¿uya un sesionFactory
		SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		Session miSession=miFactory.openSession();

		try {
			
			int ClienteId=3;
			
			//comenzamos la transaccion
			
			miSession.beginTransaction();
			
			Clientes miCliente=miSession.get(Clientes.class, ClienteId);
			
			miCliente.setNombres("Calamardo");
			
			miSession.getTransaction().commit();
			
			System.out.println("registro actualizado correctamente en DDBB");
			
			
			
			
			
			miSession.close();
			
		}finally {
			
			miFactory.close();
			
		}
	}

}
