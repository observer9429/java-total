/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporizadorlocalinterno;

/**
 *
 * @author warez9429
 */
//import java.awt.Toolkit;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;
public class Temporizadorlocalinterno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    reloj mireloj=new reloj();
    mireloj.enmarcha(3000,true);
    JOptionPane.showMessageDialog(null,"pulsa aceptar para termina");
    System.exit(0);
               
    }
    
}
class reloj{
    
    public void enmarcha(int intervalo,final boolean sonido){
        
        class damelahora2 implements ActionListener{
            public void actionPerformed(ActionEvent evento){
                Date ahora=new  Date();
                System.out.println("te pongo la hora cada 3 segundos "+ahora);
                if(sonido){
                    Toolkit.getDefaultToolkit().beep();
                  }
                
          
            
        } 
        }
    
    ActionListener oyente=new damelahora2();
    Timer mitemporizador=new Timer (intervalo,oyente);
    mitemporizador.start();
    
    
}
}  