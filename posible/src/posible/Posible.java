/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posible;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Posible {

    /**
     * @param args the command line arguments
     */
    static final int tamges=50;
    
    electrico[] xelectrico=new electrico[50];    
    electronico[]  xelectronico=new electronico[50];
    mecanico []  xmecanico=new mecanico[50];
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean estado=true;
        
        Connection conexion=laCon();
        
        //insertar(conexion);
        
        
        while(estado){
            
            
            
            int opc=Integer.parseInt(JOptionPane.showInputDialog("digite el numero de la operacion que desea realizar \n1 - Ingresar datos"
                    + " \n2 - Reporte total \n3 - Consultar \n4 - Salir "));
            
            if(opc==1){
                
                
                insertar(conexion);
            }else if(opc==2)    {
                
                reporte(conexion);
                
                
            }else if(opc==3)    {
                
                consultar(conexion);
                
                
            }else if(opc==4){
                
                estado=false;
            }
            
            
        }
        
        
        
        
    }
    
    static Connection laCon(){
        
        Connection laConex = null;
        
        try{
            
         laConex=DriverManager.getConnection("jdbc:mysql://localhost:3306/literarios", "root", "");
            
          
        }catch(Exception e){
            
            System.out.println("error al conectar");
        }
        
        
        return laConex;
    }
    
    static void insertar(Connection con){
        
        String elsql="INSERT INTO empleados77(codigo,nombre,edad,salario) VALUES(?,?,?,?)";
        try{
        Connection conexion=con;
        PreparedStatement prep=conexion.prepareStatement(elsql);
        
        String codigo=JOptionPane.showInputDialog("digite el codigo del empelado");
        String nombre=JOptionPane.showInputDialog("digite el nombre del empelado");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("digite la edad del empelado"));
        double salario=Double.parseDouble(JOptionPane.showInputDialog("digite el salario del empelado"));
        
        
        
        
        prep.setString(1, codigo);
        prep.setString(2, nombre);
        prep.setInt(3, edad);
        prep.setDouble(4, salario);
        
        prep.executeUpdate();
        
        
        }catch(Exception e){
            
            
        }
        
    }
    
    static void reporte(Connection con){
        
        Connection conec=con;
        
        try{
        
            Statement estat=conec.createStatement();
            ResultSet rs=estat.executeQuery("SELECT * FROM empleados77");
            
            while(rs.next()){
                
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
            }
            
            
        }catch(Exception e){
            
            System.out.println("error al extraer lso datos");
            
        }
        
        
    }
    
    static void consultar(Connection con){
        
        Connection conexion=con;
        
         try{
             
             String sqlcon="SELECT * FROM empleados77 WHERE codigo=?";
             
             String codigo=JOptionPane.showInputDialog("digite el codigo del empleado a buscar");
             
             PreparedStatement prep=conexion.prepareStatement(sqlcon);
             
             prep.setString(1, codigo);
             
            ResultSet rs= prep.executeQuery();
             
            while(rs.next()){
                
                System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));
            }
             
             
        
            
        }catch(Exception e){
            
            System.out.println("error al extraer lso datos");
            
        }
        
        
    }
    
    
}
