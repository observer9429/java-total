package coleccionesDisco;
/*
 isEmpty(): indica si la pila esta vacia o no
size(): indica el tamaño de la pila
pop(): devuelve el contenido del primer elemento y lo elimina
push( T elemento): introduce un elemento en la pila
top(): devuelve el contenido del primer elemento(no elimina nada)
toString(): muestra el estado de la pila

 */
public class PilaDinamica <T>{

	
	private Nodo<T> top;
	
	private int tamanio;
	
	public PilaDinamica() {
		
		top=null;
		this.tamanio=0;
		}
	
	public boolean isEmpty() {
		
		return top==null;
	}
	
	
	public int size() {
		
		return this.tamanio;
	}
	
	public void push(T elemento) {
			//pasamos el nodo, que vale null, apuntara ahi creo
			Nodo<T> aux=new Nodo<>(elemento, top) ;
		    //despues le asignamos un nuevo valor al null, 
			//para asignarselo al otro elemento que se cree
				top=aux;
				this.tamanio++;
			
	}
	
	public T top() {
			
			if(isEmpty()) {
				return null;
			}else {
				return top.getElemento();
			}
			
	}
	
	public T pop() {
		
		if(isEmpty()) {
			return null;
		}else {
			//guardamos el primer elemento del nodo que es el superior porsiacaso
			T elemento = top.getElemento();
			//ahora un nodo auxiliar, nos posicionamos despues del nodo top,
			//obteniendolo para hacer oepraciones
			Nodo<T>  aux= top.getSiguiente();
			top=null;//para q se eleimine, ya q el garbadge lo elimina la ser null
			
			top=aux;
			
			this.tamanio--;
			/*
			 tambien se puede desrreferenciar asi:
			  
			  T elemento = top.getElemento();
			
			top= top.getSiguiente();
			 */
			return elemento;
		}
	}
	
	
	
	
	
	public String toString() {
		
		if(isEmpty()) {
			return "la pila esta vacia";
		}else {
			
			String resultado="";
			Nodo<T> aux= top;
			
			while(aux!= null) {
				 
				
				resultado +=aux.toString();
				aux= aux.getSiguiente();
			}
			
			return resultado;
		}
	}
	
}
