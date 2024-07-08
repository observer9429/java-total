package colecciones;

public class NListaEnlazada {

	Nodo cabeza;
	int size;
	
	public NListaEnlazada() {
		
		cabeza=null;
		size=0;
		
				
	}
	
	public Object obtenerObjPos(int index) {
		
		int contador=0;
		Nodo temporal= cabeza;
		
		while(contador<index) {
			
			temporal=temporal.obtenerSiguiente();
			contador++;
		}
		
		return temporal.obtenerValor();
	}
	
	public void addPrimero(Object obj) {
		
		
		if(cabeza==null) {
			
			cabeza=new Nodo(obj);
		}else {
			
			
			Nodo temp=cabeza;
			Nodo nuevo=new Nodo(obj);
			nuevo.enlazarSiguiente(temp);
			cabeza=nuevo; 
		}
		
		size++;
	}
	
	
	public void eliminarPrimero() {
		
		cabeza=cabeza.obtenerSiguiente();
		size--;
	}
	
	public void eliminarObjPos(int index) {
		
		//1 ->2 ->3 ->4->5->6
		//1->2 ->4...
		//1->2->4->5->6
		
		if(index==0) {
			
			cabeza=cabeza.obtenerSiguiente();
		}else {
		
		int contador=0;
		
		Nodo temporal= cabeza;
		
		while(contador<index-1) {
			
			temporal=temporal.obtenerSiguiente();
			contador++;
		}
		
		temporal.enlazarSiguiente(temporal.obtenerSiguiente().obtenerSiguiente());
		}
		
		size--;
	}
	
	
	public void cortar(int index) {
		
		//1 ->2 ->3 ->4->5->6
				//cortar desde el indice 3
				//1->2->3
		int contador=0;
		Nodo temporal=cabeza;
		
		while(contador<index-1) {
			
			temporal=temporal.obtenerSiguiente();
			contador++;
			
		}
		
		temporal.enlazarSiguiente(null);
		
		size=index;
	}
	
	public int size() {
		
		return size;
	}
	
	
	public boolean estaVacia() {
		
		return (cabeza==null)?true:false;
	}
	
}
