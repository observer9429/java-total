package otro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class EventoTeclado {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MarcoConTeclas mimarco=new MarcoConTeclas();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true) {
			
			mimarco.repaint();
			Thread.sleep(10);
		}
	}

}


class MarcoConTeclas extends JFrame{
	
	EventoDeTeclado raqueta=new EventoDeTeclado(this);
	
	public MarcoConTeclas() {
		
		setBounds(700,300,250,240);
		setTitle("eventos con teclado");
		
		EventoDeTeclado accion=new EventoDeTeclado(this);
		
		addKeyListener( accion);
	}
	
	
	
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		raqueta.paint(g2d);
		

		
	}
	
	
}

class EventoDeTeclado implements KeyListener{

	
	
	
	public EventoDeTeclado(MarcoConTeclas marco) {
		this.marco = marco;
	}


	private MarcoConTeclas marco;
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		int codigo=e.getKeyCode();
		System.out.println("la letra presioanda es "+e.getKeyChar()+" y su codigo es " +codigo);
		
		if(e.getKeyChar()==KeyEvent.VK_KP_DOWN){
			
			y--;
			
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
	
	public void paint(Graphics2D g) {
		g.fillRect(x, y, WIDTH, HEIGHT);
	}
	
	
	int x=0;
	int y=50;
	int WIDTH =20;
	int HEIGHT=60;
}