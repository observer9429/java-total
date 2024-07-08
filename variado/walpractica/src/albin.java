import javax.swing.JOptionPane;

import javax.swing.*;
import java.util.*;

public class albin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n_alumnos=Integer.parseInt(JOptionPane.showInputDialog("digiten el numero de alumnos"));
		int contador_general=0;
		
		String sec;
		int nota;
		
		
		int a_menor=21;
		int a_mayor=0;
		int a_contador=0;
		int a_promedio=0;
		int a_suma=0;
		int a_aprobados=0;
		int a_desaprobados=0;
		
		
		int b_menor=21;
		int b_mayor=0;
		int b_contador=0;
		int b_promedio=0;
		int b_suma=0;
		int b_aprobados=0;
		int b_desaprobados=0;
		
		
		int c_menor=21;
		int c_mayor=0;
		int c_contador=0;
		int c_promedio=0;
		int c_suma=0;
		int c_aprobados=0;
		int c_desaprobados=0;
		
		
		int d_menor=21;
		int d_mayor=0;
		int d_contador=0;
		int d_promedio=0;
		int d_suma=0;
		int d_aprobados=0;
		int d_desaprobados=0;
		
		
		int nota_mayor=0;
		
		
		
		
		
		
		while(contador_general<n_alumnos) {
			
			
			
			
			 sec=JOptionPane.showInputDialog("Digite la letra de la seccion del alumno:  \n -A \n -B \n -C  \n -D");
			
			 nota=Integer.parseInt(JOptionPane.showInputDialog("digite la nota del alumno"));
			 
			 
			if(nota>nota_mayor) {
				
				nota_mayor=nota;
			}
			
			
			switch(sec) {
			
			//************************************************************************************
			case "A":
				
				if(nota<12) {
					a_desaprobados++;
				}else {
					a_aprobados++;
				}
				
				
				
				//primero sacamos nora maxima
				if(nota>a_mayor) {
					
					a_mayor=nota;
				}
				
				if(nota<a_menor) {
					
					a_menor=nota;
				}
				
				a_contador++;
				//a_suma+=nota;
				a_suma=a_suma+nota;
				
				a_promedio=a_suma/a_contador;
				
				
				
				
				
			break;
			
			//************************************************************************************
			case "B":
				if(nota<12) {
					b_desaprobados++;
				}else {
					b_aprobados++;
				}
				
				
				
				//primero sacamos nora maxima
				if(nota>b_mayor) {
					
					b_mayor=nota;
				}
				
				if(nota<b_menor) {
					
					b_menor=nota;
				}
				
				b_contador++;
				//a_suma+=nota;
				b_suma=b_suma+nota;
				
				b_promedio=b_suma/b_contador;
				
			break;
			
			//************************************************************************************
			case "C":
				
				
				if(nota<12) {
					c_desaprobados++;
				}else {
					c_aprobados++;
				}
				
				
				
				//primero sacamos nora maxima
				if(nota>c_mayor) {
					
					c_mayor=nota;
				}
				
				if(nota<c_menor) {
					
					c_menor=nota;
				}
				
				c_contador++;
				//a_suma+=nota;
				c_suma=c_suma+nota;
				
				c_promedio=c_suma/c_contador;
			break;
			
			//************************************************************************************
			case "D":
				if(nota<12) {
					d_desaprobados++;
				}else {
					d_aprobados++;
				}
				
				
				
				//primero sacamos nora maxima
				if(nota>d_mayor) {
					
					d_mayor=nota;
				}
				
				if(nota<d_menor) {
					
					d_menor=nota;
				}
				
				d_contador++;
				//a_suma+=nota;
				d_suma=d_suma+nota;
				
				d_promedio=d_suma/d_contador;
			
			break;
			
			//************************************************************************************
			default:
				System.out.println("Te equivocaste we");
			
			}
			
						
			
			
			contador_general++;
		}
		
		
		//ESTA IMPRESION VA AL FINAL
		System.out.println("DATOS DE LA SECCIÓN A:");
		System.out.println("la menor nota es "+a_menor );
		System.out.println("la mayor nota es "+a_mayor);
		System.out.println("el promedio de notas es "+a_promedio);
		System.out.println("el numero de alumnos aprobados es "+a_aprobados);
		System.out.println("el numero de alumnos desaprobados es "+a_desaprobados);
		//*************************************
		System.out.println();
		System.out.println();
		
		
		System.out.println("DATOS DE LA SECCIÓN B:");
		System.out.println("la menor nota es "+b_menor );
		System.out.println("la mayor nota es "+b_mayor);
		System.out.println("el promedio de notas es "+b_promedio);
		System.out.println("el numero de alumnos aprobados es "+b_aprobados);
		System.out.println("el numero de alumnos desaprobados es "+b_desaprobados);
		//*************************************
				System.out.println();
				System.out.println();
		
		System.out.println("DATOS DE LA SECCIÓN C:");
		System.out.println("la menor nota es "+c_menor );
		System.out.println("la mayor nota es "+c_mayor);
		System.out.println("el promedio de notas es "+c_promedio);
		System.out.println("el numero de alumnos aprobados es "+c_aprobados);
		System.out.println("el numero de alumnos desaprobados es "+c_desaprobados);
		//*************************************
				System.out.println();
				System.out.println();
		
		System.out.println("DATOS DE LA SECCIÓN D:");
		System.out.println("la menor nota es "+d_menor );
		System.out.println("la mayor nota es "+d_mayor);
		System.out.println("el promedio de notas es "+d_promedio);
		System.out.println("el numero de alumnos aprobados es "+d_aprobados);
		System.out.println("el numero de alumnos desaprobados es "+d_desaprobados);
		
		//*************************************
				System.out.println();
				System.out.println();
		System.out.println("la nota mas alta en general es "+nota_mayor);
		
		
		
	}

}
