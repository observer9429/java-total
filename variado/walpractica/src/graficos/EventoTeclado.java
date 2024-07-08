package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventoTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTeclas mimarco=new MarcoConTeclas();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas() {
		
		setBounds(700,300,250,240);
		setTitle("eventos con teclado");
		
		EventoDeTeclado accion=new EventoDeTeclado();
		
		addKeyListener( accion);
	}
	
	
}

class EventoDeTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {
		
		int codigo=e.getKeyCode();
		System.out.println("la letra presioanda es "+e.getKeyChar()+" y su codigo es " +codigo);
		
		if(e.getKeyChar()=='w'){
			
			System.out.println("che, acertaste");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}