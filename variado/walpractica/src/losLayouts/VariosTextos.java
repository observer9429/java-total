package losLayouts;

import javax.swing.*;
import java.awt.event.*;

public class VariosTextos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoTextos1 este1=new MarcoTextos1();
		este1.setVisible(true);
		este1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoTextos1 extends JFrame{
	
	public MarcoTextos1() {
	
		setTitle("Área de texto");
		setBounds(500,100,400,410);
		
		LaminaTextos eplo=new LaminaTextos();
		add(eplo);
		
	}
	
}


class LaminaTextos extends JPanel{
	
	public LaminaTextos() {
		
		 miarea=new JTextArea(8,20);
		
		 //add(miarea);
		 
		 
		JScrollPane laminascroll=new JScrollPane(miarea);
		
		miarea.setLineWrap(true);// para que lo escrito no se desborde
		
		add(laminascroll);
		
		
		
		JButton miboton=new JButton("VERIFICAR");
		add(miboton);
		miboton.addActionListener(new GestionaArea());// pone el boton en espera, e instancia al oyente ahi mismo
		
	}
	
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println(miarea.getText());
		}
		
	}
	
	JTextArea miarea;
	
}