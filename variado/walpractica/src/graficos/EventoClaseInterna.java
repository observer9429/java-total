package graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventoClaseInterna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		marcoTotal2 muestra1=new marcoTotal2();
		muestra1.setVisible(true);
		
		muestra1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class marcoTotal2 extends JFrame{
	marcoTotal2(){
		Toolkit mipantalla=Toolkit.getDefaultToolkit();// devuelve el sistema nativo de ventana
		Dimension tamanoPantalla=mipantalla.getScreenSize();
		
		int alturaPantalla=tamanoPantalla.height;
		int anchoPantalla=tamanoPantalla.width;
		
		setBounds(anchoPantalla/4,alturaPantalla/4,anchoPantalla/2,alturaPantalla/2);
		//setSize(anchoPantalla/2,alturaPantalla/2);
		setTitle("eventos");
			
		LaminaBotones2 milamina=new LaminaBotones2();
		
		add(milamina);
		
		
				
	}
	
	
}

class LaminaBotones2 extends JPanel {
	JButton botonAzul=new JButton("azul");
	JButton botonAmarillo=new JButton("amarillo");
	JButton botonRojo=new JButton("rojo");
	//JButton botonW=new JButton("rojo");
	
	
	
	public LaminaBotones2(){
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		
		
		colorFondo Amarillo=new colorFondo(Color.yellow);
		colorFondo Azul=new colorFondo(Color.blue);
		colorFondo Rojo=new colorFondo(Color.red);
		//objetofuente/la accion/ y el this de abajo es el objeto oyente, el cual es este mismo
		botonAzul.addActionListener(Azul);//el operador this hace referenciar al objeto donde nos encontramos
		botonAmarillo.addActionListener(Amarillo);
		botonRojo.addActionListener(Rojo);
		
		
	}
			
	private class colorFondo implements ActionListener{
		
		public colorFondo(Color c) {
			
			colorDeFondo=c;
		}
				
		// despues de implementar el actionlistener, hay que reescribir los metodos abstractos que hereda
		public void actionPerformed(ActionEvent e) {
			//a este metodo se le pasa un objeto, el cual es Azul, Amarillo, Rojo
			setBackground(colorDeFondo);
			
						
		}
							
		private Color colorDeFondo;
		
	}
}


