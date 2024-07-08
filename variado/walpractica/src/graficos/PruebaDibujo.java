package graficos;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;



public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoConDibujos mimarco=new MarcoConDibujos();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoConDibujos extends JFrame{
	public MarcoConDibujos() {
		
		setTitle("marco con dibujois");
		setSize(400,400);
		
		LaminaConFiguras milamina=new LaminaConFiguras();
		add(milamina);
		
		Color elcolor=new Color(40,110,159);
		milamina.setBackground(elcolor);
		
	}
	
}

class LaminaConFiguras extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawRect(50,50, 200, 200);
		//g.drawString("ESTAMOS APRENDIENDO SWING", 100, 100);
		//g.drawLine(200, 50, 50, 200);
		//g.drawArc(50, 100, 100, 200, 120, 105);
		Graphics2D g2=(Graphics2D) g;
		Rectangle2D rectangulo=new Rectangle2D.Double(100, 100, 200, 150);
		
		g2.draw(rectangulo);
		g2.setPaint(Color.BLUE);
		
		
		
		g2.fill(rectangulo);
		
		Ellipse2D elipse=new Ellipse2D.Double();
		
		
		elipse.setFrame(rectangulo);
		g2.setPaint(Color.PINK);
		g2.draw(rectangulo);	
		
		g2.setPaint(new Color(180,80,20));//tambien se puede poner el color al instanciar con la clase color
		                                  // y poner el objeto como parametro
		g2.fill(elipse);//el fill es para llenarlo del color que ya se ha establecido lineas antes
		
		g2.draw(elipse);
		
		g2.draw(new Line2D.Double(100, 100,300,250));
		double centroenX=rectangulo.getCenterX();
		double centroenY=rectangulo.getCenterY();
		double radio=150;
		
		Ellipse2D circulo=new Ellipse2D.Double();
		circulo.setFrameFromCenter(centroenX, centroenY, centroenX+radio, centroenY+radio);
		
		
		g2.draw(circulo);
		
		Font mifuente=new Font("Arial",Font.BOLD,25);
		g2.setFont(mifuente);
		g2.setColor(Color.WHITE);
		g2.drawString("Mi gente bella", 100	, 	100);
		
		
	}
	
	
}