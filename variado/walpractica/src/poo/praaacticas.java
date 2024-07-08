package poo;

import javax.swing.*;
public class praaacticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor=Integer.parseInt(JOptionPane.showInputDialog("Digite el número divisor"));
		//int dividendo=Integer.parseInt(JOptionPane.showInputDialog("Digite el dividendo"));

		
		if(divisor%10 ==0) {
			
			System.out.println("el numero es multiplo de 10");
		}
		else {
			
			System.out.println("el numero no es multiplo de 10");
		}
		
		
	}

}
