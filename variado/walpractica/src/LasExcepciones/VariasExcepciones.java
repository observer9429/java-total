package LasExcepciones;

import javax.swing.JOptionPane;

public class VariasExcepciones {

	//ejmeplo solo para ver el uso de excepciones, en este caso al no ser comprobaas no se recomienda el try catch
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			division();
		}catch(ArithmeticException e) {
			System.out.println("no se permite dividir entre 0");
		}catch(NumberFormatException e) {
			
			
			JOptionPane.showMessageDialog(null, "no se permite caracteres extraños");
			System.out.println("solo se permiten numeros enteros , no texto u otros caracteres extraños");
			
			System.out.println(e.getMessage());// da lo que origina la excepcion
			System.out.println(e.getClass().getName());// te da la clase quemanda la excepcion
														//tambien funciona sin el .getName
		}
		
	}

	
	static void division() {
		
		int num1=Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a dividir"));
		int num2=Integer.parseInt(JOptionPane.showInputDialog("Digite el dividendo"));
		
		System.out.println("el resultado es "+num1/num2);
		
		
	}
}


