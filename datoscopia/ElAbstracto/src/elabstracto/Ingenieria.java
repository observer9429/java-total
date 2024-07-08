/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elabstracto;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Ingenieria extends Alumno{

    public Ingenieria() {
    }

    public double getPromcampo() {
        return promcampo;
    }

    public void setPromcampo(double promcampo) {
        this.promcampo = promcampo;
    }
    
    public double promedio(){
        
        return (getEp()+getEf()+getPp()+getPromcampo())/4;
    }

    @Override
    public String toString() {
        return super.toString()+" Ingenieria{" + "promcampo=" + promcampo + " promedio final es "+promedio() ;
    }
    
    
    
    
    private double promcampo;
    
}
