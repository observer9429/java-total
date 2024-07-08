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
public class mecanico extends articulosp{

    public mecanico( String tipoart, String codart, String descrip, int cant, double costou, int stockm,double costom) {
        super(tipoart, codart, descrip, cant, costou, stockm);
        this.costom = costom;
    }
    
    
    
    

    
    public void importe() {
      
    }
    
    
    private double costom;
    
}
