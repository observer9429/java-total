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
public class Auxiliar extends Trabajador{
    private double briesgo;

    public Auxiliar() {
    }

    public double getBriesgo() {
        return briesgo;
    }

    public void setBriesgo(double briesgo) {
        this.briesgo = briesgo;
    }
    
    public double neto(){
        
        return getSb()+getBon()-getDes()+briesgo;
    }
    
    public String elpadre(){// obtenemos el nombre igual con el metodo superdel padre o sin el metodo super
        
        return " el sueldo del auxiliar "+super.getApnom()+" es "+neto()+" *******"+getApnom();
    }

    @Override
    public String toString() {
        return super.toString()+"Auxiliar{" + "briesgo=" + briesgo +" neto="+neto()+ '}';//se le suma los datos 
        //del metodo tostring de la clase padre
    }
    
    
    
    
}
