package graficos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EventoRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JavaRaton elevento=new JavaRaton();
		elevento.setVisible(true);
		elevento.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class JavaRaton extends JFrame{
	
	public JavaRaton() {
		
		setBounds(700,300,250,240);
		setTitle("eventos de raton");
		
		EventoDeRaton accion=new EventoDeRaton();
		addMouseListener(accion);
		
	}
	
}

class EventoDeRaton implements MouseListener{// tambien puedes heredar de la clase MouseAdapter , y ya no tener
	// tantos metodos

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("has hecho click");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("el puntero ha entrado al frame");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("el puntero ha salido del frame");
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
		
		
	}
	
	
}