package laspracticaspolim;

import javax.swing.JOptionPane;

public class PracticaPolimorfismo {

	public static void main(String[] args) {
		
		
		double bonoesp=0, bonovida=0;
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
                
                bonoesp=Double.parseDouble(JOptionPane.showInputDialog("digite la bonificacion especial"));
                
                Empleado elemp=new Empleado(cod,apeynom,sexo,estado,cat,sueldob,bonogen);
                
                elemp.calculaSueldo(bonoesp, 0);
                //String cod, String apeynom, String sexo, String estado, String cat, double sueldob,
    			//double bonogen
                
            }else{
                
                bonovida=Double.parseDouble(JOptionPane.showInputDialog("digite la bonificacion de riesgo por vida"));
                
                Empleado elemp=new Empleado(cod,apeynom,sexo,estado,cat,sueldob,bonogen);
                
                elemp.calculaSueldo(0, bonovida);
            }
            
            
        }else if(cat.equalsIgnoreCase("Profesional")){
            
            descuento=Double.parseDouble(JOptionPane.showInputDialog("digite el descuento de retencion de quinta categoria"));
            
            Empleado elemp=new Empleado(cod,apeynom,sexo,estado,cat,sueldob,bonogen);
            
            elemp.calculaSueldo(descuento);
            
        }else {
        	Empleado elemp=new Empleado(cod,apeynom,sexo,estado,cat,sueldob,bonogen);
        	
        	elemp.calculaSueldo();
        	
        }

        
      //***********************************
        
        
        
        
        
        
        
        
        
	}

}
