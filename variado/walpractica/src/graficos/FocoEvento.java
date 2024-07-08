package graficos;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FocoEvento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoFoco elfoco=new MarcoFoco();
		elfoco.setVisible(true);
		elfoco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoFoco extends JFrame{
	public MarcoFoco() {
		setBounds(500,100,500,300);
		setTitle("Evento Foco");
		
		LaminaFoco estefoco=new LaminaFoco();
	    add(estefoco);
	//add(new LaminaFoco() );
		}
			
}

class LaminaFoco extends JPanel{
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		setLayout(null);
		cuadro1=new JTextField();
		cuadro2=new JTextField();
		
		cuadro1.setBounds(120	, 10, 150, 20);
		cuadro2.setBounds(120	, 50, 150, 20);
		
		add(cuadro1);
		add(cuadro2);
		
		LanzaFocos thefoco=new LanzaFocos();
		cuadro1.addFocusListener(thefoco);
	}
	private class LanzaFocos implements FocusListener{

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// TODO Auto-generated method stub
			System.out.println("ha perdido el foco");
			
			String email=cuadro1.getText();
			boolean valorv=false;
			for(int i=0;i<email.length();i++){
				
				if(email.charAt(i)=='@') {
					
					valorv=true;
				}
		
			}
			if(valorv) {
				System.out.println("correo valido");
			}else {
				System.out.println("correo no valido");
			}
		}
		
	}
	
	JTextField cuadro1;
	JTextField cuadro2;
}

