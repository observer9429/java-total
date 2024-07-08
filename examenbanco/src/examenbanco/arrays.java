/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenbanco;

/**
 *
 * @author warez9429
 */

import javax.swing.*;
public class arrays {
public static void main(String[] args) {

int[] pes=new int[5];
     pes[0]=1;
     pes[1]=2;
     pes[2]=3;
     pes[3]=4;
     pes[4]=5;
     
     //mostrararrays(pes,0);

int elbuscar=3;
int posarrays=posicionarrays(pes,elbuscar,0);
    System.out.println(posarrays);

}


public static int posicionarrays(int[] pes,int elbuscar,int indice){
    if(pes[indice]==elbuscar){
        return indice;
            }
    else{
        return posicionarrays(pes,elbuscar,indice+1);
    }
    
}

public static void mostrararrays(int [] array,int indice){
        if(indice==(array.length-1)){
           System.out.println(array[indice]); 
        }
        else{
           System.out.println(array[indice]); 
           mostrararrays(array,indice+1);
        }
        
       /* esta es la segunda opción de hacerlo 
        if(indice!=array.length){
           System.out.println(array[indice]) ;
           mostrararrays(array,indice+1);

        }  */
             
    }





}