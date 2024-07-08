/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalbanco;

/**
 *
 * @author warez9429
 */
import javax.swing.*;


public class cbanco {
    
    
    private String namebank;
    private String ncuenta;
    private String  namet;
    private double deposito;
    private double retiro;
    private double saldo;
    
  
    
    public cbanco(){
        namebank="Corporation ZZ";
        ncuenta="1635339";
        namet="Walter";
        saldo=10000;
        
        
    }
    
    
    
    public void deposito(){
    
         deposito=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad a depositar"));
        if(deposito>0){
            
            saldo=saldo+deposito;
        }
        System.out.print("Su saldo actual en el banco "+ namebank+" es de " +saldo);    
        
    }
    
    public void retiro(){
       retiro=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad a retirar"));
       if (retiro>0 && retiro<saldo){
           saldo=saldo-retiro;
           
       }
       System.out.println("Su saldo actual en el banco "+ namebank+" es de " +saldo);
        
    }
    
    public void consulta(){
        System.out.println("Su saldo actual en el banco "+ namebank+" es de " +saldo);
        
    }
    
    public void salir(){
        
        System.out.println("Gracias por usar nuestro servicio");
    }
    
    
    
}
