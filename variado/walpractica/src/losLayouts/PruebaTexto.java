package losLayouts;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTexto11 elmarco=new MarcoTexto11();
		elmarco.setVisible(true);
		elmarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto11 extends JFrame{
	public MarcoTexto11() {
		setTitle("marcotexto");
		setBounds(400,50,400,250);
		
		LaminaTexto11 laminax=new LaminaTexto11();
		add(laminax);
	}
	
}

class LaminaTexto11 extends JPanel implements ActionListener{
	
	JTextField campo11;
	public LaminaTexto11() {
		
		
		 campo11=new JTextField("Chalo",10);// TAMBIEN SE PUEDE DEFINIR EL TEXTO CON EL SET..TEXT
		//campo1.setText("WEE");
		add(campo11);// SI QUERES IMPRIMIR SIN ESPACION DEL TEXT FIELD SE PONE .trim
		
		JButton enviar=new JButton("imprimir");
		add(enviar,new FlowLayout(FlowLayout.RIGHT));
		
		enviar.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(campo11.getText());
		
		
	}
	
	
	
}
