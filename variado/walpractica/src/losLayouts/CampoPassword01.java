package losLayouts;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
public class CampoPassword01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPassword elpas=new MarcoPassword();
		elpas.setVisible(true);
		elpas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoPassword extends JFrame{

	public MarcoPassword() {
		
		setTitle("Usarios");
		setBounds(300,30,450,300);
		
		LaminaPassword wepas=new LaminaPassword();
		add(wepas);
		
	}
}

class LaminaPassword extends JPanel{
	
	public LaminaPassword() {
		
		setLayout(new BorderLayout());
		
		
		
		JPanel lamina_superior=new JPanel();
		lamina_superior.setLayout(new  GridLayout(2,2));
		add(lamina_superior,BorderLayout.NORTH);
		
		JLabel etiqueta1=new JLabel("Usuario");
		JLabel etiqueta2=new JLabel("Contraseña");
		
		JTextField c_usuario=new JTextField(15);
		 c_contra=new JPasswordField(15);
		
		 //instanciamos y hacemos el llamado al evento
		 Comprueba_pass eselevento=new Comprueba_pass();
		 // creamos un obejto document o algo asi, y ese objeto es la fuente de la accion
		 Document mi_clave=c_contra.getDocument();
		 mi_clave.addDocumentListener(eselevento);
		 
		 
		lamina_superior.add(etiqueta1);
		lamina_superior.add(c_usuario);
		lamina_superior.add(etiqueta2);
		lamina_superior.add(c_contra);
		
		JButton verificar=new JButton("Verificar");
		add(verificar,BorderLayout.SOUTH);
		
	}
	
	private class Comprueba_pass implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			char [] contrasena;
			contrasena=c_contra.getPassword();
			
			if(contrasena.length<8 ||  contrasena.length>12) {
				c_contra.setBackground(Color.RED);
				
			}else {
				c_contra.setBackground(Color.WHITE);
			}
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	JPasswordField c_contra;
}