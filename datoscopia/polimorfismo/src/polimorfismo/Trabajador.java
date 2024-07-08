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
public abstract class Trabajador {

    public Trabajador(String cod, String apeynom, String sexo, String grado, double sueldob, double bonog, double desc) {
        this.cod = cod;
        this.apeynom = apeynom;
        this.sexo = sexo;
        this.grado = grado;
        this.sueldob = sueldob;
        this.bonog = bonog;
        this.desc = desc;
    }
    
    public abstract double dameSueldoNeto();
//*************************************************
    public String getCod() {
        return cod;
    }

    public String getApeynom() {
        return apeynom;
    }

    public String getSexo() {
        return sexo;
    }

    public String getGrado() {
        return grado;
    }

    public double getSueldob() {
        return sueldob;
    }

    public double getBonog() {
        return bonog;
    }

    public double getDesc() {
        return desc;
    }
    
    
    @Override
    public String toString() {
        return "Trabajador{" + "cod=" + cod + ", apeynom=" + apeynom + 
                ", sexo=" + sexo + ", grado=" + grado + ", sueldob=" + sueldob + ", bonog=" + bonog + ", desc=" + desc + '}';
    }
    
    
    
    
    private String cod, apeynom, sexo,grado;
    private double sueldob, bonog, desc;

    
}
