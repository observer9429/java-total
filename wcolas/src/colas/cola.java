/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author warez9429
 */
public class cola {
    
    private int[] cola;
    private int tamanio;
    private int inicio;
    private int fin;
    
    
    //constructor
    public cola(){
        
        tamanio=5;
        inicio=-1;
        fin=-1;
        cola = new int[tamanio];
        
    }
    
    public void push(int dato){
        cola[++fin]=dato;
        if((fin+1)>=tamanio){
            redimensionar();
               
        }
         
    }
    
    
//------------
    public Integer pop(){
        if(inicio==fin){
        //    return=null;
         
        
         }
        else{
        return cola[++inicio];
        }  // return null;
        return null;
    }
    
    private void redimensionar() {
      tamanio *=2; //multiplicando el tamaño actual por 2, para que no haya errores
      int temp[]=cola;
      cola = new int[tamanio];
      
      for(int i=0;i<fin;i++){
          
       cola[i] = temp[i];  
      }
        
    }
    
}
