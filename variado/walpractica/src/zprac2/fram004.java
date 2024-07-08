package zprac2;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class fram004 extends JFrame{

	public fram004() {
		
		setBounds(550,150,500,600);
		
		pan004 ki=new pan004();
		add(ki);
	}
	
}


class pan004 extends JPanel implements Runnable{
	
	public pan004() {
		
		setBounds(5,5,300,300);
		
		mov h=new mov();
		act.addActionListener(h);
		
		add(act);
		
		elk=new Thread(this);
		
	}
	
	
	
	public void paint(Graphics g) {
		
		
		super.paint(g);
		
		//g.fillOval((int) getBounds().getMinX(), 100, 16, 16);
		
		g.fillOval(x-10, y, 10, 10);
		
	}
	
	
	
	
	int x=10;
	int y=50;
	
	
	
	
	Thread elk;
	
	class mov implements ActionListener{
		
		
		
		
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("zzzzzzzzzzzzzzzz");
			elk.start();
			
		}
		
		
		
		
		
	}
	
	
	JButton act=new JButton("mover");

	@Override
	public void run() {
		
		try {
			
			while(true) {
				
				/*
				
				while(x<=getWidth()-12) {
					
					System.out.println(x);
					
					Thread.sleep(20);
					x+=2;
					
					System.out.println("*********************"+getWidth());
					System.out.println("*********************"+getBounds().getMinX());
					
					repaint();
					
					
				}
				
				while(x+15>=0) {
					
					getBounds().getMaxX();
					
					Thread.sleep(20);
					
					x-=2;
					
					repaint();
					
				}
				
				*/
				
				while(x<=this.getBounds().getMaxX()-8) {
					
					//x=(int) this.getBounds().getMinX();
					
					x+=1;
					
					Thread.sleep(10);
					
					
					repaint();
				}
				
				while(x>8) {
					
					//x=(int) this.getBounds().getMinX();
					
					x-=1;
					
					Thread.sleep(10);
					
					repaint();
				}
				
				
				System.out.println("x de pelota "+x+8+" el metodo get width da "+this.getBounds().getMaxX());
				
		
				
				}
			
		} catch (Exception e) {
			System.out.println("falla");
		}
		
	}
}