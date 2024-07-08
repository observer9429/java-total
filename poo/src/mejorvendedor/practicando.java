/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mejorvendedor;

/**
 *
 * @author warez9429
 * 
 * im
 */
import javax.swing.*;
import java.util.*;
public class practicando {

    
    
    static int opcion;
    static int saldo=1000;
    static int monto=0;
    
    
   static int[] sumamatriz=new int[1];
   static  int[] menosmatriz=new int[1];
    
    public static void main(String[] args) {
       menubanco();   
        
    }
    public static void  menubanco(){
       do{
     String      opcions=JOptionPane.showInputDialog("Hola, por favor digite el nùmero de la opciòn que desea realizar: \n1: Depositar \n2:Retirar \n3: Ver saldo \n4: Salir");
        opcion=Integer.parseInt(opcions);
        
        switch(opcion){
            
            case 1:
                deposito( );
                break;
            case 2:
                retiro();
                break;
            case 3:
               versaldo();
                break;
                
            case 4:
                salir();
                break;
            default:
                System.out.println("opción incorrecta");
            
            
        }
             
          
       } while(opcion!=4);
        
        
    }

    private static void deposito() {
//System.out.println("eeeeeeeeeeee");        
String montos=JOptionPane.showInputDialog("Digite el monto a depositar");
monto=Integer.parseInt(montos);

 sumamatriz[0]=monto;
 
if(monto>0 ){
    System.out.println("Su saldo es "+(saldo+monto));
     opcion=4; 
    }
else{
    System.out.println("Digite solo números mayores a cero");
}




    }
    
    
    
   private static void retiro(){
       
   String montos=JOptionPane.showInputDialog("Digite el monto a depositar");    
    monto=Integer.parseInt(montos);
    
   System.out.println("el monto retirado es "+ (menosmatriz[0]=monto));
    if(monto>0 && monto<=saldo){
    System.out.println("Su saldo es "+(saldo-monto));
     opcion=4;  
    }
else{
    System.out.println("Digite un número valido");
}
       
   }
    
    
   private static void versaldo(){
    System.out.println("Su saldo actual es de "+ saldo);  
    opcion=4; 
       
   }
   
   private static void salir(){
       System.out.println("Hasta la próxima");
       
   }
}
