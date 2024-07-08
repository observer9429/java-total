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

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Semana006polim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double bonotecni=0;
        double descuento=0;
        
        String cod, apeynom, sexo, estado, cat;
    
        
         double sueldob, bonogen;
         
         
        
        int pp=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de empleados"));
        
        
        cod = JOptionPane.showInputDialog("digite el codigo del empleado");
        apeynom=JOptionPane.showInputDialog("digite apellidos y nombres del empleado");
        sexo=JOptionPane.showInputDialog("digite el sexo del empleado");
        estado=JOptionPane.showInputDialog("digite el estado civil del empleado");
        
        cat=JOptionPane.showInputDialog("digite la categoria del empleado");
        
        
        sueldob=Double.parseDouble(JOptionPane.showInputDialog("digite el sueldo basico del empleado"));
        bonogen=Double.parseDouble(JOptionPane.showInputDialog("digite el la bonificacion del empleado"));
        
        if(cat.equalsIgnoreCase("tecnico")){
            int tipotec=Integer.parseInt(JOptionPane.showInputDialog("digite la opcion para dar el bono deseado"
                    + "\n Presiones 1 para bonificacion especial"+" \n Presione 2 para bono por riesgo de vida"));
            if(tipotec==1){
                
                bonotecni=Double.parseDouble(JOptionPane.showInputDialog("digite la bonificacion especial"));
                
            }else{
                
                bonotecni=Double.parseDouble(JOptionPane.showInputDialog("digite la bonificacion de riesgo por vida"));
            }
            
            
        }else if(cat.equalsIgnoreCase("Profesional")){
            
            descuento=Double.parseDouble(JOptionPane.showInputDialog("digite el descuento de retencion de quinta categoria"));
            
        }
        
        
        
        
        if(cat.equalsIgnoreCase("Auxiliar")){
            
            Auxiliar elaux=new Auxiliar(cod, apeynom, sexo, estado, cat, sueldob, bonogen);
            
            elaux.calculaSueldo(elaux.getSueldob(), elaux.getBonogen());
            
        }else if(cat.equalsIgnoreCase("Tecnico")){
            
            Tecnico eltec=new Tecnico(cod, apeynom, sexo, estado, cat, sueldob, bonogen,bonotecni) ;
            
            eltec.calculaSueldo(eltec.getSueldob(), eltec.getBonogen(),bonotecni);
            
            
        }else{
            
            Profesional elpro=new Profesional(cod, apeynom, sexo, estado, cat, sueldob, bonogen,bonotecni);
            
        }
        
        
        
        
        
        
        
        
        
        
        
         
    }
    
}
