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
public class Pracronometro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fotocrono poker=new fotocrono();
        
        poker.setVisible(true);
        
     codigos[] lista=new codigos[10];
     
     codigos elcod=new codigos("1585","cherrr");
     
     lista[0]=elcod;
        
        System.out.println(lista[0].getCod()+" "+lista[0].getNom());
        
        
    }
    
}

class codigos{
    
    public codigos(String codigo, String nombre){
        
        cod=codigo;
        nom=nombre;
        
    }

    public String getCod() {
        return cod;
    }

    public String getNom() {
        return nom;
    }
    
    
    
    
    
    
    String cod, nom;
}