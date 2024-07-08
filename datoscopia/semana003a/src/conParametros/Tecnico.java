/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conParametros;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Tecnico extends ElTrabajador{
    
    private double be;

    public Tecnico(double be) {
        this.be = be;
    }

    

    public double getBe() {
        return be;
    }

    public double tneto(
    ){
        return getSb()+getBe()- getDes();
    }
    
    
    public String dameDatos(){
        
        return super.toString()+" bon por riesgo "+getBe()+" y su sueldo neto es "+tneto();
    }
    
}
