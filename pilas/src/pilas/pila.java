/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

/**
 *
 * @author warez9429
 */
public class pila {
    private int [] pila;
    private int top;
    private int tamaniopila;
    
    
        public pila(){
        tamaniopila=1;
        top=-1;
        pila=new int[tamaniopila];
        
      
    }
        
        public void push(int dato){
            if(top==(tamaniopila-1)){
               redimensionar(); }
            else{
               pila[++top]=dato;
            }
                     
        }
        
        public Integer pop(){
    
            if(top<0){
               return null; 
            }
            else{
                return pila[top--];
            }
            }
        
        private void redimensionar(){
            int temp[]=pila;
            tamaniopila*=2;
            pila=new int[tamaniopila];
            for(int i=0;i<=top;i++){
               pila[i]= temp[i];
            }
        }

}
