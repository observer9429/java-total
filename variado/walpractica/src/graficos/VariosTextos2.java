package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VariosTextos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoTextos20 zz=new MarcoTextos20();
		zz.setVisible(true);
		zz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTextos20 extends JFrame{
	
	public MarcoTextos20() {
		
		
		setTitle("Área de texto");
		setBounds(500,100,400,410);
		//creamos el layout en el mismo FRAME
		
		setLayout(new BorderLayout());
		
		LaminaBotones=new JPanel();
		
		botonInsertar=new JButton("insertar");
		
		
		botonInsertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				areatexto.append("te la creiste we...");
			}
			
		});
		
		
		LaminaBotones.add(botonInsertar);
		
		botonSaltoLinea=new JButton ("salto línea");
		
		botonSaltoLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				boolean saltar=!areatexto.getLineWrap();
				
				areatexto.setLineWrap(saltar);
				
				if(saltar) {
					botonSaltoLinea.setText("QUITAR SALTO");
				}else{
					botonSaltoLinea.setText("PONER SALTO");
				}
				//el codigo de abajo funciona como el if y else de arriba,, se parece a como EXCEL
				//botonSaltoLinea.setText(saltar ? "quitar salto"  :"poner salto");
			}
			
			
		});
		
		LaminaBotones.add(botonSaltoLinea);
		add(LaminaBotones, BorderLayout.SOUTH);
		
		areatexto=new JTextArea(8,20);
		laminascroll=new JScrollPane(areatexto);
		add(laminascroll, BorderLayout.CENTER);
	}
	
	private JPanel LaminaBotones;
	private JButton botonInsertar, botonSaltoLinea;
	private JTextArea areatexto;
	private JScrollPane laminascroll;
}
