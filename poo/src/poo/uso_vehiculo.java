/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author warez9429
 */
public class uso_vehiculo {
    
    public static void main(String[]args){
        
    
        /*   Coche Renault=new Coche() ; //instanciar una clase. ejemplar de clase
//busca la clase coche, luego lee el objeto creado Renault y new Coche ejecuta o llama los datos del constructor
System.out.println("Este coche tiene " + Renault.ruedas+ " ruedas.");

  */
        /* //-----------------------------------------------------------------------------------------------------------
   elcoche micoche=new elcoche(); 
   micoche.establece_color("amarillo");
   
   
   System.out.println(micoche.dime_datos_generales());
    System.out.println(micoche.dime_color());
    
    micoche.configura_asientos("no");
    
    
    System.out.println(micoche.dime_asientos());
    */
    //------------------------------------------------------------------------------------------------------------
    elcoche micoche1=new elcoche();
    
    micoche1.establece_color("azul");
    
    furgoneta mifurgoneta1=new furgoneta(7,850);
    mifurgoneta1.establece_color("plomo");
    
    mifurgoneta1.configura_asientos("si");
   System.out.println(mifurgoneta1.dime_color());
    
    System.out.println(mifurgoneta1.dime_datos_generales());
    
    }
    
    
    
}
