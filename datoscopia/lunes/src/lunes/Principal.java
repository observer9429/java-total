/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunes;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de alumnos"));
        
        for(i=1;i<=n;i++){
            
            Alumno al=new Alumno();
            
            al.setCod(JOptionPane.showInputDialog("INgrese el codigo del alumno"));
            al.setApnom("Ingrese apellidos y nombres");
            al.setAe(Integer.parseInt(JOptionPane.showInputDialog("ingrese el año de estudio")));
            al.setEp(Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota del examen parcial")));
            al.setEf(Double.parseDouble(JOptionPane.showInputDialog("ingrese la nota del examen final")));
            al.setPp(Double.parseDouble(JOptionPane.showInputDialog("ingrese el promedio de practicas")));
            
            System.out.println(al);
        }
        
    }
    
}
