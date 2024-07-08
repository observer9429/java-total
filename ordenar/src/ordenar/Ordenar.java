/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenar;

/**
 *
 * @author warez9429
 */
import javax.swing.*;
public class Ordenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int poker=Integer.parseInt(JOptionPane.showInputDialog("Digite el número del tamaño que desea la matríz"));
        int[] pes=new int [poker] ;
        
        for(int i=0;i<pes.length;i++){
            pes[i]=(int) (Math.random()*(7-1+1)+1);
            
        }
        
        for(int i=0;i<pes.length;i++){
            System.out.print(" "+ pes[i]);
        }
        
        //poo=(int) (Math.random()*100);
        
    }
    
    
    
}
