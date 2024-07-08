package zzAnexos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaJTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		marcoTabla ee=new marcoTabla();
		ee.setVisible(true);
		ee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class marcoTabla extends JFrame{
	
	public marcoTabla() {
		
	setTitle("con JTable");
	setBounds(700,200,400,550);
	
	JTable tablaPlaneta=new JTable(datosFila,nombreColumnas);
	
	add(new JScrollPane(tablaPlaneta),BorderLayout.CENTER);
	
	JButton botonImprimir=new JButton("Imprimir tabla");
	
	botonImprimir.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			try {
				
				tablaPlaneta.print();
				
			} catch (Exception e2) {

				e2.printStackTrace();
			}
			
		}
		
		
	});
	
	
	
	JPanel laminaBot=new JPanel();
	laminaBot.add(botonImprimir);
	add(laminaBot,BorderLayout.SOUTH);
	
	}
	
	private String [] nombreColumnas= {"Nombre","Radio","Lunas","Gaseoso"};
	
	private Object [][] datosFila= {
			
			{"Mercurio",2440.0,0,false},
			{"Neptuno",2440.0,0,false},
			{"pluton",2440.0,0,false},
			{"saturno",2440.0,0,false},
			{"xd",2440.0,0,false},
			{"xp",2440.0,0,false},
			{"we",2440.0,0,false}
			
	};
}


class laminaTabla extends JPanel{
	
	public laminaTabla() {
		
		
		
	}
	
	
}