/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizadorinterno;

/**
 *
 * @author warez9429
 */
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;


public class Temporizadorinterno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    reloj mireloj=new reloj(3000,true);
    mireloj.enmarcha();
    JOptionPane.showMessageDialog(null,"pulsa aceptar para terminar");
    System.exit(0);
    
    
    }
    
}



class reloj{
     public reloj(int intervalo, boolean sonido){
         
         this.intervalo=intervalo;
         this.sonido=sonido;
         
     }
     private int intervalo;
     private boolean sonido;
     
     
     public void enmarcha(){
         
         ActionListener oyente=new damelahora2();
         Timer mitemporizador=new Timer(intervalo, oyente);
         mitemporizador.start();
         
     }
     
      
     
     
    
     private class damelahora2 implements ActionListener{
         //implementar action performe obligatirio
            public void actionPerformed(ActionEvent evento){
             
             Date ahora=new Date();     
             System.out.println("te pongo la hora cada 3 segundos "+ahora);
             
             if(sonido){
                  Toolkit.getDefaultToolkit().beep();
             }
             
             }

        
         
         
     }
     
}


