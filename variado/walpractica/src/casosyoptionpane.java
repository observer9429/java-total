import javax.swing.*;
public class casosyoptionpane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("Digite el número de la acción "
				+ "que desee realizar: \n 1:área de un cuadrado \n2: área de un rectángulo \n3:área de un triangulo \n4:área de un circulo "));
		
       switch(opcion) {
       
       case 1: int lado1=Integer.parseInt(JOptionPane.showInputDialog("digite el  lado del cuadrado"));
              // int lado2=Integer.parseInt(JOptionPane.showInputDialog("ahora digite el otro lado del cuadrado"));
               System.out.println("el área del cuadrado es "+(Math.pow(lado1, 2)));
               
       break;
       
       case 2: int base=Integer.parseInt(JOptionPane.showInputDialog("digite la base del triangulo"));
               int altura=Integer.parseInt(JOptionPane.showInputDialog("ahora digite la altura del triangulo"));
               System.out.println("El área del triángulo es: "+(base*altura)/2);
       
       break;
       
       case 4: int radio=Integer.parseInt(JOptionPane.showInputDialog("Digite la medida del radio del cículo"));
               System.out.println("El área del círculo es ");
               System.out.printf("%1.2f",Math.PI*Math.pow(radio, 2));
       break;
       
       default:
    	   System.out.println("La opción ingresada no es correcta");
       
       }
       
	}

}
