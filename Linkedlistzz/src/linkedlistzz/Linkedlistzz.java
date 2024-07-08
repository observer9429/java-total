/*

codigo, apellidos y nombres,edad cargo, sueldo basico, bono descuento
 areas
operario

sueldo basico 930
descuento 100

supervisor

sueldo basico 1500
bono 150
descuento 250

gerente

sueldo basico 7500
bono 1120
descuento 720

 */
package linkedlistzz;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * 
 * 
 * 
 */
public class Linkedlistzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //ArrayList<String> elpe=new ArrayList<>();
        
        
        LinkedList elwe=new LinkedList();
        
        elwe.add("carol");
        elwe.add("pes");
                elwe.add("poo");
                
                
                
                System.out.println(elwe+"\n");
                
                for(int i=0;i<3;i++){
                    
                    System.out.println(elwe.get(i));
                }
                
                for( Object e: elwe){
                    
                    System.out.println(e);
                }
    }
    
}
