package colecciones;

import java.util.*;


public class PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//es mas eficiente que arraylist, por ejemplo al eliminar un objeto, solo se actualiza el hilo
		//mientras que en arraylist hay que asignar de nuevo las posiciones
		LinkedList<String > personas=new LinkedList<String>();
		
		personas.add("Pedro");
		personas.add("Mark");
		personas.add("Peter");
		personas.add("Mary");
		
		System.out.println(personas.size());//el metodo size es para saber cuantos elementos tiene
		
		/*
		int i=0;
		for(String es: personas) {
						
			System.out.println(personas.get(i));
			i++;  //pero mas simple es con la variable es
			
					}
		*/
		
		ListIterator <String > it=personas.listIterator();//creado esto, nos permite hacer todos los metodos
		//vistos en la API de ListIterator
		
		it.next();//con esto nos desplazamos una posicion, ya que por defecto empieza en la posicion 0
		it.add("Juan");//ahora agregamos un elemento en la posicion que dejo el next
			//con el emtodo ad y el listiterator creado
		//ahora se imprime JUAN en segundo lugar
		
		
		for(String epa: personas) {
			
			System.out.println(epa);// se imprimer en orden, se mantiene el orden creado al agregarlos
			// los elementos se agregan al final de la lista
			
		}

	}

}
