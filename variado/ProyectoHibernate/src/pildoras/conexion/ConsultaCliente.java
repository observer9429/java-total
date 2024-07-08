package pildoras.conexion;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ConsultaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//le indicamos la ruta cml, la clase con la que creara los objetos--que constry¿uya un sesionFactory
		SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Clientes.class).buildSessionFactory();
		
		Session miSession=miFactory.openSession();
		
		try {
			
			//comenzar sesion
			miSession.beginTransaction();
			//consulta clientes
			
			List<Clientes> losClientes=miSession.createQuery("from Clientes").getResultList();
			
			metodoDeConsulta(losClientes);
			
			System.out.println("otro FOOOOOOOOOOOOOOR");
			//dame los Parker
			//se crea un alias que utilize la clausula where,apellidos es referencia a la propiedad
			losClientes=miSession.createQuery("from Clientes vari where vari.apellidos='Parker'").getResultList();
			
			metodoDeConsulta(losClientes);
			
			//con un or
			losClientes=miSession.createQuery("from Clientes vari where vari.apellidos='Parker' or vari.direccion='mar'").getResultList();
			
			System.out.println("CON UN ORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
			metodoDeConsulta(losClientes);
			
			//commit
			miSession.getTransaction().commit();
			
			System.out.println("terminado hql");
			
			miSession.close();
			
		}finally {
			
			miFactory.close();
		}
		
	}

	private static void metodoDeConsulta(List<Clientes> losClientes) {
		for(Clientes e:losClientes) {
			
			System.out.println(e);
		}
	}

}
