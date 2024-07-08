package otro;

import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Raqueta {

	public Raqueta(Inicio inicio) {
		
		this.inicio = inicio;
	}



	private static final int X = 0;
	private static final int WITH = 25;
	private static final int HEIGHT = 100;
	
	private Inicio inicio;
	//////////////////////
	int y=150;
	int velocidady=0;
	
	/////////////////////////////////
	public void paint(Graphics2D g) {
		g.fillRect(X, y, WITH, HEIGHT);
	}
	
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_KP_DOWN)
			velocidady = -inicio.speed;
		if (e.getKeyCode() == KeyEvent.VK_KP_UP)
			velocidady = inicio.speed;
	}
	
	public void move() {
		if (y + velocidady > 0 && y + velocidady < inicio.getHeight() - HEIGHT)
			y = y + velocidady;
	}
}
