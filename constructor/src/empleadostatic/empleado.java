/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleadostatic;

/**
 *
 * @author warez9429
 */
public class empleado {
    
    public static void main(String [] args){
        
        empleados trabajador1=new empleados("paco");
empleados trabajador2=new empleados("ana");
trabajador1.cambiaseccion("rrhh");
trabajador2.cambiaseccion("pes");



System.out.println(trabajador1.devuelvedatos()+"\n"+trabajador2.devuelvedatos());

System.out.println(empleados.dameidsiguiente());
      
    }
    
}

class empleados{
    
    public empleados(String nom){
        nombre=nom;
        seccion="administración";
        id=idsiguiente;
        idsiguiente++;
        
    }
    
    public void cambiaseccion(String seccion){
        
        this.seccion=seccion;
    }
    
    
    public static String dameidsiguiente(){
        return "el id siguiente es "+idsiguiente;
    }
    
    
    public String devuelvedatos(){
        return " el nombre es : "+nombre+" y la seccion es : "+seccion +" y su id es: "+id;
    }
    
    private final String nombre;
    private  String  seccion;
    private int id;
    private static int idsiguiente=1;
    
 
    
}
