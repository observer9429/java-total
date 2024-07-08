package pildoras_annotation;

import org.springframework.beans.factory.annotation.Value;

public class DirectorFinanciero implements Empleados {

	public DirectorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		super();
		this.informeFinanciero = informeFinanciero;
	}

	
	
	
	public String getEmail() {
		return email;
	}




	public String getNombreEmpresa() {
		return nombreEmpresa;
	}




	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y direccion  de las operaciones financieras de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

	
	private CreacionInformeFinanciero informeFinanciero;
	//ahora le indicamos el valor que debe de tener
	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
}
