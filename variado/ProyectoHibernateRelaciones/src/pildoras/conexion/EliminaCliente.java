package pildoras.conexion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EliminaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//le indicamos la ruta cml, la clase con la que creara los objetos--que constry¿uya un sesionFactory
				SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml").
						addAnnotatedClass(Cliente.class).addAnnotatedClass(DetallesCliente.class).buildSessionFactory();
				
				Session miSession=miFactory.openSession();
				
				try {
					
					
					
					miSession.beginTransaction();
					
					Cliente clienteEliminar=miSession.get(Cliente.class, 1);
					
					if(clienteEliminar!=null) {
						
						
						System.out.println("voy a eliminar el cliente " + clienteEliminar.getNombre());
						miSession.delete(clienteEliminar);
					}
					
					miSession.getTransaction().commit();
					
					if(clienteEliminar!=null) System.out.println("registro eliminado correctamente en DDBB");
					else System.out.println("nada que eliminar");
					
					
					
					miSession.close();
					
				}finally {
					
					miFactory.close();
					
				}

	}

}
