package pildoras.conexion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//le indicamos la ruta cml, la clase con la que creara los objetos--que constry¿uya un sesionFactory
				SessionFactory miFactory=new Configuration().configure("hibernate.cfg.xml").
						addAnnotatedClass(Cliente.class).addAnnotatedClass(DetallesCliente.class).buildSessionFactory();
				
				Session miSession=miFactory.openSession();
				
				try {
					
					Cliente cliente1=new Cliente("peter","parker","araña");
					
					DetallesCliente detallesCliente1=new DetallesCliente("www.spiderman.com","777","demente");
					
					//comenzamos la transaccion
					
					//asociar los objetos
					
					cliente1.setDetallesCliente(detallesCliente1);
					
					miSession.beginTransaction();
					
					//esto guarda la informacion  en las dos tablas relacionadas
					miSession.save(cliente1);
					
					miSession.getTransaction().commit();
					
					System.out.println("registro insertado correctamente en DDBB");
					
					
					
					miSession.close();
					
				}finally {
					
					miFactory.close();
					
				}

	}

}
