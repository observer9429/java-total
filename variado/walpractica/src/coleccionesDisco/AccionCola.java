package coleccionesDisco;

public class AccionCola {

	public static void main(String[] args) {
		
		
		ColaDinamica <Integer> cola=new ColaDinamica<>();
		
		System.out.println(" el tamaño es: "+cola.size());
		System.out.println("¿esta vacia? Inicio "+cola.isEmpty());
		
		cola.enqueue(5);
		cola.enqueue(10);
		cola.enqueue(15);
		cola.enqueue(20);
		
		
		System.out.println("el tamaño de la cola es "+cola.size());
		System.out.println("despues de agregar esta vacia? "+cola.isEmpty());
		
		System.out.println(" el primero de la cola es "+cola.primero());
		
		System.out.println("quitamos el primero(5) "+cola.dequeue());
		System.out.println("quitamos el que sería el primero ahora(10) "+cola.dequeue());
		System.out.println("quitamos el que sería el primero ahora(15) "+cola.dequeue());
		System.out.println("quitamos el que sería el primero ahora(20) "+cola.dequeue());
		
		System.out.println("esto dará nulo ---quitamos el que sería el primero ahora(20) "+cola.dequeue());
		
		System.out.println(" el tamaño es: "+cola.size());
		System.out.println("¿esta vacia? "+cola.isEmpty());
	}

}
