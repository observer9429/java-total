import javax.swing.*;
public class casosyoptionpane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("Digite el n�mero de la acci�n "
				+ "que desee realizar: \n 1:�rea de un cuadrado \n2: �rea de un rect�ngulo \n3:�rea de un triangulo \n4:�rea de un circulo "));
		
       switch(opcion) {
       
       case 1: int lado1=Integer.parseInt(JOptionPane.showInputDialog("digite el  lado del cuadrado"));
              // int lado2=Integer.parseInt(JOptionPane.showInputDialog("ahora digite el otro lado del cuadrado"));
               System.out.println("el �rea del cuadrado es "+(Math.pow(lado1, 2)));
               
       break;
       
       case 2: int base=Integer.parseInt(JOptionPane.showInputDialog("digite la base del triangulo"));
               int altura=Integer.parseInt(JOptionPane.showInputDialog("ahora digite la altura del triangulo"));
               System.out.println("El �rea del tri�ngulo es: "+(base*altura)/2);
       
       break;
       
       case 4: int radio=Integer.parseInt(JOptionPane.showInputDialog("Digite la medida del radio del c�culo"));
               System.out.println("El �rea del c�rculo es ");
               System.out.printf("%1.2f",Math.PI*Math.pow(radio, 2));
       break;
       
       default:
    	   System.out.println("La opci�n ingresada no es correcta");
       
       }
       
	}

}
