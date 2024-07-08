package losLayouts;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PruebaTexto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoTexto elmarco=new MarcoTexto();
		elmarco.setVisible(true);
		elmarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoTexto extends JFrame{
	public MarcoTexto() {
		setTitle("marcotexto");
		setBounds(400,50,400,250);
		
		LaminaTexto laminax=new LaminaTexto();
		add(laminax);
	}
	
}

class LaminaTexto extends JPanel {
	
	private JTextField campo1;
	private JLabel resultado;
	public LaminaTexto() {
		
		setLayout(new BorderLayout());
		JPanel milamina2=new JPanel();
		milamina2.setLayout(new FlowLayout());
		
		resultado=new JLabel("",JLabel.CENTER);// pordefecto salía al oeste , ya que ese sitio estaba vacio
		JLabel lab1=new JLabel("Email: ",10);
		milamina2.add(lab1);
		 campo1=new JTextField("Chalo",10);// TAMBIEN SE PUEDE DEFINIR EL TEXTO CON EL SET..TEXT
		//campo1.setText("WEE");
		 milamina2.add(campo1);// SI QUERES IMPRIMIR SIN ESPACION DEL TEXT FIELD SE PONE .trim
		
		add(resultado,BorderLayout.CENTER);
		JButton enviar=new JButton("comprobar");
		
		
		DameTexto mievento=new DameTexto();
		
		
		enviar.addActionListener(mievento);
		milamina2.add(enviar);
		
		add(milamina2, BorderLayout.NORTH);
		
	}
	
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int   correcto=0;
			String  email=campo1.getText().trim();//metodo para elliminar los posibles espacion en blanco del inicio
			
			for(int i=0;i<email.length();i++) {
				
				if(email.charAt(i)=='@') {
					correcto++;
					
				}
				
			}
			
			if(correcto!=1) {
				resultado.setText("EMAIL INCORRECTO");
			}else {
				resultado.setText("EMAIL VÁLIDO");
			}
		}
		
	}

			
	
}

