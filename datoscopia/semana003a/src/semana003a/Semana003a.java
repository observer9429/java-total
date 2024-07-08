/*
 diseñar un programa que ingrese lso datos de los trabajadores de una empresa: 
codigo del traajador, apellidos y nombres, categoria(puede ser auxiliar o tecnico), 
sueldo basico, bonificacion, descuento; bonificacion por riesgo(solo para auxiliares),
bonificacion especial, (solo para tecnicos), se pide imprimir un reporte con los datos 
de los trabajadores q incluya el sueldo neto de cada trabajador

aplique herencia
 */
package semana003a;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-AQ265-A0302
 */
public class Semana003a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        String cat;
        
        n=Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de trabajadores"));
        
        for(int i=0;i<n;i++){
            
            cat=JOptionPane.showInputDialog("ingrese la categoria del trabajador");
            
            if(cat.equalsIgnoreCase("Auxiliar")){
                
                Auxiliar elaux=new Auxiliar();
                
                elaux.setCod(JOptionPane.showInputDialog("ingrese el codigo del trabajador"));
                elaux.setApnom(JOptionPane.showInputDialog("ingrese apellidos y nombres del trabajador"));
                elaux.setCat(cat);
                elaux.setSb(Double.parseDouble(JOptionPane.showInputDialog("ingrese el sueldo basico del trabajador")));
                elaux.setBriesgo(Double.parseDouble(JOptionPane.showInputDialog("ingrese la bonificacion de riesgo del trabajador")));
                
                System.out.println(elaux);
                
                System.out.println(elaux.elpadre());
                
            }else{
                Tecnico eltec=new Tecnico();
                
                
                eltec.setCod(JOptionPane.showInputDialog("ingrese el codigo del trabajador"));
                eltec.setApnom(JOptionPane.showInputDialog("ingrese apellidos y nombres del trabajador"));
                eltec.setCat(cat);
                eltec.setSb(Double.parseDouble(JOptionPane.showInputDialog("ingrese el sueldo basico del trabajador")));
                eltec.setBe(Double.parseDouble(JOptionPane.showInputDialog("ingrese la bonificacion especial del trabajador")));
                
                System.out.println(eltec);
            }
            
        }
    }
    
}

class Trabajador{
    private String cod, apnom, cat;
    double sb, bon, des;

    public Trabajador() {
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getApnom() {
        return apnom;
    }

    public void setApnom(String apnom) {
        this.apnom = apnom;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public double getSb() {
        return sb;
    }

    public void setSb(double sb) {
        this.sb = sb;
    }

    public double getBon() {
        return bon;
    }

    public void setBon(double bon) {
        this.bon = bon;
    }

    public double getDes() {
        return des;
    }

    public void setDes(double des) {
        this.des = des;
    }
    
    //****************************

    @Override
    public String toString() {
        return "Trabajador{" + "cod=" + cod + ", apnom=" + apnom + ", cat=" + cat + ", sb=" + sb + ", bon=" + bon + ", des=" + des + '}';
    }
    
}
