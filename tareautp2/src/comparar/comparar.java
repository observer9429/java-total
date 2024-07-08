/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparar;

import javax.swing.JOptionPane;

/**
 *
 * @author warez9429
 */
public class comparar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //imprimir caracteres y parte de caracteres con la funcion string
       
       String frase="hoy es un estupendo dìa para programar";
        String frase_resumen=frase.substring(1,3);
        System.out.println(frase_resumen);
        
        //imprime oy, ya q imprimer el ultimo numero menos 1
        //---------------------
        //---------------------
        
        //para comparar 2 cadenas de caracteres , si son iguales dara true , y si no, sera false
        
        String alumno1,alumno2 ;
        
        alumno1="David";
        alumno2="David";
        System.out.println(alumno1.equals(alumno2));
        //y para ignorar las mayùsculas .equalsIgnoreCase
        //---------------------------------
        //--------------------------------------------------
        
        // para designar cuantos decimales queremos en un número
        
        double x=10000;
        
        System.out.printf("%1.2f",x/3);
        
        
        
        //para hacerlo con raiz y escoger los decimales del número
        
        String num10=JOptionPane.showInputDialog("Introduce un número");
        double num20=Double.parseDouble(num10);
        System.out.print("La raiz de "+num20+" es");
        System.out.printf("%1.4f",Math.sqrt(num20));
  
      
    }
    
}
