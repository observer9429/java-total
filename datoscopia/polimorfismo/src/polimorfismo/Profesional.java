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
public class Profesional extends Trabajador{

    public Profesional( String cod, String apeynom, String sexo, String grado, double sueldob, double bonog, double desc,double bonodes)
    {
        super(cod, apeynom, sexo, grado, sueldob, bonog, desc);
        this.bonodes = bonodes;
    }

    public double getBonodes() {
        return bonodes;
    }
    
    //********************
    
    public double dameSueldoNeto(){
        
        double saldototal=getSueldob()+getBonog()-getDesc()+getBonodes();
        
        
        return saldototal;
    }
    
    private double bonodes;
    
}
