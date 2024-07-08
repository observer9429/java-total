package colecciones;

public class UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Libro libro1=new Libro("P en Java","Juan",25);//asi cambiemos de nombre a uno-seguira diciendoi iguales
													//ya que el metodo se fija por el ISBN
		Libro libro2=new Libro("P en Java","Juan",25);
		
		//libro1=libro2; //hacemos que la referencia de las dos instancias sea la misma
		
		if(libro1.equals(libro2)) {// solucion en la clase Libro , sobreescribir el metodo equals que
								//	ya viene heredada de OBJECT
			System.out.println("libros iguales");
			
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}else {
			System.out.println("libros diferentes");
			
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());//imprimimos us ubicacion en la memoria
		}
		//despues de sobreescribir en el metodo , si nos dice libros iguales
	}

}
