package zprac2;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class fram003 extends JFrame{
	
	public fram003(){
		
		setBounds(600,100,400,500);
		
		pan003 pan=new pan003();
		add(pan);
		
	}
	
	
	

}


class pan003 extends JPanel{
	
	public pan003() {
		
		
		add(ac);
		ve();
		
		accion las=new accion(this,ac);
		ac.addActionListener(las);
	}
	
	JButton ac=new JButton("accion");
	
	int posx=10, posy=100, tw=15,th=15;
	
	
	
	public void ve() {
		
		System.out.println(getBounds().width);
	}
	
	
	
public void paint(Graphics g) {
		
	super.paint(g);
	
	g.fillOval(posx, posy, tw, th);
		
	}




}



class accion implements ActionListener{
	
	Component c;
	JButton bot;
	
	public accion(Component c, JButton bot) {
		
		this.c=c;
		this.bot=bot;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		System.out.println("weeeeeeee");
	
		
	}
	
	
	
	
}



class laPelota{
	
	
	
	public laPelota(JPanel el, JButton ac) {
		
		this.el=el;
		this.ac=ac;
	}
	
	
	
	
	
	
	
	JPanel el;
	JButton ac;
}