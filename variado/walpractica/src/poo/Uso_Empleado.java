package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		
		Empleado empleado1=new Empleado("Paco Gómez",85000,1990,12,17);
	    Empleado empleado2=new Empleado("Ana López",95000,1995,06,02);
	    Empleado empleado3=new Empleado("Maria Martín",105000,2002,03,15);
	    
	    empleado1.subeSueldo(5);
	    empleado2.subeSueldo(5);
	    empleado3.subeSueldo(5);
	    
	    System.out.println("Nombre: "+empleado1.dameNombre()+" Sueldo: "+empleado1.dameSueldo()
	    +" Fecha de alta: "+empleado1.dameFechaContrato());
		
	    System.out.println("Nombre: "+empleado2.dameNombre()+" Sueldo: "+empleado2.dameSueldo()
	    +" Fecha de alta: "+empleado2.dameFechaContrato());
	    
	    System.out.println("Nombre: "+empleado3.dameNombre()+" Sueldo: "+empleado3.dameSueldo()
	    +" Fecha de alta: "+empleado3.dameFechaContrato());
	    */
		
		Jefatura jefe_RRHH=new Jefatura("Juan",55000,2006,9,25);
		jefe_RRHH.estableceIncentivo(2570);
		
		
		Empleado[] misEmpleados=new Empleado[6];
		
		misEmpleados[0]=new Empleado("Paco Gómez",85000,1990,12,17);
		
		misEmpleados[1]=new Empleado("Ana López",95000,1995,06,02);
		
		misEmpleados[2]=new Empleado("Maria Martín",105000,2002,03,15);
		
		misEmpleados[3]=new Empleado("Antonio Fernández");
		
		misEmpleados[4]=jefe_RRHH;// polimorfismo en accion
		// es casi igual ponerlo aqui o al principio ----->jefe_RRHH.estableceIncentivo(2570);
				
		misEmpleados[5]=new Jefatura("María",95000,1999,5,26); // se parece al empleado[4], pero sin poder darle el incentivo sueldo
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];// casting de objetos, darle poder de jefe total
		jefa_Finanzas.estableceIncentivo(55000);
		
		
		System.out.println("el jefe "+jefa_Finanzas.dameNombre()+" tiene un bonus de "+ 
		jefa_Finanzas.establece_bonus(500));
		//misEmpleados[2].
		
		System.out.println(misEmpleados[3].dameNombre()+" tiene un bonus de "+misEmpleados[3].establece_bonus(200));
		
		for(int i=0;i<misEmpleados.length;i++) {
			misEmpleados[i].subeSueldo(5);
			
		}
		
		Arrays.sort(misEmpleados);
		
		for(int i=0;i<misEmpleados.length;i++) {
			System.out.println("Nombre: "+misEmpleados[i].dameNombre()+"el id es "+ misEmpleados[i].dameIdActual()+ 
					" Sueldo: "+misEmpleados[i].dameSueldo()
		    +" Fecha de alta: "+misEmpleados[i].dameFechaContrato());
		}
	    
	    
		//Empleado elwe=new Empleado("Paco Gelee",85000,1990,12,17);
		//Comparable elwe2=new Empleado("john Lenon",85000,1990,12,17);
		
		
		
	}
}
	class  Empleado implements Comparable, Trabajadores{ 
	
		public Empleado(String nom,double sue,int agno, int mes,int dia) {
			
			nombre=nom;
			sueldo=sue;
			GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
			// en el caso mes se resta uno porque empieza desde cero
			altaContrato=calendario.getTime();//metodo de gregorian para obtener la fecha
			
			Id=IdSiguiente;
			IdSiguiente++;
			
		}
		
		public double establece_bonus(double gratificacion) {
			
			return Trabajadores.bonus_base+gratificacion;
		}
		
		public Empleado(String nom) {//solo conocemos el nombre, y le asignamos estos datos por defecto
			
			this(nom,30000,2000,01,01);//el this llama al otro constructor de la clase
			}                          //, al cual lo ubica por el numero de parametros

		
		public  String dameNombre() {//getter
			return nombre;
		}
		
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
		public int compareTo(Object miObjeto) {
			
			Empleado otroEmpleado=(Empleado) miObjeto;
			if(this.sueldo<otroEmpleado.sueldo) {
				return -1;
			}
			if(this.sueldo>otroEmpleado.sueldo) {
				return 1;
			}
			return 0;
			
		}
		
		private String nombre;
		private double sueldo;
		private Date altaContrato;
		private int Id;
		private static int IdSiguiente=1;
		
	}
	
	//***************************************************
	class Jefatura extends Empleado implements Jefes{
		
		public Jefatura(String nom,double sue,int agno, int mes,int dia){
		
		super(nom,sue,agno,mes,dia);
		
		}
		
		public double establece_bonus(double gratificacion) {
			
			double prima=2000;
			return Trabajadores.bonus_base+ gratificacion+prima;
			
		}
		
		public String tomar_decisiones(String decision) {
			
			return "un miembro de la dirección ha tomado la decisión de: "+decision;
		}
		
		public void estableceIncentivo(double b) {
			incentivo=b;
			
		}
		
		public double dameSueldo() {
			double sueldoJefe=super.dameSueldo();
			return sueldoJefe+incentivo;
			
			
		}
		
		private double incentivo;
		
	}
	
	class  Director extends Jefatura{
		public Director(String nom,double sue,int agno, int mes,int dia){
			
			super(nom,sue,agno,mes,dia);
		}
		
	}


