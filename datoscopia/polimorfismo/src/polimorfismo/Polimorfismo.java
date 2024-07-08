/*
 DISEÑE UN PROGRAMA QUE INGRESE LOS DATOS DE LOS TRABAJADORES DE UNA EMPRESA
(PROFESIONALES, TÉCNICOS Y AUXILIARES):
CÓDIGO, APELLIDOS Y NOMBRES, SEXO,SUELDO BÁSICO, BONIFICACION, DESCUENTO, 


BONIFICACION POR RIESGO DE VIDA (SOLOS PARA AUXILIARES),
BONIFICACION POR FORMACIÓN (SOLO PARA TÉCNICOS)
Y BONIFICACION DE DESEMPEÑO (SOLO PARA PROFESIONALES neeel ->Y TÉCNICOS); .
APLICAR HERENCIA APLIQUE MÉTODOS GETTER Y SETTER Y ENLACE DINÁMICO.

APLICAR FORMULARIO
 */
package polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cod, apeynom, sexo,grado;
        double sueldob, bonog, desc;
        
        double bonovida,bonotec,bonodes;
        
        
        int n;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de trabajadores"));
        
        for(int i=0;i<n;i++){
            
            cod=JOptionPane.showInputDialog("digite el código del trabajador");
            apeynom=JOptionPane.showInputDialog("digite apellidos y nombres del trabajador");
            sexo=JOptionPane.showInputDialog("digite el sexo del trabajador");
            grado=JOptionPane.showInputDialog("digite el grado del trabajador");
            
            sueldob=Double.parseDouble(JOptionPane.showInputDialog("digite el sueldo básico del trabajador"));
            bonog=Double.parseDouble(JOptionPane.showInputDialog("digite la bonificación del trabajador"));
            desc=Double.parseDouble(JOptionPane.showInputDialog("digite el descuento del trabajador"));
            
            
            
            if(grado.equalsIgnoreCase("Auxiliar")){
                
                bonovida=Double.parseDouble(JOptionPane.showInputDialog("digite el bono de riesgo de vida"));
                
                Auxiliar elaux=new Auxiliar(cod, apeynom, sexo, grado, sueldob, bonog, desc, bonovida);
                System.out.println(elaux.toString());
                System.out.println("el sueldo neto de este empleado es "+elaux.dameSueldoNeto());
            }else if(grado.equalsIgnoreCase("Tecnico")){
                int opcion;
                
                opcion=Integer.parseInt(JOptionPane.showInputDialog("digite la opción del bono: \n 1: Para bono por formación  "
                        + " \n 2: Para bono por desempeño"));
                if(opcion==1){
                    
                    bonotec=Double.parseDouble(JOptionPane.showInputDialog("digite el bono de formación"));
                    
                    Tecnico eltec=new Tecnico(cod, apeynom, sexo, grado, sueldob, bonog, desc, bonotec);
                    
                    eltec.setBonotecfor(bonotec);
                    
                    System.out.println(eltec.toString()+" bono por formacion "+eltec.getBonotecfor()+
                            " y sueldo neto es: "+eltec.dameSueldoNeto());
                    
                }else{
                    
                    bonotec=Double.parseDouble(JOptionPane.showInputDialog("digite el bono de desempeño"));
                    
                    Tecnico eltec=new Tecnico(cod, apeynom, sexo, grado, sueldob, bonog, desc, bonotec);
                    
                    eltec.setBonotecdes(bonotec);
                    
                    System.out.println(eltec.toString()+" bono por desempeño "+eltec.getBonotecdes()+
                            " y sueldo neto es: "+eltec.dameSueldoNeto());
                    
                }
                
                
                
            }else{
                
                bonodes=Double.parseDouble(JOptionPane.showInputDialog("digite el bono por desempeño"));
                
                Profesional elpro=new Profesional(cod, apeynom, sexo, grado, sueldob, bonog, desc, bonodes);
                
                System.out.println(elpro.toString());
                System.out.println("el sueldo neto de este empleado es "+elpro.dameSueldoNeto());
                
            }
            
        }
        
        
        
        
    }
    
}
