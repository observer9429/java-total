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
public class zz {
    
    
    static int alumnos[]=new int[2];
    static int suma=0;
    
    public static void main (String[]args){
    
        
        for(int i=0;i<alumnos.length;i++){

        String nota=JOptionPane.showInputDialog("digite la nota del alumno");
        int notaps=Integer.parseInt(nota);
        
        
        
        alumnos[i]=notaps;
        suma=suma+alumnos[i];
        
        
        //System.out.println("la nota es "+alumnos[i]);
        }
        for(int j=0;j<alumnos.length;j++){
            
            System.out.println("la nota del alumnos "+(j+1)+" es "+ alumnos[j] );
            
        }
        System.out.println("el promedio de notas es "+(suma/alumnos.length));
    }
}