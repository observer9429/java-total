/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impares;

/**
 *
 * @author warez9429
 */

import java.util.Scanner;
public class Impares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;

        Scanner ingreso=new Scanner(System.in);
         System.out.println("Ingrese el número o los números");               
        numero=ingreso.nextInt();
        
        
        while (numero<1000 && numero>50 && numero%2==0){

              numero=ingreso.nextInt();
            }          
    System.out.print("El promedio de los numeros entre 50 y 1500 es"+ numero/numero);
}
}