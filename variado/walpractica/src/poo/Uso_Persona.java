package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] migente=new Persona[2];
		
		migente[0] =new Empleado2("batistuta",50000,2001,5,25);
		migente[1]= new Alumno("walpro","química");
		
		for(int i=0;i<migente.length;i++) {
			System.out.println(migente[i].dameNombre());
			System.out.println(migente[i].dameDescripcion());
			
		}

	}

}



abstract class Persona{
	public Persona(String nom) {
		nombre=nom;
	}
	
	public String dameNombre(){
		return nombre;
	}
	
	public abstract String dameDescripcion() ;
		
		
		
	
	private String nombre;
	
}

class  Empleado2 extends Persona{ 
	
	public Empleado2(String nom,double sue,int agno, int mes,int dia) {
		
		super(nom);
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		// en el caso mes se resta uno porque empieza desde cero
		altaContrato=calendario.getTime();//metodo de gregorian para obtener la fecha
		
		Id=IdSiguiente;
		IdSiguiente++;
		
	}
	
	public Empleado2(String nom) {//solo conocemos el nombre, y le asignamos estos datos por defecto
		
		this(nom,30000,2000,01,01);//el this llama al otro constructor de la clase
		}                          //, al cual lo ubica por el numero de parametros

	
	
	
	public double dameSueldo() {//getter
		return sueldo;
	}
	
	public Date dameFechaContrato() {//getter
		
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {//setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
		
	}
	
	
	public int dameIdActual() {
		return Id;
		
	}
	
	public String dameDescripcion() {
		
		return " este empleado tiene un id= "+Id+ " con un sueldo de "+sueldo+" dólares.";
	}
	
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente=1;
	
}

class Alumno extends Persona{
	
	public Alumno(String nom,String car) {
		super(nom);
		carrera=car;
	}
	
	public String dameDescripcion() {
		
		return "Este alumno está estudiando la carrera de "+carrera;
	}
	
	
	
	private String carrera;
}

