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
public class AuxiliarP extends TrabajadorP{
    private double briesgo;

    public AuxiliarP(double briesgo) {
        this.briesgo = briesgo;
    }

    

    public double getBriesgo() {
        return briesgo;
    }
    
    public double tneto(
    ){
        return getSb()+briesgo- getDes();
    }
    
    public String dameDatos(){
        
        return super.toString()+" bon por riesgo "+getBriesgo()+" y su sueldo neto es "+tneto();
    }
                 
}
