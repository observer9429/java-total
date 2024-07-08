/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posible;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class electrico extends articulosp{

    public electrico(String tipoart, String codart, String descrip, int cant, double costou, int stockm) {
        super(tipoart, codart, descrip, cant, costou, stockm);
    }

    
    public void importe() {
       
        
        
    }

    @Override
    public String toString() {
        return "electrico{" + '}'+super.toString();
    }
    
    
    
}
