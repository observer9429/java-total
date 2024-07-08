package pildorasIOC;

public class JefeEmpleado implements Empleado{
	
	
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;
	
	
	public String getTareas(){
		
		return "gestiono las cuestiones relativas a mis empleados";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe presentado por le jefe con arreglos "+informeNuevo.getInforme();
	}

	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	//ciclo de vida de un bean
	//metodo init. ejecutar tareas antes  de que el bean este disponible
	
	public void metodoInicial() {
		
		System.out.println("dentro de lmetodo init , aqui irian  las tareas a ejecutar"
				+ " antes de q el bean este listo");
	}
	
	//metodo destroy. ejecutar tareas despues de q el bean haya sido utilizado
	public void metodoFinal() {
		
		System.out.println("dentro del metodo destroy , aqui irian  las tareas a ejecutar"
				+ " despues de utilizar el bean");
	}
	
	
	private String email;
	private String nombreEmpresa;
}
