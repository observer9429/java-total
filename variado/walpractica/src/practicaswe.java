

import java.util.Scanner;

import javax.swing.*;
public class practicaswe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		
		char letras;
		
		
		System.out.println("Introduzca una letra: ");
		letras = entrada.next().charAt(0);// el numero que aparece ahi es paradefinir que letra va validar
		
		
		String pe=Character.toString(letras);
		System.out.println("es este "+pe);
		
		
		if(Character.isUpperCase(letras)){   //este metodo es para comparar minusculas y mayusculas      
	          System.out.println("Mayuscula");             
		}else{                   
	          System.out.println("Minuscula");    
		}
		
		
	}

}
