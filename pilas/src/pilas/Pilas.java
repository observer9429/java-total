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
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        pila accion=new pila();
        
        accion.push(50);
        accion.push(60);
        accion.push(70);
        
        System.out.println(accion.pop());
        System.out.println(accion.pop());
        System.out.println(accion.pop());
        System.out.println(accion.pop());
    }
    
}
