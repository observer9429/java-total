package coleccionesDisco;
/*
 Lista Dinamica con nodos-como en clase

-isEMpty(): indica si la lista está vacia o no
-size(): indica el tamaño de la lista.
-//get(int index): devuelve el elemento que haya en esa posición, null si no se encuentra o el index es incorrecto
getNode(int index): devuelve el nodo que haya en esa posicion, null sino se encuentra o el index es incorrecto. será privado
-getFirst(T elemento): devuelve el elemento del primer nodo, null si esta vacia la lista.
-getLast(T elemento): devuelve el elemento del ultimo nodo, null si la lista está vacia
-//addFirst(T element): añade un elemento al principio, retorna el lemento añadido.
-add(T elemento, int index): añade un elemento en una posición concreta,devuelve el objeto si es correcto y null si el index no es correcto.
-toString(): muestra el contenido de la lista.

 */
public class ListaDinamica <T>{
	
	private Nodo <T> primero;
	private Nodo <T> ultimo;
	private int tamanio;
	
	public ListaDinamica() {
		
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
	
	
	private Nodo<T> getNode(int index){
		
		if(isEmpty() || (index<0 || index>=size())) {
			return null;
		}else if(index==0){
			return primero;
		}else if(index==size()-1) {
			return ultimo;
		}else {
			Nodo<T> buscado=primero;
			
			int contador=0;
			
			while(contador<index) {
				
				contador++;
				buscado=buscado.getSiguiente();
			}
			
			return buscado;
		}
	}
	
	public T get(int index) {
	//get(int index): devuelve el elemento que haya en esa posición, null si no se encuentra o el index es incorrecto
		
		if(isEmpty() || (index<0 || index>=size())) {
			return null;
		}else if(index==0){
			return getFirst();
		}else if(index==size()-1) {
			return getLast();
		}else {
			
			Nodo<T> buscado= getNode(index);
			
			return buscado.getElemento();
		}
		
	}
	
	
	
	public T getFirst() {
		if(isEmpty()) {
			return null;
		}else {
			return primero.getElemento();
		}
	}
	
	public T getLast() {
		
		if(isEmpty()) {
			return null;
		}else {
			return ultimo.getElemento();
		}
	}
	
	
	public T addFirst(T elemento) {//addFirst(T element): añade un elemento al principio, retorna el lemento añadido.
		
		/*
		if(primero==null) {
		
			Nodo <T>aux=new Nodo(elemento,null);
			
			primero=aux;
			ultimo=aux;
			
			return primero.getElemento();
			
		}else {
				
		
		Nodo <T>aux=new Nodo(elemento,primero);
		
		primero=aux;
		ultimo=aux.getSiguiente();
		
		return primero.getElemento();
		}
		*/
		
		Nodo<T> aux;
		
		if(isEmpty()) {
			aux=new Nodo<>(elemento, null);
			primero=aux;
			ultimo=aux;
		}else {
			
			aux= new Nodo<>(elemento, primero);
			primero=aux;
		}
		
		tamanio++;
		
		return aux.getElemento();
		
		
		
	}
	
	
	public T addLast(T elemento) {
		
		Nodo <T> aux;
		
		if(isEmpty()) {
			addFirst(elemento);
		}else {
			
			aux= new Nodo<>(elemento, null);
			ultimo.setSiguiente(aux);
			ultimo= aux;
		}
		
		tamanio++;
		
		return ultimo.getElemento();
	}
	
	
	public T add(T elemento, int index) {
		
		if(index==0) {
			
			return addFirst(elemento);
		}else if(index==size()) {
			return addLast(elemento);
		}else if(index<0 || index>= size()) {
			return null;
		}else {
			
			Nodo<T > anterior= getNode(index-1);
			Nodo<T> actual= getNode(index);
			Nodo<T> aux = new Nodo<>(elemento, actual);
			
			anterior.setSiguiente(aux);
			
			tamanio++;
			
			return getNode(index).getElemento();
			
		}
		
	}
	
	
	public String toString() {
		
		
		String cadena="";
		
		if(isEmpty()) {
			cadena="Lista vacia";
		}else {
			
			Nodo<T> aux=primero;
			
			while(aux!=null) {
				
				cadena+=aux.toString();
				aux=aux.getSiguiente();
			}
		}
		
		return cadena;
		
		
	}
	
	public void verDatos() {
		
		Nodo<T> aux=primero;
		
		String ve="";
		while(aux!=null) {
			System.out.println(aux.getElemento().toString());
			aux=aux.getSiguiente();
		}
	}
	
}
