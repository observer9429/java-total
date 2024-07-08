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
public class Auxiliar extends Trabajador{

    public Auxiliar( String cod, String apeynom, String sexo, String grado, double sueldob, double bonog, double desc,double bonovida) {
        
        super(cod, apeynom, sexo, grado, sueldob, bonog, desc);
        this.bonovida = bonovida;
    }

    public double getBonovida() {
        return bonovida;
    }

    @Override
    public String toString() {
        return super.toString()+"bono de vida "+getBonovida()+"  y el sueldo neto es "+dameSueldoNeto();
    }
    
    
    
    
    
    
    
    public double dameSueldoNeto(){
        
        double saldototal=getSueldob()+getBonog()-getDesc()+getBonovida();
        
        
        return saldototal;
    }
    
    
    private double bonovida;
}
