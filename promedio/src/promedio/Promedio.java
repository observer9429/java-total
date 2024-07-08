/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

/**
 *
 * @author warez9429
 */
import java.util.Scanner;
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner calcular=new Scanner(System.in);
        
        int a,b,c ;
        System.out.println("Digite las tres notas");
        
        a=calcular.nextInt();
        b=calcular.nextInt();
        c=calcular.nextInt();
        
        double promedio;
        if(a>=0 && a <=20 &&  b>=0 && b <=20  &&  c>=0 && c <=20 ){
            
           promedio=((a+b+c)/3) ;
            System.out.println("El promedio de las notas es "+ Math.round(promedio) );
        
       
        }
        else{ 
            
            System.out.println("NOTA ERRADA");
            
        
        
        
    }
    
}}
