package serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;



public class ISerializable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		
		
		
		//misEmpleados[2].
		
		/*
		
		for(int i=0;i<misEmpleados.length;i++) {
			misEmpleados[i].subeSueldo(5);
			
		}
		
		Arrays.sort(misEmpleados);
		
		for(int i=0;i<misEmpleados.length;i++) {
			System.out.println("Nombre: "+misEmpleados[i].dameNombre()+"el id es "+ misEmpleados[i].dameIdActual()+ 
					" Sueldo: "+misEmpleados[i].dameSueldo()
		    +" Fecha de alta: "+misEmpleados[i].dameFechaContrato());
		}
	    
		*/
		
		//convertir un objeto a bytes, para poder difundirlo, o algo asi
		
		try {
			
			ObjectOutputStream escribiendo_fichero=new  ObjectOutputStream(new FileOutputStream("C:/Users/warez9429/Desktop/ejecutables/nuevoempleadope.txt"));
			
			escribiendo_fichero.writeObject(misEmpleados);
			
			escribiendo_fichero.close();
			
			//ahora toca rescatar ese objeto serializado
			
			ObjectInputStream recuperando_fichero=new ObjectInputStream(new FileInputStream("C:/Users/warez9429/Desktop/ejecutables/nuevoempleado.txt"));
			//almacenamos el array de tipo Empleado
			
			Empleado[ ] personal_recuperado=(Empleado[]) recuperando_fichero.readObject();
			
			for(Empleado e : personal_recuperado) {
				
				System.out.println(e);
			}
			
		}catch(Exception e) {
			
			
		}
		
		///////////////////DEBERÍA FUNCIONAR, PERO NO, CREO QUE ELIMINE ALGO QUE SI SERVÍA

		///////////ahora si funciono, pero con el metodo toString, aun falta mejorar
		
					// y el SHA es como el dni que sele da a un poyecto
	}

}



class  Empleado implements Comparable, Serializable{ 
	
	/**
	 * 
	 *//// la huella esta abajo, sirve para que ambos tengan una copia con el mismo serial, si no no abrira 
				//en otra pc
	private static final long serialVersionUID = 7288321878316200286L;
	
	
	
	public Empleado(String nom,double sue,int agno, int mes,int dia) {
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario=new GregorianCalendar(agno, mes-1,dia);
		// en el caso mes se resta uno porque empieza desde cero
		altaContrato=calendario.getTime();//metodo de gregorian para obtener la fecha
		
		Id=IdSiguiente;
		IdSiguiente++;
		
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
	
	public String toString() {
		return "el nombre es " + nombre+" y su sueldo es "+sueldo+" -fecha de contrato ";
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente=1;
	
}

class Jefatura extends Empleado {
	
	public Jefatura(String nom,double sue,int agno, int mes,int dia){
	
	super(nom,sue,agno,mes,dia);
	
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


