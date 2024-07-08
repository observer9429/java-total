/*
 diseñar un programa que ingrese los datos de los alumnos de una universidad:
codigo del alumno, apellidos y nombres, carrera que estudia(administracion, economia o ingenieria)

examen parcial, examen final,
promedio de practicas, promedio de trabajao de campo(solo para ingenieria),
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
import javax.swing.*;

public class ElAbstracto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String carrera;
        int n=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de estudiantes"));
        
        int apro=0, desapro=0;
        
        
        for(int i=0;i<n;i++){
            
            carrera=JOptionPane.showInputDialog("digite la carrera del estudiante");
            
            if(carrera.equalsIgnoreCase("Administracion")){
                
                Administracion ser=new Administracion();
                
                ser.setCod(JOptionPane.showInputDialog("digite el código del alumno"));
                ser.setApeynom(JOptionPane.showInputDialog("digite apellidos y nombres del alumno"));
                
                ser.setCar(carrera);
                
                ser.setEp(Double.parseDouble(JOptionPane.showInputDialog("digite el examen parcial del alumno")));
                 ser.setEf(Double.parseDouble(JOptionPane.showInputDialog("digite el examen final del alumno")));
                  ser.setPp(Double.parseDouble(JOptionPane.showInputDialog("digite el promedio de practicas del alumno")));
                  
                ser.setPromexp(Double.parseDouble(JOptionPane.showInputDialog("digite el promedio de exposiciones del alumno")));
                
                if(ser.promedio()>=11.5){
                    
                    apro++;
                }else{
                    desapro++;
                    
                }
                
                
                System.out.println(ser);
                
            }else if(carrera.equalsIgnoreCase("Economia")){
                
                Economia ser=new Economia();
                
                ser.setCod(JOptionPane.showInputDialog("digite el código del alumno"));
                ser.setApeynom(JOptionPane.showInputDialog("digite apellidos y nombres del alumno"));
                
                ser.setCar(carrera);
                
                ser.setEp(Double.parseDouble(JOptionPane.showInputDialog("digite el examen parcial del alumno")));
                 ser.setEf(Double.parseDouble(JOptionPane.showInputDialog("digite el examen final del alumno")));
                  ser.setPp(Double.parseDouble(JOptionPane.showInputDialog("digite el promedio de practicas del alumno")));
                  
                ser.setPromcasos(Double.parseDouble(JOptionPane.showInputDialog("digite el promedio de casos del alumno")));
                
                if(ser.promedio()>=11.5){
                    
                    apro++;
                }else{
                    desapro++;
                    
                }
                
                System.out.println(ser);
                
            }else{
                Ingenieria ser=new Ingenieria();
                
                ser.setCod(JOptionPane.showInputDialog("digite el código del alumno"));
                ser.setApeynom(JOptionPane.showInputDialog("digite apellidos y nombres del alumno"));
                
                ser.setCar(carrera);
                
                ser.setEp(Double.parseDouble(JOptionPane.showInputDialog("digite el examen parcial del alumno")));
                 ser.setEf(Double.parseDouble(JOptionPane.showInputDialog("digite el examen final del alumno")));
                  ser.setPp(Double.parseDouble(JOptionPane.showInputDialog("digite el promedio de practicas del alumno")));
                  
                ser.setPromcampo(Double.parseDouble(JOptionPane.showInputDialog("digite el promedio de campo del alumno")));
                
                if(ser.promedio()>=11.5){
                    
                    apro++;
                }else{
                    desapro++;
                    
                }
                
                
                System.out.println(ser);
                
            }
            
            
            
            
            
        }
        
        
        System.out.println("numnero de alumnos aprobados "+apro+" y el numero de alumnos desaprobados es "+ desapro);
        
        
    }
    
}
