package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Cliente cl1=new Cliente("Antonio Banderas","00001",200000);
		Cliente cl2=new Cliente("Rafael Nadal","00002",250000);
		Cliente cl3=new Cliente("Penelope Cruz","00003",300000);
		Cliente cl4=new Cliente("Julio Iglesias","00004",500000);
		
		Cliente cl5=new Cliente("Antonio Banderas","00001",200000);
		
		//no debe haber clientes repetidos o duplicados, para ello es la INTERFACE SET<-------------
		
		
		//Set<Cliente> clientesBanco=new Set<Cliente>();//como una interfaz no se puiede instanciar, hay que elegir 
		//una clase que se adecue a las necesidades y que se adecue e implemente esa interfaz SET 
		
		Set<Cliente> clientesBanco=new HashSet<Cliente>();//se creo la coleccion semiinstancia de interfaz
															//o algo asi
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);
		clientesBanco.add(cl5);
		
		/*
		
		for (Cliente cliente : clientesBanco) {
			
		//	System.out.println(cliente.getNombre()+"  "+cliente.getN_cuenta()+" "+cliente.getSaldo());
		
		if(cliente.getNombre()=="Julio Iglesias") {
			
			clientesBanco.remove(cliente);
		}
		
		}
		//despues de editar el metodo equals ya no nos agrega el elemento con numero de cuenta repetida
		
		*/
		
		
		Iterator<Cliente> it=clientesBanco.iterator();
		
		while(it.hasNext()) {
			
			String nombre_cliente=it.next().getNombre();
			
			if(nombre_cliente.equals("Julio Iglesias")) {
				it.remove();//con ese metodo eliminamos el objeto
			}
		}
		
		
		
		
		
		//otro for para que recorra todos lso objetos
		  for (Cliente cliente : clientesBanco) {
			
				System.out.println(cliente.getNombre()+"  "+cliente.getN_cuenta()+" "+cliente.getSaldo());
						
			}
		
		
		
		
		
		
		
		
		
		/*
		
		Iterator<Cliente> it=clientesBanco.iterator();
		//creamos un objeto o variable CON Iterator<Cliente> it;
		//LUEGO LE ASIGNAMOS LO QUE DEVUELVA =clientesBanco.iterator();
		while(it.hasNext()){
			
			String nombre_cliente=it.next().getNombre();//con esto almacenamos en nombre el nombre del objeto con
												//el metodo getNombre
			
			//con el next estariamos saltando una posicion, que estaria bien si solo pidieramos 1 dato
			//pero si debemos pedir mas de 1 dato, surgen los problemas si usamos de nuevo el next, ya que
			//saltaria de nuevo de posicion
			System.out.println(nombre_cliente);
		}//tambien se puede hacer con for each, que en este caso seria mas sencillo
		
		*/
		
		
		
		
	}

}
