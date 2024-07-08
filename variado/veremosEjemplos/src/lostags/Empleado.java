package lostags;

public class Empleado {

	
	
	
	
	public Empleado(String nom, String ape, String puesto, double salario) {
		super();
		this.nom = nom;
		this.ape = ape;
		this.puesto = puesto;
		this.salario = salario;
	}
	
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}




	private String nom, ape, puesto;
	
	private double salario;
}
