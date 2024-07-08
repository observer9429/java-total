package losLayouts;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ConCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCheck nuevo=new MarcoCheck();
		nuevo.setVisible(true);
		nuevo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoCheck extends JFrame{
	
	public MarcoCheck() {
		
		setTitle("con botones check box");
		setBounds(400,40,500,400);
		
		LaminaCheck elwe=new LaminaCheck();
		add(elwe);
		
	}
	
}

class LaminaCheck extends JPanel{
	
	public LaminaCheck() {
		
		setLayout(new BorderLayout());
		
		Font miletra=new Font("Serif",Font.PLAIN,24);
		texto=new JLabel("El conde de montecristo");
		
		texto.setFont(miletra);
		
		JPanel laminatexto=new JPanel();
		laminatexto.add(texto);
		
		add(laminatexto, BorderLayout.CENTER);
		
		check1=new JCheckBox("Negrita");
		check2=new JCheckBox("Cursiva");
		
		check1.addActionListener(new ManejaChecks());
		check2.addActionListener(new ManejaChecks());
		
		JPanel lamina002=new JPanel();
		
		lamina002.add(check1);
		lamina002.add(check2);
		
		add(lamina002, BorderLayout.SOUTH);
	}
	
	private class ManejaChecks implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			int tipo=0;
			
			if(check1.isSelected()) tipo+=Font.BOLD;//tipo+=(la cantidad en la que queremos se incremente)
			if(check2.isSelected()) tipo+=Font.ITALIC;
			
			texto.setFont(new  Font ("Serif",tipo,24));
			
			System.out.println(tipo);
			
		}
		
	}
	private  JLabel texto;
	private JCheckBox check1,check2;
}