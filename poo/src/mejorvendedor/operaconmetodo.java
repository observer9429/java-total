/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mejorvendedor;

/**
 *
 * @author warez9429
 */
import javax.swing.*;
public class operaconmetodo {
    
    int[] sumamatriz=new int[1];
     int[] menosmatriz=new int[1];
      
    public static void main(String[]args){
        
      menuope();  
        
    }
    public static void menuope(){
       String opcions=JOptionPane.showInputDialog("Digite la opción que desea realizar: \n1: suma sucesivas \n2:potencia de un número \n3: factorial de un número ");
       int opcion=Integer.parseInt(opcions);
       
       switch(opcion){
           
           case 1:
               sumasu();
               break;
               
           case 2:
               potencia();
               break;
               
           case 3:
               factorial();
               break;
               
           default:
               System.out.println("Digite un numero correcto");
           
           
       }
        
        
    }
    
    private static void sumasu(){//setter
       String N =JOptionPane.showInputDialog("Ingrese el primer número");
            int N1=Integer.parseInt(N);
            String M =JOptionPane.showInputDialog("Ahora el segundo número");
            int M1=Integer.parseInt(M);
            int suma=0;
            for(int i=N1;i<=M1;i++){
              
                 suma=suma+i;
            } 
        System.out.println("La suma de la sucesión es "+suma);
        
    }
    
    private static void potencia(){//setter
      String B =JOptionPane.showInputDialog("Ingrese el número base");
            int x=Integer.parseInt(B);
            String E =JOptionPane.showInputDialog("Ahora ingrese el exponente");
            int y=Integer.parseInt(E);
            int prod=1;
            for(int z=1;z<=y;z++){
                prod=prod*x;
                
            }
            System.out.println("La potencia del número da "+prod);  
        
    }
    
    private static void factorial(){//setter
       String w =JOptionPane.showInputDialog("Ingrese el número factorial");
            int w1=Integer.parseInt(w);
            Long facto=1L;
            for(int i=w1;i>0;i--){
              facto=facto*i;  
                
            }
            
            System.out.println("El factorial del número es "+facto); 
        
    }
    
    
    
}
