/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usoempleado;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author warez9429
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*empleado chacho1=new empleado(JOptionPane.showInputDialog("digite el nombre"),1500,2010,10,27);
        empleado chacho2=new empleado("ana lopez",95000,1995,06,02);
        empleado chacho3=new empleado("maria martin",105000,2002,03,15);
        
        chacho1.subesueldo(5);
        
        System.out.println("nombre: "+chacho1.damenombre()+"  sueldo: "+ chacho1.damesueldo()+ " fecha de alta: "
        +chacho1.damefechacontrato());  */
        
        empleado[] misempleados=new empleado[3];
        
        // sería lo mismo que String[] misempleados=new String[3], solo que String es una clase y "empleado" tambien,
        // ya que creamos esa clase y funciona como clase ahora
        misempleados[0]=new empleado("walcha",1500,2002,9,22);
        misempleados[1]=new empleado("ana lopez",95000,1995,6,2);
        misempleados[2]=new empleado("zeta",1500,2002,9,22);
        
        for(int i=0;i<3;i++){
            misempleados[i].subesueldo(5);
            
            
            System.out.println("nombre: "+misempleados[i].damenombre()+ "  sueldo: "+  misempleados[i].damesueldo() 
            +" fecha de alta "+ misempleados[i].damefechacontrato());
        
        
        
        }
        
    }   
    
    
    
}

class empleado{
    
    public empleado( String nom,double sue,int agno, int mes, int dia ){
        
        nombre=nom;
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        altacontrato=calendario.getTime();
    }
    
    public String damenombre(){//getter
    
        return nombre;
}
    public double damesueldo(){//getter
        return sueldo;
    }
    
    public Date damefechacontrato(){//getter
        return altacontrato;
    }
        
    public void subesueldo(double porcentaje){//setter
     
        double aumento=sueldo*porcentaje/100;
        sueldo+=aumento;
    }
        
    
    
    //ponemos las variables, empezando o al final, es lo mismo
    private String nombre;
    private double sueldo;
    private Date  altacontrato;
}
