package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class EventoVentana2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		elpanel panel=new elpanel();
		
		panel.setVisible(true);
		panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class elpanel extends JFrame{
	
	
	public elpanel() {
		setBounds(400,200,500,300);
		setTitle("clase adapterwindows");
		
		m_adapter lamin=new m_adapter();
		
		addWindowListener(lamin);
	// asi uses la clase adapter, para llamar a la accion se usa el listener
		//addWindowListener(new m_ventana());-----> tambien se puede instanciar asi defrente, ya no se crearia lamin
		
	}

	
}

class m_adapter extends WindowAdapter{
	
	
	public void windowIconified(WindowEvent e) {
		System.out.println("ventana minimizada");
		
	}
}
