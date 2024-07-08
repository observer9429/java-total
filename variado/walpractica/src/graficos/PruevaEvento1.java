package graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PruevaEvento1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			marcoTotal02 estees=new marcoTotal02();
			estees.setVisible(true);
			estees.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class marcoTotal02 extends JFrame{
	marcoTotal02(){
		Toolkit mipantalla2=Toolkit.getDefaultToolkit();// devuelve el sistema nativo de ventana
		Dimension tamanoPantalla=mipantalla2.getScreenSize();
		
		int alturaPantalla1=tamanoPantalla.height;
		int anchoPantalla1=tamanoPantalla.width;
		
		setBounds(anchoPantalla1/4,alturaPantalla1/4,anchoPantalla1/2,alturaPantalla1/2);
		//setSize(anchoPantalla/2,alturaPantalla/2);
		setTitle("eventos");
			
		LaminaBotones01 milamina1=new LaminaBotones01();
		
		add(milamina1);
				
	}
	
	
}

class LaminaBotones01 extends JPanel implements ActionListener{
	JButton botonAzul=new JButton("azul");
	JButton botonAmarillo=new JButton("amarillo");
	JButton botonRojo=new JButton("rojo");
	
	public LaminaBotones01(){
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		//objetofuente/la accion/ y el this de abajo es el objeto oyente, el cual es este mismo
		botonAzul.addActionListener(this);//el operador this hace referenciar al objeto donde nos encontramos
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		Object botonPulsado=e.getSource();  //aqui el getsource sirvio para captar el evento y luego compararlo
		
		if(e.getSource()==botonAzul) { // funciona igual comparando defeente
		//if(botonPulsado==botonAzul) {       //para ver quien mandaba la accion, identifica el objeto fuente
		
						
		setBackground(Color.BLUE);
		}
		else if(botonPulsado==botonAmarillo) {
			setBackground(Color.YELLOW);
			
						
			
			
		}
		else {
			setBackground(Color.RED);
		}
	}
	
	
}