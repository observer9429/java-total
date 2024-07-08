/*
 codigo, apellidos y nombres,edad cargo, sueldo basico, bono descuento
 areas
operario
sueldo basico 930
descuento 100
supervisor
sueldo basico 1500
bono 150
descuento 250
gerente
sueldo basico 7500
bono 1120
descuento 720
 */
package linkedlistzz;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public abstract class Empleado {

    public Empleado(String cod, String apeynom, String cargo, int edad, double sbasico, double desc) {
        this.cod = cod;
        this.apeynom = apeynom;
        this.cargo = cargo;
        this.edad = edad;
        this.sbasico = sbasico;
        this.desc = desc;
    }
    
    public abstract double sueldoNeto();

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSbasico() {
        return sbasico;
    }

    public void setSbasico(double sbasico) {
        this.sbasico = sbasico;
    }

    public double getDesc() {
        return desc;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Empleado{" + "cod=" + cod + ", apeynom=" + apeynom + ", cargo=" + cargo + ", edad=" + edad + ", sbasico=" + sbasico + ", desc=" + desc + '}';
    }
    
    
    
    
    private String cod, apeynom, cargo;
    private int edad;
    private double sbasico, desc;
}
