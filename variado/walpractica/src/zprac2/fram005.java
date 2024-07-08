package zprac2;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fram005 extends JFrame{

public fram005() {
		
		setBounds(550,150,400,500);
		
		pan005 ki=new pan005();
		add(ki);
	}
	
}


class pan005 extends JPanel implements Runnable{
	
	public pan005() {
		
		setBounds(5,5,300,300);
		
		mov h=new mov();
		act.addActionListener(h);
		
		add(act);
		
		elk=new Thread(this);
		
	}
	
	
	
	public void paint(Graphics g) {
		
		
		super.paint(g);
		
		//g.fillOval((int) getBounds().getMinX(), 100, 16, 16);
		
		g.fillOval(posx-10, posy, tamx	, tamy);
		
	}
	
	
	final int tamx=20;
	final int tamy=20;
	
	int posx=10;
	int posy=50;
	
	int vx=1;
	int vy=1;
	
	
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
				
				
				if(posx+10<=this.getHeight()) {
					
					
					
					
					
					repaint();
					
					Thread.sleep(20);
					posx+=vx;
					
				}
				if(posx+10>this.getHeight()) {
					
                    repaint();
					
					Thread.sleep(20);
					posx-=vx;
				}
				
				
				
				
				
				
				System.out.println("x de pelota "+posx+8+" el metodo get width da "+this.getBounds().getMaxX());
				
		
				
				}
			
		} catch (Exception e) {
			System.out.println("falla");
		}
		
	}
}
