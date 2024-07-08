package programacion_generica;

public class Empleado2 {

	public Empleado2(String nombre, int edad, double salario) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
		
	}
	
	private String nombre;
	private int edad;
	private double salario;
	
	
	public String dameDatos2() {
		
		return "el empleado se llama "+nombre+ " tiene "+edad+" años y un salario de "+salario+" euros";
		
	}
	
}
