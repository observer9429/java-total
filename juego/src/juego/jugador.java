/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author warez9429
 */

public class jugador {
    
    String jugador1,jugador2;
    public jugador(){
        
        jugador1="chicharito";
        jugador2="spiderman";
        
    }
    
    public static void crearmatriz(int num){
        int []  pes=new int[num];
        for(int i=0;i<pes.length;i++){
            pes[i]=(int) (Math.random()*(7-1+1)+1);
        }
        
    }
    
    public static void imprimir(){
        for(int j=0;j<100;j++){
            
           // System.out.println(" "+pes[j]);
        }
        
    }
    
    
    
}
