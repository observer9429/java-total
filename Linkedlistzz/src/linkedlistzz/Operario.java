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
public class Operario extends Empleado{

    public Operario(String cod, String apeynom, String cargo, int edad, double sbasico, double desc) {
        super(cod, apeynom, cargo, edad, sbasico, desc);
    }
    
    public double sueldoNeto(){
        
        return getSbasico()-getDesc();
    }

    @Override
    public String toString() {
        return "Operario{" + super.toString()+ "bono "+getSbasico()+" sueldo neto "+ sueldoNeto();
    }
    
    
    
}
