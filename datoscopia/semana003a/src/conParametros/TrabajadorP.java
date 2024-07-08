/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conParametros;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class TrabajadorP {
    
    public static void main(String[] args) {
        
        int n=Integer.parseInt(JOptionPane.showInputDialog("digite el nuemro de trabajadores"));
        
        
        
        for(int i=0;i<n;i++){
           String cat=JOptionPane.showInputDialog("Ingrese la categoria del trabajador");
           
           if(cat.equalsIgnoreCase("auxiliar")){
               
               
               
           }
           
           
            
            
        }
        
        
    }
    
}

class ElTrabajador{

    public ElTrabajador() {
    }
    
    private String apnom, cod, cat;

    private double sb, bon, des;
    
    public String getApnom() {
        return apnom;
    }

    public void setApnom(String apnom) {
        this.apnom = apnom;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public double getSb() {
        return sb;
    }

    public void setSb(double sb) {
        this.sb = sb;
    }

    public double getBon() {
        return bon;
    }

    public void setBon(double bon) {
        this.bon = bon;
    }

    public double getDes() {
        return des;
    }

    public void setDes(double des) {
        this.des = des;
    }

    @Override
    public String toString() {
        return "ElTrabajador{" + "apnom=" + apnom + ", cod=" + cod + ", cat=" + cat +
                ", sb=" + sb + ", bon=" + bon + ", des=" + des + '}';
    }

    
    
    
    
    
    
}