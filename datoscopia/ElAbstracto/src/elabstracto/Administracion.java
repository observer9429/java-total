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
public class Administracion extends Alumno{

    public Administracion() {
    }

    public double getPromexp() {
        return promexp;
    }

    public void setPromexp(double promexp) {
        this.promexp = promexp;
    }
    
    
    
    public double promedio(){
        
        return (getEp()+getEf()+getPp()+getPromexp())/4;
    }

    @Override
    public String toString() {
        return super.toString()+"  Administracion{" + "promexp=" + promexp + '}';
    }
    
    
    
    
    
    private double promexp;
    
}
