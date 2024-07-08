package pildorasIOC;

public class SecretarioEmpleado implements Empleado {
	
	// creacion de campo  tipo CreacionInforme (interfaz)
	
	private CreacionInformes informeNuevo;
	
	
/*
	//creacion de constructor que inyecta la dependencia
	public SecretarioEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo=informeNuevo;
	}*/
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe creado por el secretarioEmpleado "+informeNuevo.getInforme();
	}



	
//esto es para crear una inyeccion medianmte un metodo setter y ya no por un constructor
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
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
	
	
	private String email;
	private String nombreEmpresa;
}
