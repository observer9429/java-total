/*
 * diseñar un programa que ingrese los datos de los pacientes de una clinica: 
codigo, paellido y nombres, edad , peso, talla, especialidad(puede ser neurologia, 
cirugia o geriatria), cantidad de dias de internamiento.se pide costo por dia

costos :
cirugia=500, geriatria= 400,neurologia=600
 
se pide imprimir un reporte con los datos de entrada de los apcientes quei ncluya el importe neto a pagar

aplique:

a- metodo get set con constructor vacio
b- constructor parametrizado
c-constructor no parametrizado
d-con formulario

*/
package eplo002;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Eplo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int np=Integer.parseInt(JOptionPane.showInputDialog("digite el número de pacientes"));
        
        for(int i=0;i<np;i++){
            
            ElPaciente elpac=new ElPaciente();
            elpac.setCod(JOptionPane.showInputDialog("Digite el codigo del paciente"));
            elpac.setApe(JOptionPane.showInputDialog("Digite los apellidos del paciente"));
            elpac.setNom(JOptionPane.showInputDialog("Digite los nombres del paciente"));
            
            elpac.setEspecialidad(JOptionPane.showInputDialog("Digite la especialidad en la que fue atendida el paciente"));
            
            elpac.setEdad(Double.parseDouble(JOptionPane.showInputDialog("digite la edad del paciente")));
            elpac.setPeso(Double.parseDouble(JOptionPane.showInputDialog("digite el peso del paciente")));
            elpac.setTalla(Double.parseDouble(JOptionPane.showInputDialog("digite la talla del paciente")));
            elpac.setNdias(Integer.parseInt(JOptionPane.showInputDialog("digite el numero de dias que el paciente fue atendido")));
            
            elpac.calcula(elpac.getEspecialidad(), elpac.getNdias());
            
            System.out.println(elpac);
            
        }
        
    }
    
}

class ElPaciente{
    
    ElPaciente(){
        
    }
    private String cod;
    private String ape;
    private String nom;
    
    private String especialidad;
    
    
    private double edad;
    private double peso;
    private double talla;
    
    private int ndias;
    private String neurologia, cirugia, geriatria;

    private double netop;
    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
//*****************************************************
    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }
//*****************************************************
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
//*****************************************************
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
//*****************************************************
    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }
//*****************************************************
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
//*****************************************************
    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public int getNdias() {
        return ndias;
    }

    public void setNdias(int ndias) {
        this.ndias = ndias;
    }
    
    
    //*****************************************************
    //*****************************************************
    
    
    public void calcula(String espec, int numdias){
        //cirugia=500, geriatria= 400,neurologia=600
        especialidad=espec;
        ndias=numdias;
        
        if(especialidad.equalsIgnoreCase(geriatria)){
            netop=ndias*400;
            
        }else if(especialidad.equalsIgnoreCase(cirugia)){
            
            netop=ndias*500;
        }else{
            
            netop=ndias*600;
            
        }
        
    }
    
    public double devNeto(){
        return netop;
    }
         
    
    //*****************************************************
    //*****************************************************
    //*****************************************************

    @Override
    public String toString() {
        return "ElPaciente{" + "cod=" + cod + ", ape=" + ape + ", nom=" + nom + ", especialidad=" + especialidad + ", edad=" + edad + ", peso=" + peso + ", talla=" + talla + ", ndias=" + ndias +  ", netop=" + netop + '}';
    }

    
    
    
}
