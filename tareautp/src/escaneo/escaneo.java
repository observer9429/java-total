/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escaneo;

/**
 *
 * @author warez9429
 */
import javax.swing.*;
import java.util.Scanner;
public class escaneo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ahora con el metodo joption y show...
        
String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre porfavor");
String edad=JOptionPane.showInputDialog("Introduce tu edad porfavor");

int edad_usuario=Integer.parseInt(edad);

System.out.println("HOola "+nombre_usuario+"El año que viene tendrás "+(edad_usuario+1)+" años");














// TODO code application logic here
        final double metros=1000;
        final double segundos=3600;
        
        
        // sc, es el objeto creado para despues invocarlo pa q el usuario introduzca la informacion
        
        
        
        Scanner sc = new Scanner(System.in);  //crear un objeto Scanner
           String nombre;
           int km; 
           int horas;
           
           
           
           
           System.out.print("Introduzca su nombre: ");       
           nombre = sc.nextLine();  //leer un String
           System.out.println("Hola " + nombre + "!!!");
           System.out.print("Introduzca el nùmero de kilometros ");
          km = sc.nextInt(); //leer un double
          
          
          
           System.out.print("Introduzca el nùmero de horas: ");
           horas = sc.nextInt(); //leer un entero
           
           double kmfinal=km*1000, horasf=horas*3600;
           
           System.out.println("La velocidad final es: "+ kmfinal/horasf +"m/s");
     
           
           
    }
    
}
