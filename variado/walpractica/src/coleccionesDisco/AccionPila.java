package coleccionesDisco;

public class AccionPila {

	public static void main(String[] args) {
		
		PilaDinamica <Integer> pilaswe=new PilaDinamica<>();
		
		pilaswe.push(5);
		pilaswe.push(10);
		pilaswe.push(15);
		pilaswe.push(44);
		
		System.out.println("¿la pila esta vacia?" +pilaswe.isEmpty());
		
		System.out.println("el tamaño es "+pilaswe.size());
		
		System.out.println("el top es "+pilaswe.top());
		
		int elemento= pilaswe.pop();
		
		System.out.println("he sacado el número "+elemento );
		
		System.out.println("el tamaño es "+pilaswe.size());
		
		System.out.println(pilaswe);
		//con el metodo toString es igual para imprimir todos los datos
		//System.out.println(pilaswe.toString());
		
		
		
	}

}
