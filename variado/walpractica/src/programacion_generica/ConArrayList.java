package programacion_generica;

import java.util.*;
public class ConArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		Empleado listaEmpleados[]=new Empleado[3];
		
		
		
		listaEmpleados[0]=new Empleado("Ana",45,2500);
		listaEmpleados[1]=new Empleado("Antonio",55,2000);
		listaEmpleados[2]=new Empleado("María",25,2500);
		
		*/
		
		ArrayList<Empleado> listaEmpleados=new ArrayList <Empleado>();//sin parametros, te crea un array 
																		//inicial de 10 espacios
		//listaEmpleados.ensureCapacity(11);
		
		listaEmpleados.add(new Empleado("Ana",45,2500));
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		listaEmpleados.add(new Empleado("María",25,2500));
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		listaEmpleados.add(new Empleado("María",25,2500));
		listaEmpleados.add(new Empleado("we",45,2500));
		listaEmpleados.add(new Empleado("we",55,2000));
		listaEmpleados.add(new Empleado("we",25,2500));
		listaEmpleados.add(new Empleado("we",55,2000));
		listaEmpleados.add(new Empleado("Mark",25,2500));
		
		listaEmpleados.add(new Empleado("Spiderman",25,2500));//al crear 1 mas en ese tipo de array
															//se esta consumiendo recursos demas
		
		//para agregar un objeto en la posicion que queremos se hcae con el siguiente metoido
		//listaEmpleados.add(new Empleado("Spiderman007",25,2500));
		listaEmpleados.set(6, new Empleado("Spiderman007",25,2500));
		
		
		//metodo get es para obtener informacion de un objeto del array
		//se imprime dentro de un syso
		System.out.println(listaEmpleados.get(6).dameDatos());;
		System.out.println();
		System.out.println();
		
		System.out.println(listaEmpleados.size());//metodo para saber cuantos elementos triene el arrayList
		
		
		
		
		listaEmpleados.trimToSize();//corta la memoria que no esta usando
		
		for(Empleado e:listaEmpleados) {
			
			System.out.println(e.dameDatos());
		}
		
		
		
		
		///otra MANERA DE LEER LOS DATOS DEL AARAYLIST ES CON ITERATOR
		
		
		
		Iterator <Empleado> mi_iterador=listaEmpleados.iterator();
		
		while(mi_iterador.hasNext()) {
			
			System.out.println(mi_iterador.next().dameDatos());// ponerlo siempre con el metodo creado de
																//dame datos, o el que se hya creado
		}
		
		
		
		 
		 /*
		//para imprimir con el for normal
		for(int i=0;i<listaEmpleados.size();i++) {
			Empleado e=listaEmpleados.get(i);
			System.out.println(e.dameDatos());
		}
		
		*/

	}

}


class Empleado{
	
	public Empleado(String nombre ,int edad,double salario) {
		
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	
	public String dameDatos() {
		
		return "El empleado se llama "+nombre+" tiene la edad de "+edad+" y su salario es "+salario;
	}
	
	private String nombre;
	private int edad;
	private double salario;
}