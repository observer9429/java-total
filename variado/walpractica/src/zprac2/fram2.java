package zprac2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class fram2 extends JFrame{
	
	
	public fram2() {
		
		setBounds(500,200,400,500);
		
		pan2 po=new pan2();
		add(po);
		
	}
	

}


class pan2 extends JPanel implements Runnable{
	
	JButton elb=new JButton("accion");
	
	public pan2() {
		
		laac a1=new laac();
		
		elb.addActionListener(a1);
		
		add(elb);
		
		elh=new Thread(this);
		
		
		
		ver();
	}
	
	
	public void paint(Graphics p) {
		
		super.paint(p);
		
			p.fillOval(x, 100, 15, 15);
			
		}
	


	
	
	//***********************************************************	
		
	class laac implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			System.out.println("wee");
			elh.start();
			
			//System.out.println("***********************************+"+x+"*-*-*-*-*---"+getBounds().getWidth());
		}
		
	}
	//*********************************************
	
	//double ss=getBounds().getMaxX();
	
	int x=getWidth();
	Thread elh;
	
	public void ver() {
		
		//System.out.println(x+" el otro es  "+ss);
	}
	

	@Override
	public void run() {
		
		try {
			
			while(true) {
				
				while(x<getWidth()) {
					
					System.out.println(x);
					
					Thread.sleep(20);
					x+=5;
					
					repaint();
					
					
				}
				
				while(x>=0) {
					
					Thread.sleep(20);
					x-=5;
					
					repaint();
					
				}
				
				
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}