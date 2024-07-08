/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package empresazz;

import javax.swing.*;
/**
 *
 * @author warez9429
 */
public class Empresazz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ntra=Integer.parseInt(JOptionPane.showInputDialog("Digite el número de trabajadores"));
        
        double suelb=1000;
        
        String[] elcod=new String[ntra];
        String[] elapell=new String[ntra];
        String[] elnom=new String[ntra];
        String[] elcateg=new String[ntra];
        
        
        //double[] elsb=new double [ntra];
        double[] elbonif=new double [ntra];
        double[] eldesc=new double [ntra];
        double[] elsueln=new double [ntra];
        
        double[] eltsn=new double [ntra];
        
        
        
        
        
        for(int i=0;i<ntra;i++){
            
            elcod[i]=JOptionPane.showInputDialog("Digite el código del trabajador");
            elapell[i]=JOptionPane.showInputDialog("Digite el apellido del trabajador");
            elnom[i]=JOptionPane.showInputDialog("Digite el nombre del trabajador");
            elcateg[i]=JOptionPane.showInputDialog("Digite la categoría del trabajador");
           // elbonif[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite la bonificación  del trabajador"));
            eldesc[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite el descuento del trabajador"));
           
            
            if(elcateg[i].equals("auxiliar")){
                
                elbonif[i]=100;
            }else if(elcateg[i].equals("tecnico")){
                
                elbonif[i]=250;
            }else{
                
                elbonif[i]=600;
            }
            
            elsueln[i]=suelb + elbonif[i]-eldesc[i];
           
            
        }
        
        
        
        for(int j=0;j<ntra;j++){
            
            System.out.println("El sueldo neto del trabajador "+elnom[j]+" "+elapell[j]+" es "+elsueln[j]);
            
        }
        
        /*
        we.setNom(JOptionPane.showInputDialog("digite el nombre del empleado"));
        
        System.out.println("el nombre del empleado es "+we.getNom());
        */
        
    }
    
}


