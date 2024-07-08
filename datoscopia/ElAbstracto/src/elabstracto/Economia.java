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
public class Economia extends Alumno{

    public Economia() {
    }

    public double getPromcasos() {
        return promcasos;
    }

    public void setPromcasos(double promcasos) {
        this.promcasos = promcasos;
    }
    
    public double promedio(){
        
        return (getEp()+getEf()+getPp()+getPromcasos())/4;
    }

    @Override
    public String toString() {
        return super.toString()+"  Economia{" + "promcasos=" + promcasos + '}';
    }
    
    
    
    
    
    
    private double promcasos;
    
}
