/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mejorvendedor;

import javax.swing.JOptionPane;

/**
 *
 * @author warez9429
 */

public class posibleexamen {
    public static void main(String[]args){
        
   String digitado =JOptionPane.showInputDialog("hola, digite el número de la opción que desea ejecutar: \n1: Suma sucesiva de N a M \n2: Potencia de un número \n3: Factorial de un número");
    int opcion=Integer.parseInt(digitado);
    
    switch(opcion){
        
        case 1:
            String N =JOptionPane.showInputDialog("Ingrese el primer número");
            int N1=Integer.parseInt(N);
            String M =JOptionPane.showInputDialog("Ahora el segundo número");
            int M1=Integer.parseInt(M);
            int suma=0;
            for(int i=N1;i<=M1;i++){
              
                 suma=suma+i;
            }
            
            System.out.println("La suma de la sucesión es "+suma);
         break;   
        case 2:
            String B =JOptionPane.showInputDialog("Ingrese el número base");
            int x=Integer.parseInt(B);
            String E =JOptionPane.showInputDialog("Ahora ingrese el exponente");
            int y=Integer.parseInt(E);
            int prod=1;
            for(int z=1;z<=y;z++){
                prod=prod*x;
                
            }
            System.out.println("La potencia del número da "+prod);
            
            break;   
        case 3:
            
            String w =JOptionPane.showInputDialog("Ingrese el número factorial");
            int w1=Integer.parseInt(w);
            Long facto=1L;
            for(int i=w1;i>0;i--){
              facto=facto*i;  
                
            }
            
            System.out.println("El factorial del número es "+facto);
        
          break; 
        
        default:
            System.out.println("Digite un número correcto");
        
        
    }
    //System.out.print((opcion+1));
    
    }
    
    
}
