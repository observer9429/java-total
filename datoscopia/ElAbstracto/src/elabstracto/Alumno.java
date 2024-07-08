/*
 diseñar un programa que ingrese los datos de los alumnos de una universidad:
codigo del alumno, apellidos y nombres, carrera que estudia(administracion, economia o ingenieria)

examen parcial, examen final, promedio de practicas, 

promedio de trabajao de campo(solo para ingenieria),
promedio de exposiciones(solo para administracion)
promedio de trabajo de casos(solo para economia)

se pide imprimir un reporte con los datos de entrada que incluya el promedio de cada alumno. y al pie del reporte
la cantidad de aprobados y desaprobados. aplique herencia y clase abstracta

 */
package elabstracto;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public abstract class Alumno {
    
    private String cod, apeynom, car;
    private double ep, ef, pp;

    public Alumno() {
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

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public double getEp() {
        return ep;
    }

    public void setEp(double ep) {
        this.ep = ep;
    }

    public double getEf() {
        return ef;
    }

    public void setEf(double ef) {
        this.ef = ef;
    }

    public double getPp() {
        return pp;
    }

    public void setPp(double pp) {
        this.pp = pp;
    }
    
    
    
    public abstract double promedio();
    
   

    @Override
    public String toString() {
        return "Alumno{" + "cod=" + cod + ", apeynom=" + apeynom + ", car=" + car + ", ep=" + ep + ", ef=" + ef + ", pp=" + pp + '}';
    }
    
    
    
}
