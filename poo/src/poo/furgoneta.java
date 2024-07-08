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
public class furgoneta extends elcoche{
    
    private int capacidad_carga;
    private int plazas_extra;
 
    public furgoneta(int plazas_extra, int capacidad_carga){
        super();//llama al constructor de la clase padre, llama a elcoche
        this.capacidad_carga=capacidad_carga;
        this.plazas_extra=plazas_extra;
        
        
        
    }
    
    public String dimedatosfurgoneta(){
            return "La capacidad de carga es "+capacidad_carga+" y las plazas son "+plazas_extra;
        }
}
