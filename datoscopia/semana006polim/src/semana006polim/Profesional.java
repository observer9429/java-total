/*

 */
package semana006polim;


public class Profesional extends Empleado{

    public Profesional( String cod, String apeynom, String sexo, String estado, String cat, double sueldob, double bonogen, double desc) {
        
        super(cod, apeynom, sexo, estado, cat, sueldob, bonogen);
        
        
        this.desc = desc;
    }
//**********************************
    public double getDesc() {
        return desc;
    }
    
    
    
    
    private double desc;
}
