package losLayouts;

import java.awt.BorderLayout;

import javax.swing.*;


public class DisposicionCaja {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCajax lasca=new MarcoCajax();
		lasca.setVisible(true);
		lasca.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoCajax extends JFrame{
	
	public MarcoCajax() {
		
		setTitle("Disposición Caja");
		setBounds(450,50,400,450);
		
		
		JLabel rotulo1=new JLabel("Nombre");
		JTextField texto1=new JTextField(10);
		
		texto1.setMaximumSize(texto1.getPreferredSize());//metodo para que ese label no se agrande al
														//maximizar la ventana
		Box cajaH1=Box.createHorizontalBox();
		
		cajaH1.add(rotulo1);
		cajaH1.add(Box.createHorizontalStrut(10));//para crear un espacion entre el label y el text
		cajaH1.add(texto1);
		
		JLabel rotulo2=new JLabel("Contraseña");
		JTextField texto2=new JTextField(10);
		
		texto2.setMaximumSize(texto2.getPreferredSize());
		
		Box cajaH2=Box.createHorizontalBox();
		
		cajaH2.add(rotulo2);
		cajaH2.add(Box.createHorizontalStrut(10));
		cajaH2.add(texto2);
		
		texto2.setEnabled(false);
		JButton boton1=new JButton("OK");
		JButton boton2=new JButton("CANCELAR");
		
		Box cajaH3=Box.createHorizontalBox();
		
		cajaH3.add(boton1);
		cajaH3.add(Box.createGlue());
		cajaH3.add(boton2);
		//---------------------********************************************************************
		Box cajaVertical=Box.createVerticalBox();
		
		cajaVertical.add(cajaH1);
		cajaVertical.add(cajaH2);
		cajaVertical.add(cajaH3);
		
		add(cajaVertical,BorderLayout.CENTER);
		
		}
}


