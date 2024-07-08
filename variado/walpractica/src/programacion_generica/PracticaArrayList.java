package programacion_generica;

import java.util.ArrayList;

import javax.swing.*;
/*
 
 
  ademas se le pide nombre apellidos 
  edad ,
  
  paciente que se le pide area atendida
 1-cardiologiad
 2-traumatologia
 3-ermatologia
   
   salario mensual:
  
  si el salario mensual del paciente es superior o igual a 2000 soles
  debera pagar 1000 soles en cardiologia, 800 soles en traumatologia y 600 soles en dernmatologiua
   en caso sea menor a 2000 o mayor a 1500
   debera pagar 900, 700, y 500 soles respectivamente y en caso sea menor a 1500 soles
   debera pagar solo 400 en cualquier area atendida
  
 
 */
public class PracticaArrayList {

	public static void main(String[] args) {
		
		
		String elnom=JOptionPane.showInputDialog("digite el nombre del paciente");
		String elape=JOptionPane.showInputDialog("digite el apellido del paciente");
	    int laedad=Integer.parseInt(JOptionPane.showInputDialog("digite la edad del paciente"));
		String espec=JOptionPane.showInputDialog("digite el area la que fue atendido del paciente");
		double elsal=Double.parseDouble(JOptionPane.showInputDialog("digite el salario del paciente"));
		
		
		
		PTraumatologia elwe=new PTraumatologia(elnom, elape,laedad,espec,elsal);
		elwe.calculoTotal(elsal, espec);
		//System.out.println(elwe+" y el total a pagar es "+elwe.devTotal());
		
		
		
		
		ArrayList<PracticaPaciente>  listaPacientes=new ArrayList<PracticaPaciente>(100);
		
		
		ArrayList<PTraumatologia>  listaTraumatologia=new ArrayList<PTraumatologia>(100);
		
		listaTraumatologia.add(new PTraumatologia(elnom,elape,laedad,espec,elsal));
		
		
		listaTraumatologia.get(0).calculoTotal(elsal, espec);
		
		System.out.println(listaTraumatologia.get(0).toString()+" y el pago total es "+
		listaTraumatologia.get(0).devTotal() );
		
		
		

	}

}
