import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel{
	
	
	int x = 0;
	int y = 0;
	
	int xa = 1;
	int ya = 1;

	private void moveBall() {
		if (x + xa < 0)
			xa = 1;
		if (x + xa > getWidth() - 30)
			xa = -1;
		if (y + ya < 0)
			ya = 1;
		if (y + ya > getHeight() - 30)
			ya = -1;
		
		x = x + xa;
		y = y + ya;
       
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);//esta instruccion es como si limara a la bola, mejor imagen
		g2d.fillOval(x, y, 30, 30);
		
		
	}
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame marco=new JFrame("MiniTenis");
		
		Game game = new Game();
		
		marco.add(game);
		
		//marco.setBounds(350, 350, 300, 300);
		marco.setSize(300, 300);
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		while (true) {
			try {
			game.moveBall();
			game.repaint();//este metodo llama a paint
			
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
