package programacion_generica;

public class Jefe extends Empleado2 {
	
	public Jefe(String nombre, int edad, double salario) {
		
		super(nombre,edad,salario);
				
	}

	double incentivo(double inc) {
		return inc;
	}
}
