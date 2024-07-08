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
public class elcoche {
    
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private  int peso_total;
    private boolean asientos_cuero, climatizador;
    
    public elcoche(){
        //constructor
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;
        
        
    }
    public String dime_datos_generales(){//getters, el string es el tipo de dato que va devolver
    
    return "La plataforma del vehículo tiene "+ ruedas+" ruedas "+".Mide "+ largo/1000+
            " m de largo con un ancho de "+ancho+ " cm y un peso de plataforma de "+ peso_plataforma+ " kg";
           }
    
    
    
    
    public void establece_color(String color_coche){//setter----> modifoca el valor
    
        color=color_coche;
           }
    
    public String dime_color(){//getters
        
        return "el color del coche es "+ color;
    }
    
    
    public void configura_asientos(String asientos_cuero){
        if(asientos_cuero=="si"){
            this.asientos_cuero=true;         
                
        }
        else{
           this.asientos_cuero=false; 
            
        }
        
        
            
        }
    public String dime_asientos(){
            if(asientos_cuero=true){
                return "el coche tiene asientos de cuero";
                            }
            else{
                return " el coche tiene asientos de serie";
            }
        
    }
    
    
    
    
}
