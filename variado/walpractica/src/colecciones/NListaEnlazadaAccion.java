package colecciones;

public class NListaEnlazadaAccion {

	public static void main(String[] args) {

		NListaEnlazada lista=new NListaEnlazada();
		
		
		lista.addPrimero("el we");
		lista.addPrimero(888);
		lista.addPrimero("el wexe");
		lista.addPrimero(777);
		
		
		System.out.println("Primer elemento "+ lista.obtenerObjPos(0));
		
		//e3stamos agregando los elementos nuevos como cabeza, por ello el we se imprimer al final
		System.out.println("ultimo elemento "+ lista.obtenerObjPos(lista.size()-1));
		System.out.println("index 2, es decir elemento 3 "+ lista.obtenerObjPos(2));
		
		System.out.println("Esta vacia "+lista.estaVacia());
		
		System.out.println("tamaño "+lista.size());
		
		System.out.println("\n");
		System.out.println("\n");
		System.out.println("***************************\n");
		System.out.println("\n");
		
		NListaEnlazada lista2=new NListaEnlazada();
		
		lista2.addPrimero(6);
		lista2.addPrimero(5);
		lista2.addPrimero(4);
		lista2.addPrimero(3);
		lista2.addPrimero(2);
		lista2.addPrimero(1);
		
		
System.out.println("Primer elemento "+ lista2.obtenerObjPos(0));
		
		
		System.out.println("ultimo elemento "+ lista2.obtenerObjPos(lista2.size()-1));
		System.out.println("index 2, es decir elemento 3 "+ lista2.obtenerObjPos(2));
		
		System.out.println("Esta vacia "+lista2.estaVacia());
		
		System.out.println("tamaño "+lista2.size());
		//eliminamos el primer elemento, el segundo ahora seria el primero
		lista2.eliminarPrimero();
		System.out.println("Primer elemento "+ lista2.obtenerObjPos(0));
		
		lista2.eliminarObjPos(2);
		
		System.out.println(lista2.obtenerObjPos(2));
		

		lista2.cortar(2);
		
		System.out.println(lista2.size());
	}

}
