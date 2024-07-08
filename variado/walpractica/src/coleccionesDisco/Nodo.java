package coleccionesDisco;
/*
isEmpty(): indica si la pila esta vacia o no
size(): indica el tamaño de la pila
pop(): devuelve el contenido del primer elemento y lo elimina
push( T elemento): introduce un elemento en la pila
top(): devuelve el contenido del primer elemento(no elimina nada)
toString(): muestra el estado de la pila

*/
public class Nodo <T> {
	
	private T elemento;
	private Nodo<T> siguiente;
	
	
	public Nodo(T elemento, Nodo<T> siguiente) {
		
		this.elemento = elemento;
		this.siguiente = siguiente;
	}


	public T getElemento() {
		return elemento;
	}


	public void setElemento(T elemento) {
		this.elemento = elemento;
	}


	public Nodo<T> getSiguiente() {
		return siguiente;
	}


	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}


	@Override
	public String toString() {
		return elemento + " \n";
	}
	
	
}
