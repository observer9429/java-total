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
public class colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cola cola=new cola();
        
        cola.push(1);
        cola.push(2);
        cola.push(35);
        cola.push(4);
        
        System.out.println(cola.pop());
        System.out.println(cola.pop());
        System.out.println(cola.pop());
        System.out.println(cola.pop());
    }
    
}
