package programacion_generica;

public class UsoPareja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pareja<String> una=new Pareja<String>();
		
		una.setPrimero("walpro");
		System.out.println(una.getPrimero());
		
		Persona pers1=new Persona("Ana");
		Pareja<Persona> otra=new Pareja<Persona>();
		
		otra.setPrimero(pers1);
		System.out.println(otra.getPrimero());//le agregamos el metodo string para que se entienda mejor, sino
		//devolvera la impresion en tipo objeto

	}

}


class Persona{
	
	
	public Persona(String nombre) {
		
		this.nombre=nombre;
		
	}
	
public String toString() {
		
		return nombre;
	}
	
	private String nombre;
}