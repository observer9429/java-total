/*
 TEM: colecciones - arreglo de objetos
diseñarun programa que ingrese los datos de los socios de un club a un arreglo
de objetos:
codigo del socio, apellidos y nombres, categoria(puede ser exlusivo ordinario o asociado)
, sexo, estado civil, cuota mensual, 

cuota extraordinaria solo para socios exclusivos, 
cuotas por acceso a zonas vip solo para asociados

y mora del 5% para ordinarios
mora del 8% para asociados y 
mora del 10% para exclusivos

imprima u reporte con los datos de entrada que incluya el importe neto a pagar del socio
 */
package coleccion10;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Socio {

    public Socio(String cod, String apeynom, String cat, double cmensual) {
        this.cod = cod;
        this.apeynom = apeynom;
        this.cat = cat;
        this.cmensual = cmensual;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getApeynom() {
        return apeynom;
    }

    public void setApeynom(String apeynom) {
        this.apeynom = apeynom;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public double getCmensual() {
        return cmensual;
    }

    public void setCmensual(double cmensual) {
        this.cmensual = cmensual;
    }

    @Override
    public String toString() {
        return "Socio{" + "cod=" + cod + ", apeynom=" + apeynom + ", cat=" + cat + ", cmensual=" + cmensual + '}';
    }
    
    
    
    
    
    private String cod, apeynom, cat;
    private double cmensual;
    
}
