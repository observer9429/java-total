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
public class notaalumno {
    
   
    static int opcion;
    
    static String nombres[]=new String[4];
    static int notas[]=new int[4];
   
    
    
    public static void main(String[]args){
        
     menu();   
        
    }
    
public static void menu(){
    String voz=JOptionPane.showInputDialog("Por favor digite la opcion que desea realizar");
    int opcion=Integer.parseInt(voz);
    
    switch(opcion){
        case 1:
            saludo();
            break;
         
        case 2:
            
            promedio();
            break;
        
    }
      
    
}
   private static void saludo(){
       System.out.print("hola p chalón"); 
       
        
    }
    
    private static void promedio(){
        
        String poker=JOptionPane.showInputDialog("Digite el numero de alumnos a los que pondra nota");
        int cantidad=Integer.parseInt(poker);
        
        
        for(int i=0;i<cantidad;i++){
            String nombrepri=JOptionPane.showInputDialog("digite el nombre del alumno");
            
            nombres[i]= nombrepri;
            
            for(int z=0;z<1;z++){
                
                String notasec=JOptionPane.showInputDialog("digite la nota del alumno");
                
                int notap=Integer.parseInt(notasec);
                
              notas[z]=notap;
              
              //System.out.println("la nota del alumno "+nombres[i]+" y su nota es "+notas[z]);
              if (notas[z]>11.5){
                  
                  System.out.println("el alumno "+nombres[i]+" su nota es "+notas[z]);
                  
                  
              }  
              
            }
            
     
               
           
            
            
            
            
        }
        {
            
            
            
        }
        
        
    } 
    
}
    
    