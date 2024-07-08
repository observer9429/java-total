package zprac2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class fram1 extends JFrame{

	public fram1() {
		
		setBounds(550,200,500,400);
		
		pan1 p=new pan1();
		add(p);
	}


}

 class pan1 extends JPanel {
	
	// Graphics ee;
	 
	public pan1() {
		
		
		laAccion se=new laAccion();
		ac.addActionListener(se);
		
		
		add(ac);
		
		
		
		
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		int an=15;
		int al=15;
		
		int posx=15;
		int posy=50;
		
	
		
		g.setColor(Color.cyan);
		g.fillRect(10, 10, 100, 100);
		//g.drawRect(10, 10, 100, 100);
		
		
		//g.setColor(Color.red);
	
		
		for(int xs=0;xs<this.getWidth()/2;xs+=10) {
			
			
			
			double z1,z2,z3;
			
			z1=Math.random()*100;	
			z2=Math.random()*100;	
			z3=Math.random()*100;	
			
			int i1,i2,i3;
			
			i1=(int)z1;
			i2=(int)z2;
			i3=(int)z3;
			
			Color elc=new Color(i1,i2,i3);
			
			//g.fillRect(0, 0, getWidth(), getHeight());
			
			g.setColor(elc.brighter().brighter());
			
			g.fillOval(xs, posy, an, al);
			
			
			posy+=5;
			repaint();
			
			System.out.println("valor de x es."+xs
					+" y de Y es: "+posy+"valor maximo de x es "+getBounds().getMaxX());
			
			
			
		
		try {
			Thread.sleep(4);
			
			
			
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}
		
		
		/*
		for(int u=0;u<this.getBounds().width;u+=5) {
			
			g.drawOval(10, u, 40, 40);
			
		}
		*/
			
			
		}
		
	
	


	JButton ac=new JButton("accion");
	
	
	class laAccion implements ActionListener{
		
		
		
		public laAccion() {
			
			
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			
			
			System.out.println("algo");
			
			
			
			
		}
	}


	
}
