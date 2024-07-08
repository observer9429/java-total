package coleccionesDisco;
/*
 COLA DINÁMICA

-isEmpty(): indica si la lista esta vacia
-size(): devuelve el tamaño de la lista
-primero(): devuelve el elemento que esta en primer lugar
-dequeue(): quita el primer elemento y lo devuelve
-enqueue(T elementp): inserta el lemento y devuelve este mismo
-toString(): 

 */
public class ColaDinamica <T>{
	
	private Nodo<T> primero;
	private Nodo<T> ultimo;
	private int tamanio;

	
	
	public ColaDinamica() {
		
		primero=null;
		ultimo=null;
		tamanio=0;
	}
	
	
	public boolean isEmpty() {
		
		return primero==null;
	}
	
	public int size() {
		
		return tamanio;
	}
	
	public T primero() {
		
		if(isEmpty()) {
			return null;
		}
		
		//si usas un metodo con un objeto nulo, el programa flipa
		return primero.getElemento();
	}
	
	public T dequeue() {
		
		if(isEmpty()) {
			return null;
		}
		
		T elemento= primero.getElemento() ;
		Nodo<T> aux= primero.getSiguiente();
		primero=null;
		
		primero= aux;
		tamanio--;
		
		if(isEmpty()) {
			
			ultimo=null;
		}
		
		return elemento;
		
	}
	
	public T enqueue(T elemento) {
		
		//ya que se agregara al final se le pasa un null como segundo parametro
		//ya q el ultimo siempre apunta a null
		
		Nodo<T> aux= new Nodo(elemento, null);
		
		if(isEmpty()) {
			
			primero=aux;
			ultimo=aux;
		}else {
			
			if(size()==1) {
				
				primero.setSiguiente(aux);
			}else {
				
				ultimo.setSiguiente(aux);
				
			}
			
			ultimo=aux;
		}
		
		tamanio++;
	
		return aux.getElemento();
	}
	
	
	public String toString() {
		
		if(isEmpty()) {
			return "la lista está vacia";
		}else {
			
			String cadena="";
			
			Nodo<T> aux= primero;
			
			while(aux!=null) {
				
				cadena+=aux;
				
				aux= aux.getSiguiente();
			}
			
			return cadena;
		}
	}
	
}
