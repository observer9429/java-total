/*
 DISEÑE UN PROGRAMA QUE INGRESE LOS DATOS DE LOS TRABAJADORES DE UNA EMPRESA
(PROFESIONALES, TÉCNICOS Y AUXILIARES): 
CÓDIGO, APELLIDOS Y NOMBRES, SEXO, SUELDO BÁSICO, BONIFICACION, DESCUENTO, 

BONIFICACION POR RIESGO DE VIDA (SOLOS PARA AUXILIARES),
BONIFICACION POR FORMACIÓN (SOLO PARA TÉCNICOS) 
Y BONIFICACION DE DESEMPEÑO (SOLO PARA PROFESIONALES Y TÉCNICOS); 
.
A) APLICAR HERENCIA APLIQUE MÉTODOS GETTER Y SETTER Y ENLACE DINÁMICO.

B) APLICAR MÉTODOS SOBRECARGADOS

EN LOS DOS CASOS APLICAR FORMULARIO
 */
package polimorfismo;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Tecnico extends Trabajador{

    public Tecnico( String cod, String apeynom, String sexo, String grado, double sueldob, double bonog, double desc,double bonotec) {
        
        super(cod, apeynom, sexo, grado, sueldob, bonog, desc);
        
        this.bonotec = bonotec;
    }

    public double getBonotec() {
        return bonotec;
    }
    
    //******************
    
    public double dameSueldoNeto(){
        
        double saldototal=getSueldob()+getBonog()-getDesc()+getBonotec();
        
        
        return saldototal;
    }

    public double getBonotecfor() {
        return bonotecfor;
    }

    public double getBonotecdes() {
        return bonotecdes;
    }

    public void setBonotecfor(double bonotecfor) {
        this.bonotecfor = bonotecfor;
    }

    public void setBonotecdes(double bonotecdes) {
        this.bonotecdes = bonotecdes;
    }
    
    
    
    
    
    
    
    
    private double bonotec;
    
    private double bonotecfor, bonotecdes;
}
