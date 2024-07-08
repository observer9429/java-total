package colecciones;

import java.util.*;
public class PuebaMapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String, Empleado> personal=new HashMap<String, Empleado>();
		
		personal.put("145", new Empleado("Mark"));
		personal.put("146", new Empleado("Peter"));
		personal.put("147", new Empleado("Mónica"));//si se repite la llave, solo se sobreescribe
		
		System.out.println(personal);
		
		personal.remove("147");
		
		System.out.println(personal);
		
		//System.out.println(personal.entrySet());//es parecido al imprimir solamente la coleccion, pero
		//aparece en corchetes y  tal vez tendrá algo mas
		
		for(Map.Entry<String,Empleado> entrada: personal.entrySet()) {
			
			String clave=entrada.getKey();
			Empleado valor=entrada.getValue();
			
			System.out.println("Clave= "+clave+" valor= "+valor);
		}
	}

}


class Empleado{
	
	public Empleado(String n) {
		
		
		nombre=n;
		sueldo=2000;
		
	}
	
	
	public String toString() {
		
		return "[Nombre ="+nombre+" , sueldo= "+sueldo+" ]";
	}
	
	
	
	private String nombre;
	private double sueldo;
}