/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author warez9429
 */

    

/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mejorvendedor;
import java.util.Scanner;
/**
*

*/
public class Banco {
            static double monto=0;
            static Scanner sc = new Scanner(System.in);
            static int opcion=0;
            static double saldo=1000; //saldo de la cuenta
public static void main(String[] args) {
        menuBanco();
        }
    static void menuBanco(){
    do
            {
            System.out.println("\n1.-Depositar");
            System.out.println("2.-Retirar");
            System.out.println("3.-Consultar Saldo");
            System.out.println("4.-Salir");
            System.out.print("\n\nElija una opción --> ");
            
            opcion=sc.nextInt();
            
            switch(opcion){
                    case 1:
                    Deposito();
                    break;
                    
                    case 2:
                    Retiro();
                    break;
                    
                    case 3:
                    MostrarSaldo();
                    break;
                    
                    case 4:
                    Salir();
                    break;
                    
                    default:
                    System.out.println("\nOpción Incorrecta");
            }
            }while(opcion!=4);
    }


            static void Deposito(){
                
            System.out.print("\nIngrese monto a depositar --> ");
            monto=sc.nextDouble();
            
            if (monto>0)
            saldo=saldo+monto;
            
            else
            System.out.println("\nMonto Incorrecto :");
            System.out.println("\nSu saldo actual es --> "+saldo);
            }
            
            
    static void Retiro(){
        
    System.out.print("\nIngrese monto a retirar --> ");
    monto=sc.nextDouble();
    
    if (monto<saldo){
            if(monto>0){
            saldo=saldo-monto;
            System.out.println("\nSu saldo actual es --> "+saldo);
            }
            else{
            System.out.println("No se permite monto negativo");
            }
    }
    else{
    System.out.println("Saldo Insuficiente");
    }
    }
    
    
    static void MostrarSaldo(){
    System.out.println("\nSu saldo es: "+saldo);
    }


        static void Salir(){
        System.out.println("\n\nGracias por usar el programa :D");
        }

}