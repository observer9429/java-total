package losLayouts;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventoDocumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoPrueba abre=new MarcoPrueba();
		abre.setVisible(true);
		abre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoPrueba extends JFrame{
	
	public MarcoPrueba() {
		setTitle("campo texto");
		setBounds(400,40,400,250);
		
		LaminaPrueba milamina=new LaminaPrueba();
		add(milamina);
	}
	
}

class LaminaPrueba extends JPanel{
	
	public LaminaPrueba() {
		
		JTextField micampo=new JTextField(20);
		
		EscuchaTexto el_evento=new EscuchaTexto();
		
		Document midoc=micampo.getDocument();
		midoc.addDocumentListener(el_evento);
		
		add(micampo);
		
	}
	
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("has insertado texto");
		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("has eliminado texto");
		}
		
	}
}