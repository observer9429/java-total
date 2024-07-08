/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana003a;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class TecnicoP extends Trabajador{
    
    private double be;

    public TecnicoP() {
    }

    public double getBe() {
        return be;
    }

    public void setBe(double be) {
        this.be = be;
    }
    
    public double neto(){
        
        return (getSb()+getBon()-getDes()+be);
    }

    @Override
    public String toString() {
        return super.toString()+"Tecnico{" + "be=" + be +" neto="+neto()+ '}';
    }
    
    
    
}
