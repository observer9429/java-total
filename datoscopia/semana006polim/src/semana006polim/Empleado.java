/*
 REALIZAR UN PROGRAMA QUE INGRESE LOS DATOS DE N EMPLEADOS DE UNA EMPRESA:

CODIGO DEL EMPLEADO, APELLIDOS Y NOMBRES, SEXO, ESTADO CIVIL, 

CATEGORIA  (PUEDE SER AUXILIAR, TECNICO O PROFESIONAL), 

SUELDO BASICO, BONIFICACION


DESCUENTO RETENCION DE QUINTA CATEGORIA(SOLO PARA PROFESIONALES),
BONIFICACION ESPECIAL( SOLO PARA TECNICOS)
BONIFICACION POR RIESGO DE VIDA( SOLO PARA TECNICOS)

SE PIDE IMPRIMIR UN REPORTE CON LOS DATOS DE ENTRADA
QUE INCLUYA EL SUELDO NETO DE CADA TRABAJADOR Y AL PIE DEL REPORTE SE DEBE IMPRIMIR EL TOTAL DE SUELDOS NETOS POR CATEGORIA

APLIQUE SOBRECARGA DE METODOS
 */
package semana006polim;


public class Empleado {

    public Empleado(String cod, String apeynom, String sexo, String estado, String cat, double sueldob, double bonogen) {
        this.cod = cod;
        this.apeynom = apeynom;
        this.sexo = sexo;
        this.estado = estado;
        this.cat = cat;
        this.sueldob = sueldob;
        this.bonogen = bonogen;
    }
///*****************************
    public String getCod() {
        return cod;
    }

    public String getApeynom() {
        return apeynom;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEstado() {
        return estado;
    }

    public String getCat() {
        return cat;
    }

    public double getSueldob() {
        return sueldob;
    }

    public double getBonogen() {
        return bonogen;
    }
    
   //**************************************************
    
    public void calculaSueldo(double sueldob, double bonogen){
        
        
        
         stotal=sueldob+bonogen;
        
        
    }

    public void calculaSueldo(double sueldob, double bonogen, double bonotec){
        
        stotal= sueldob+ bonogen+ bonotec;
        
        
    }
    
    
    public double dameSueldo() {
        return stotal;
    }
    
    
    
    
    //*********************
    private double stotal;

    @Override
    public String toString() {
        return "Empleado{" + "stotal=" + stotal + ", cod=" + cod + ","
                + " apeynom=" + apeynom + ", sexo=" + sexo + ", estado=" + estado + 
                ", cat=" + cat + ", sueldob=" + sueldob + ", bonogen=" + bonogen + '}';
    }
    
    
    
    
    
    private String cod, apeynom, sexo, estado, cat;
    
    private double sueldob, bonogen;
}
