/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoform;

/**
 *
 * @author warez9429
 */
public class funcbanco {
    
    
    private String nametitular;
    private String numbercuenta;
    private String namebank;
    private double saldo;
    
    
    public funcbanco(){
        
               
           namebank="Banco ZZ";
           saldo=10000;
                 }
    
    public funcbanco(String numbercuenta,String nametitular){
        
               
           namebank="Banco ZZ";
       
           this.defnombre(nametitular);
           this.defcuenta(numbercuenta);
            saldo=10000;
      
                 }
    public double damesaldo(){
        //pes();si el método es privado si se puede incovar dentro de otro metodo
        return saldo;
    }
    
    //private void pes(){
        
    //}
   
    
    public double depositar(double depositar){
        
      return  saldo=saldo+depositar;
    }
    
    public void retirar(double retirar){
        saldo=saldo-retirar;
        
    }
    
    
    
    
    public String damedatos(){
       return "Bienvenido al "+ namebank;
    }
    
    public void defnombre(String nomtitular){
        
        nametitular=nomtitular;
                
    }
    
    public String damnombre(){
        return nametitular;
    }
    
    public void defcuenta(String numcuenta){
        numbercuenta=numcuenta;
    }
    
    public String damcuenta(){
        return numbercuenta;
    }
    
    
}
