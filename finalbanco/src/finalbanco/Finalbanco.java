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
import javax.swing.JOptionPane;

public class Finalbanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {
        // TODO code application logic here
        cbanco ZZ=new cbanco();
       
    /*   ZZ.elegir_opcion(Integer.parseInt(JOptionPane.showInputDialog(("Digite la opción que desea realizar"))));
       ZZ.devopcion();
    */
    
    
       /*String escoge=JOptionPane.showInputDialog("digita tu opción que deseas realizar:"
               + " \n1: depositar \n2: retirar \n3: consultar saldo \n4: salir");
       
      int este=Integer.parseInt(escoge);   */
       String pes=JOptionPane.showInputDialog("digite la opcion que desea realizar"
               + " \n1: depositar \n2: retirar \n3: consultar saldo \n4: salir");
       int pespe=Integer.parseInt(pes);
       
       
        
       switch(pespe){
           case 1:
           ZZ.deposito();
                   
               break;
               
               
           case 2:
              ZZ.retiro();
               
               break;
               
               
           case 3:
               ZZ.consulta();
               
               break;
               
               
           case 4:
               ZZ.salir();
               
               break;
               
           default:
             System.out.println("digite una opcion válida");
      
        
    }
       
        
    }
    
}
