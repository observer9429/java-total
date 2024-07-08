/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenbanco;

/**
 *
 * @author warez9429
 */
import javax.swing.*;
public class recur {

    
    public static void main(String[] args) {
      
      /* int pes=Integer.parseInt(JOptionPane.showInputDialog("Digite el número a hacer sumas sucesivas"));
       int sumatotal= sumarecursiva(pes);
       System.out.println(sumatotal);
       */
       
       int pes=Integer.parseInt(JOptionPane.showInputDialog("Digite el número a hacer factorial"));
       int sumatotal= factorialrecursivo(pes);
       System.out.println(sumatotal);
       
      
     
     
     
     
    }
    
    
    public static int sumarecursiva(int numero){
        int res;
        if(numero==1){
            return 1;
        }
        else{
          res=  numero+sumarecursiva(numero-1);
          return res;
        }
        //return res; funciona igual aca o arriba
    }
    
    public static int factorialrecursivo(int numero){
        int res;
        if(numero==1){
          return 1;  
        }
        else{
            res=numero* factorialrecursivo(numero-1);
        }
        return res;// al parecer debe ir aca abajo, pero arriba tambien funciona
    }
    
    
    
    
}
