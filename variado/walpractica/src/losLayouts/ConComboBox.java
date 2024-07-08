package losLayouts;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class ConComboBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MarcoBox elwe=new MarcoBox();
		elwe.setVisible(true);
		elwe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

}


class MarcoBox extends JFrame{
	
	public MarcoBox() {
		
		setTitle("radio boton");
		setBounds(500,100,450,300);
		
		LaminaBox lambox=new LaminaBox();
		add(lambox);
	}
	
}


class LaminaBox extends JPanel{
	
	public LaminaBox() {
		
		setLayout(new BorderLayout());
		
		textoc=new JLabel("Te la creiste pe we");
		
		textoc.setFont(new Font("Serif",Font.PLAIN,18));
		add(textoc,BorderLayout.CENTER);
		
		JPanel lamina_norte=new  JPanel();
		
		micombo=new JComboBox();
		
		micombo.setEditable(true);
		
		micombo.addItem("Serif");
		micombo.addItem("SansSerif");
		micombo.addItem("Monospaced");
		micombo.addItem("Dialog");
		
		lamina_norte.add(micombo);
		add(lamina_norte, BorderLayout.NORTH);
		
		Evento_combo elwes=new Evento_combo();
		micombo.addActionListener(elwes);
	}
	
	
	private class Evento_combo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			textoc.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,18));
			
		}
		
		
		
	}
	private JLabel textoc;
	private JComboBox micombo;
	
}