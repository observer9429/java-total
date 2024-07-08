package coleccionPractica;

import javax.swing.JOptionPane;

public class Lista {
	
	private Nodo inicio;
	private Nodo fin;
	
	public Lista() {
		
		inicio=null;
		fin=null;
	}
	
	
	
	public boolean estaVacia() {
		
		if(inicio==null) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void insertar(Persona persona) {
		
		Nodo actual;
		
		if(estaVacia()) {
			
			actual =new Nodo(persona, null);
			inicio=actual;
			fin=actual;
			
		}else {
			//creamos un objeto
			actual =new Nodo(persona, null);
			//ahora movemos fin a la ultima posicion
			fin.setSiguiente(actual);
			fin=actual;
			
			
		}
	}
	
	
	public void mostrar() {
		
		if(estaVacia()) {
			return;
		}else {
			
			Nodo temporal;
			temporal=inicio;
			
			while(temporal!=null) {
				
				System.out.println(temporal.getDato().toString());
				
				temporal=temporal.getSiguiente();
			}
		}
	}
	

}
