/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizador;

/**
 *
 * @author warez9429
 */
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

public class Temporizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        damelahora oyente=new damelahora();
        
        Timer mitemporizador=new Timer(5000,oyente);
        
        mitemporizador.start();
        
        JOptionPane.showMessageDialog(null,"Pulsa aceptar para detener");
        System.exit(0);
        
        
        
    }
            
          
}
class damelahora implements ActionListener{
        
        public void actionPerformed(ActionEvent e){
            Date ahora=new Date();
            System.out.println("Se muestra la hora cada 5 segundos "+ahora);
            
            Toolkit.getDefaultToolkit().beep();
            
        }
        
        
    }