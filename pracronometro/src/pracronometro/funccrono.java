/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracronometro;

/**
 *
 * @author warez9429
 */
public class funccrono {
    private static int horas;
    private static int minutos;
    private static int segundos;
    
    
    public funccrono(){
    horas=0;
    minutos=0;
    segundos=0;
    
}
    
    
   /* public funccrono(int peces){
    horas=0;
    minutos=0;
    segundos=0;
    
}   */
    
    public int plussecond(){
        return segundos++;
    }
    //public void aumentar(){
      //  
       // segundos=segundos++;
    //}
    
    public int damesegundoactual(int numeroseg){
        
        return segundos=numeroseg;
    }
    public  int damesegundoaumentado(){

        return  segundos;  
    }
    
    public int menossegundos(){
        
        return segundos--;
    }
    
    
    
    //-----------------------------
    public int plusminutes(){
       return minutos++;
    }
    
    public int dameminutosactuales(int numeromin){
        return minutos=numeromin;
    }
    public int dameminutoaumentado(){
        return minutos;
     }
    
    //public int menosminutos(){
      //  return minutos--;
    //}
    //-------------------------------
   public int plushours(){
       return horas++;
   }
   
   public int damehorasactuales(int lashoras){
       return horas=lashoras;
   }
   
   public int damehoraumentada(){
       return horas;
   }
    
   
   
}
