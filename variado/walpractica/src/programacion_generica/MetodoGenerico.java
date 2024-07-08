package programacion_generica;

public class MetodoGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String nombres [ ]= {"JOSE","SPIDER","FLASH"};
		
	//String elementos=MisMatrices.<String>getElementos(nombres);//algunos indican el argumento antes del metodo
		//aunque sin eso igual funciona
		String elementos=MisMatrices.getElementos(nombres);
		
		System.out.println(elementos);
		
		Empleado listaEmpleados[]= {new Empleado("Ana",45,2500),
				new Empleado("Ana",45,2500),
				new Empleado("Ana",45,2500),
				new Empleado("Ana",45,2500),
				new Empleado("Ana",45,2500)
				
		};
		
		System.out.println(MisMatrices.getElementos(listaEmpleados));
		
		System.out.println(MisMatrices.getMenor(nombres));//nos da el nombre por orden alfabetico menor o primero
	
	//creamos elemtnos de array que de clases que no implementan la interfaz Comparable
		Empleado paco=new Empleado("Paco",45,2500);
		Empleado ana=new Empleado("Ana",45,2500);
		Empleado maria=new Empleado("Maria",45,2500);
		
		Empleado losEmpleados[]= {paco,ana,maria};
		
		//System.out.println(MisMatrices.getMenor(losEmpleados));//sale error poeque la clase empleado no implementa
															//la interfaz Comparable
	}

}


class MisMatrices{
	// <z> argumento de tipo= generico, devolvera string y el tipo de array que recibira T
	public static <T> String getElementos(T[]a) {// se declara asi porque no se sabe que tipo de array recibira
		
		return "el array tiene "+a.length+ " elementos";//le pasaremos 2 tipos de arrays String y tipo Empleado
	}
	
	//creamos metodo generico para saber cual es el menor, letra nombre o fecha
	//con el segundo T le indicamos el metodo que va devolver
	public static <T extends Comparable> T getMenor(T[ ] a) {// para que implemente la interfaz Comparable ponemos
														//extends asi sea interface, se pone detras del tipo gener
													//	extends asi sea interface
		if(a==null || a.length==0) {
			return null;
		}
		//el metodo conpareTo es de la interface comparable, la cual algunas clases ya la tienen implementadas
		//como gragorian calendar
		//devuelve -1 si es menor; 0 si es igual y 1 si es mayor
		
		//alamacenamos en una variable para empezar a comparar
		T elementoMenor=a[0];
		
		for(int i=1;i<a.length;i++) {
			
			if(elementoMenor.compareTo(a[i])>0) {//compara el elemento 0 ya guardado, con el lemento 1
				
				elementoMenor=a[i];
			}
		}
		
		return elementoMenor;
	}
	
}