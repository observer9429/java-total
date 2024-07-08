/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author warez9429
 */
import javax.swing.*;
public class Juego {

    /**
     * @param args the command line arguments
     */
    static int A[] = new int[100];
    
    public static void main(String[] args) {
        // TODO code application logic here
        jugador ver=new jugador();
        
        int ac =Integer.parseInt(JOptionPane.showInputDialog("digite el tamaño"));
        ver.crearmatriz(ac);
        
    }
    
}
