package colecciones;

import java.util.*;

public class PruebaListaEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> paises=new LinkedList<String>();
		
		paises.add("España");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Perú");
		
		LinkedList<String> capitales=new LinkedList<String>();
		
		capitales.add("Madrid");
		capitales.add("Bogota");
		capitales.add("DF");
		capitales.add("Lima");
		//ahora creamos un listIterator para poder agregar elementos o tambien eliminar
		
		ListIterator<String> iterA=paises.listIterator();
		ListIterator<String> iterB=capitales.listIterator();
		
		
		
		//con el while agregamos las capitales al linkedList de paises
		while(iterB.hasNext()) { //mientras halla un elemento en lista capitales
			
			if(iterA.hasNext()) {//ahora vemos si hay un siguiente elemento en paises
				
				iterA.next();
				
				iterA.add(iterB.next());//esta linea puiede ir adentro o afuera del if, en este caso es igual
			}
			
			
		}
		
		System.out.println("impresion con las capitales agregadas");
		System.out.println(paises);
		
		
		//AHORA PARA PODER ELIMINAR CAPITALES, VOLVEMOS A INICIAR EL iterB , ya que luego del while termina
		//en ultima posicion, y lo queremos al principio
		
		iterB=capitales.listIterator();
		
		while(iterB.hasNext()) {
			
			iterB.next();
			if(iterB.hasNext()) {
				
				iterB.next();
				
				iterB.remove();
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("impresion con las capitales de posicion par eliminadas");
		System.out.println(capitales);
		
		//ahora eliminamos las capitales- y como ya hemos eliminado elementos de capitales habria variacion
		paises.removeAll(capitales);
		//impresion con paises eliminados
		System.out.println();
		System.out.println();
		System.out.println("impresion con capitales eliminados");
		System.out.println(paises);
		
		
		//System.out.println(paises);
	//	System.out.println(capitales);//imprime todosl os elementos sin necesidad de for o foreach

	}

}
