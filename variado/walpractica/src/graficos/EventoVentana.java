package graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventoVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoTotal3 muestra3=new marcoTotal3();
		muestra3.setVisible(true);
		
		muestra3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//hideonclose es cuando hay varias ventanas

		marcoTotal3 muestra4=new marcoTotal3();
        muestra4.setVisible(true);
		muestra4.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		muestra3.setTitle("marco 3");
		muestra3.setBounds(300	, 300, 500, 350);
		
		muestra4.setTitle("marco 4");
		muestra4.setBounds(800	, 300, 500, 350);
		
	}

}

class marcoTotal3 extends JFrame{
	marcoTotal3(){
							
		//setTitle("lunes de formularios");
		
		M_Ventana oyente_ventana=new M_Ventana();
		addWindowListener(oyente_ventana);
										
	}
		
}

class M_Ventana implements WindowListener{
		
		public void windowActivated(WindowEvent e) {
		System.out.println("ventana activada");
	}
	
	public void windowClosed(WindowEvent e) {
		System.out.println("una ventana se ha  cerrado");
	}

		public void windowClosing(WindowEvent e) {
		System.out.println("cerrando ventana");
	}

		public void windowDeactivated(WindowEvent e) {
		System.out.println("ventana desactivada");
	}

		public void windowDeiconified(WindowEvent e) {
		System.out.println("ventana restaurada");
	}

		public void windowIconified(WindowEvent e) {
		System.out.println("ventana minimizada");
		
	}

	public void windowOpened(WindowEvent e) {
		System.out.println("ventana abierta");}
	
	
	
}

