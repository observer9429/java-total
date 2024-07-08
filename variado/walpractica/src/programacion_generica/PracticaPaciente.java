package programacion_generica;

import javax.swing.JOptionPane;



public class PracticaPaciente {

	
	
	
	
	public PracticaPaciente(String nom, String ape, int edad, double salario) {
		super();
		this.nom = nom;
		this.ape = ape;
		this.edad = edad;
		this.salario = salario;
		
		
	}
	//*********************


	public String getNom() {
		return nom;
	}
	public String getApe() {
		return ape;
	}
	public int getEdad() {
		return edad;
	}
	public double getSalario() {
		return salario;
	}



//************************

	
	@Override
	public String toString() {
		return "Paciente nombre: " + nom +
				", apellido: " + ape + ", edad=" + edad + ", salario=" + salario ;
	
	}

	
	
	
	
	public void calculoTotal(double salario ,String esp) {
		
		 
		
		if(salario>=2000) {
			
			
			switch(esp) {
			  
			case "cardiologia" :
				
				total=1000;
				
			break;
				
			case "traumatologia":
				
				total=900;
				
				break;
			
			case "dermatologia":
				
				total=600;
				
				break;
				
			default:
				
				JOptionPane.showMessageDialog(null, "dato ingresado no válido");
			
			}
			
			
		}else if(salario<2000 && salario>1500) {
			
			switch(esp) {
			  
			case "cardiologia" :
				
				total=900;
				
				break;
				
			case "traumatologia":
				
				total=800;
				
				break;
			
			case "dermatologia":
				
				total=500;
				
				break;
				
			default:
				
				JOptionPane.showMessageDialog(null, "dato ingresado no válido");
			
			}
		}else {
			
			switch(esp) {
			  
			case "cardiologia" :
				
				total=400;
				
				break;
				
			case "traumatologia":
				
				total=400;
				break;
			
			case "dermatologia":
				
				total=400;
				break;
				
			default:
				
				JOptionPane.showMessageDialog(null, "dato ingresado no válido");
			
			}
			
			
		}
		
			
		
	}
	
	
	
	public double devTotal() {
		
		return total;
	}
	
	
	
	
	//**************************

	private String nom, ape;
	
	private int edad;
	private double salario;
	
	private double total;
}



class PTraumatologia extends PracticaPaciente{
	
	
	public PTraumatologia(String nom, String ape, int edad,String aatendida, double salario ) {
		super(nom, ape, edad, salario);
		this.aatendida = aatendida;
		
		
		
		
		calculoTotal(salario,aatendida);
	}
	
	
	
	
	
	

	public String getAatendida() {
		return aatendida;
	}







	@Override
	public String toString() {
		return super.toString()+" área atendida: " + aatendida ;
	}







	private String aatendida;
	
}
