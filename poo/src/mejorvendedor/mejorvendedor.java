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
import java.util.Scanner;
public class mejorvendedor {
    
    static Scanner in=new Scanner(System.in);
    static float umbral;
    static float ventas[]=new float[4];

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ingresarventas(ventas);
        umbral=calcularumbral(ventas);
        System.out.println("El umbral es: " + umbral);
        System.out.println("Las ventas superiores al umbral son: ");
                imprimirmejoresventas(ventas);
        // TODO code application logic here
    }
    
    
     static void ingresarventas(float arreglo[])
     {
         for (int i=0; i<arreglo.length;i++)
         {System.out.print("Ingrese la venta n° " + (i+1)+ " :");
         arreglo[i]=in.nextInt();
             
         }
         
     }
     
     static float calcularumbral(float arreglo[])
     {float suma=0, promedio, u ;
     for (int i=0 ; i<arreglo.length;i++)
     {
         suma=suma+ventas[i];
         
         
     }
        promedio=suma/ventas.length; 
        u=(float)(0.60*promedio);
        return u;
     }
        
        
   static void imprimirmejoresventas(float arreglo[])
   {
       for(int i=0; i<arreglo.length;i++)
       
       {
           if (arreglo[i]>=umbral)
               System.out.println("ventas [ "+ i+"]-> "+ arreglo[i]);
       }
       
       
     
   }
    
}

