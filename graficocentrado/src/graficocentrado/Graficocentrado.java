/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficocentrado;

import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author warez9429
 */
public class Graficocentrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        marcocentrado elmarco=new marcocentrado();
        
        //elmarco.setTitle("full poker");
        
        elmarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        elmarco.setVisible(true);
    
    }
    
}

class marcocentrado extends JFrame{
    
    public marcocentrado(){
        
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        
        Dimension tamanopantalla=mipantalla.getScreenSize();
    
        int alturapantalla=tamanopantalla.height;
        int anchopantalla=tamanopantalla.width;
        
    
        setSize(anchopantalla/2,alturapantalla/2);
        setLocation(anchopantalla/4,alturapantalla/4);
        
        //System.out.println(tamanopantalla);
        setTitle("los lobos");
        
        //Image ellobo=mipantalla.getImage("miniwolf.png");
        
         Image ellobo=mipantalla.getImage("src/graficocentrado/miniwolf.png");
        
        setIconImage(ellobo);
        
        
}


}