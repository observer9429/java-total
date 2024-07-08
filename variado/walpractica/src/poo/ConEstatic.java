package poo;

public class ConEstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleados trabajador1=new Empleados("Paco");
		Empleados trabajador2=new Empleados("Ana");
		Empleados trabajador3=new Empleados("Antonio");
		Empleados trabajador4=new Empleados("Napol");

		trabajador1.cambiaSeccion("RR.HH");
		
		System.out.println(trabajador1.devuelveDatos());// atribuye un id automatico con la variable estática
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		
		
		//System.out.println(Empleados.dameIdSiguiente());//forma de llaamr un metodo estatico
	//	System.out.println(Empleados.dapemen());
		
		//creamos un metodo estatico para que nos proporcione el idsiguiente

	}

}

class Empleados{
	
	public Empleados(String nom) {
		
		nombre=nom;
		seccion="Administración";
		Id=IdSiguiente;//se le asigna el valor de id siguiente cuando este vale 1, luego al idsiguiente
		IdSiguiente++;  // se le aumenta 1, llega a dos y ese se le asigna automaticamente a la variable Id
		
		
	}
	
	public static String dameIdSiguiente() {
		
		return " el id siguiente es: "+ IdSiguiente;
		
	}
	/*
public static String dapemen() {
		
		return " el id siguiente es: "+ IdSiguiente;
		
	} */
	
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
	}
	
	public String devuelveDatos () {
		
		return " el nombre es "+nombre+ " ,seccion es "+seccion+" y el id es "+Id;
	}
	
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;
	
}
