package coleccionesDisco;

public class AccionListaDinamica {

	public static void main(String[] args) {
		
		ListaDinamica<Integer> listape=new ListaDinamica<>();
		
		listape.addFirst(5);
		listape.addFirst(25);
		listape.addFirst(125);
		listape.addFirst(625);
		
		System.out.println(listape.getLast());
		
		System.out.println(listape.getFirst());
		
		listape.verDatos();
		
		System.out.println("\n  \n \n");
		
		//*********************************************************
		ListaDinamica<Integer> we=new ListaDinamica<>();

		
		we.add(1, 0);
		we.add(2, 1);
		we.addLast(3);
		we.addFirst(4);
		we.addFirst(5);
		
		
		System.out.println(we.toString());
		
		System.out.println(we.get(0));
		
		System.out.println(we.get(3));
		
		System.out.println(we.get(10));
	}

}
