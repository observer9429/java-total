/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistzz;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Gerente extends Empleado{

    public Gerente( String cod, String apeynom, String cargo, int edad, double sbasico, double desc, double bono) {
        super(cod, apeynom, cargo, edad, sbasico, desc);
        this.bono = bono;
    }

    public double sueldoNeto(){
        
         return getSbasico()-getDesc()+getBono();
    }
    
    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
        
        
    }

    @Override
    public String toString() {
        return super.toString()+ "Gerente{" + "bono=" + bono + "sueldo neto "+ sueldoNeto();
    }

   
    
    
    
    private double bono;
}
