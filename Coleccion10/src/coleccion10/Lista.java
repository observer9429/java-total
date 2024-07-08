/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion10;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Lista {
    
    public Lista(){
        
        primero=null;
        ultimo=null;
        tamanio=0;
    }
    
    public boolean isEmpty(){
        return primero==null;
    }
    
    public int size(){
        return tamanio;
    }
    
    public void addLast(String nombre){
        
       Nodo aux;
        
        if(isEmpty()){
             aux=new Nodo(nombre,null); 
            primero=aux;
            ultimo=aux;
        }else if(size()==1){
            
            aux=new Nodo(nombre,null);
            
            ultimo=aux;
            
            primero.setSiguiente(aux);
        }else{
         
            aux=new Nodo(nombre,null);
            
            ultimo.setSiguiente(aux);
            
        }
        
        tamanio++;
    }

    public void verNom(){
        
        Nodo aux=primero;
        
        while(aux!=null){
            
            System.out.println(aux.getNom());
            aux=aux.getSiguiente();
            
        }
        
    }
    

    
    
    
    private Nodo primero;
    private Nodo ultimo;
    private int tamanio;
}
