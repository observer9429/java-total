package programacion_generica;

//podemos utilizar la letra matuscula que queramos
public class Pareja <T> {
	
	public Pareja() {
		
		
		primero=null;
		
	}
	
	public void setPrimero(T nuevoValor) {
		
		primero=nuevoValor;
	}
	
	public static void imprimirTrabajador(Pareja<? extends Empleado2> p) {
		
		Empleado2 primero=p.getPrimero();
		
		System.out.println(primero);
	}
	
	public  T getPrimero() {
		return primero;
	}
	
	
	
	private T primero;

}
