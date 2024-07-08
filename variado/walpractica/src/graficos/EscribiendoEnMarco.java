package graficos;

import javax.swing.*;
import java.awt.*;


public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConTexto mimarco=new MarcoConTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		
		setSize(600,450);
		setLocation(400,200);
		setTitle("primer texto");
		
		setVisible(true);
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Image miIcono=mipantalla.getImage("miniwolf01.png");
		setIconImage(miIcono);
		
		Lamina milamina=new Lamina();
		add(milamina);
		
	}
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);//es apra que haga su funcion y ademas llame a nuestro objeto
		g.drawString("ESTAMOS APRENDIENDO SWING", 100, 100);// el 100,100 hace referencia al frame o panel
	
	}
	
}
