package otro;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import elementos.Game;
import elementos.Sound;

public class Inicio extends JPanel{
	
	Raqueta raqueta=new Raqueta(this);
	
	
	 int speed =1;
	 
	 
	 public Inicio() {
			addKeyListener(new KeyListener() {
				@Override
				public void keyTyped(KeyEvent e) {
				}

				@Override
				public void keyReleased(KeyEvent e) {
					//raqueta.keyReleased(e);
				}

				@Override
				public void keyPressed(KeyEvent e) {
					raqueta.keyPressed(e);
				}
			});
			setFocusable(true);
//			Sound.BACK.loop();
		}
	 
	 private void move() {
			raqueta.move();
			
		}
	 
	 public void paint(Graphics g) {
			super.paint(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
					RenderingHints.VALUE_ANTIALIAS_ON);
			raqueta.paint(g2d);
			

			g2d.setColor(Color.GRAY);
			
			
		}

	 public static void main(String[] args) throws InterruptedException {
			JFrame frame = new JFrame("wee Tennis");
			Inicio ee = new Inicio();
			frame.add(ee);
			frame.setSize(300, 400);
			frame.setVisible(true);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			while (true) {
				ee.move();
				ee.repaint();
				Thread.sleep(10);
			}
		}

}
