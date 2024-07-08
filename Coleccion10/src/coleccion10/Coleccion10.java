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

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Coleccion10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de socios"));
         String cod, apeynom, cat;
         double cmensual;
    
         
         ArrayList<Object> elwe=new ArrayList<>();
         
        for(int i=0;i<n;i++){
            
            cod=JOptionPane.showInputDialog("digite el codigo del socio");
            apeynom=JOptionPane.showInputDialog("digite el apellido y nombre del socio");
            cat=JOptionPane.showInputDialog("digite la categoria del socio");
            cmensual=Double.parseDouble(JOptionPane.showInputDialog("digite la cuota mensual del socio"));
            
            Socio elsoc=new Socio(cod, apeynom, cat, cmensual);
            
            elwe.add(elsoc);
        }
        
        for(Object e: elwe){
            
            System.out.println(e.toString());
        }
        
        
        /*
        elwe.add("piplot");
        elwe.add("nel");
        elwe.add("la wea");
        
        for(Object e: elwe){
            
            System.out.println(e.toString());
        }
        */
        
        Lista vv=new Lista();
        
        vv.addLast("mark suker");
        vv.addLast("alejandro");
        vv.addLast("spiderman");
        vv.addLast("mary jane");
        
        
        vv.verNom();
        
        
    }
    
}
