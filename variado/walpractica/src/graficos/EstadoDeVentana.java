package graficos;

import java.awt.Color;
import java.awt.Event;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

import javax.swing.*;

public class EstadoDeVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		miMarco marco1=new miMarco();
		
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//hideonclose es cuando hay varias ventanas
	}

}

class miMarco extends JFrame{
	
	
	public miMarco(){
		
		
		
		//setSize(500,300);
		//setLocation(500,300);
		setBounds(500,300,450,250);
		//setResizable(false);
		//setExtendedState(Frame.MAXIMIZED_BOTH);// O SE PUIEDE PONER 6 EN VEZ DE FRAME.MAXI...
		setTitle("Formulario Wolf");
		
		cambiaEstado pes=new cambiaEstado();
		addWindowStateListener(pes);
	}
 }

class cambiaEstado implements WindowStateListener{
	public void windowStateChanged(WindowEvent e) {
		
		System.out.println("ha cambiado el estado de la ventana");
		//System.out.println(e.getNewState());
		if(e.getNewState()==Frame.MAXIMIZED_BOTH) { //Frame.MAXIMIZED_BOTH = 6 , significa pantalla completa
			System.out.println("la ventana ha sido maximizada");
		}
	}
	
}
	
	