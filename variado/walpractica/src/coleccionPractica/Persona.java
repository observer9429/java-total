package coleccionPractica;

public class Persona {

	private String aNombre, aApellido;
	private int edad;
	
	
	
	public Persona(String aNombre, String aApellido, int edad) {
		super();
		this.aNombre = aNombre;
		this.aApellido = aApellido;
		this.edad = edad;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Nombre" + getaNombre() + ", Apellido " + getaApellido() + ", EDAD="
				+ getEdad() + "]";
	}





	public String getaNombre() {
		return aNombre;
	}
	public void setaNombre(String aNombre) {
		this.aNombre = aNombre;
	}
	public String getaApellido() {
		return aApellido;
	}
	public void setaApellido(String aApellido) {
		this.aApellido = aApellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
}
