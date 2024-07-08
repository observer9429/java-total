package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class VentanaFocus extends JFrame implements WindowFocusListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaFocus accionpe=new VentanaFocus();
		accionpe.iniciar();

	}
	
	public void iniciar() {
		marco1=new VentanaFocus();
		marco2=new VentanaFocus();
		
	   marco1.setVisible(true);
	   marco2.setVisible(true);
	   
	   marco1.setBounds(300, 100, 400, 350);
	   marco2.setBounds(800, 100, 400, 350);
	   
	   marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	   marco1.addWindowFocusListener(this);
	   marco2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==marco1) {
			marco1.setTitle("TENGO EL FOCO PE MANO");
		}
		else {
			marco2.setTitle("TENGO EL FOCO");
		}
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==marco1) {//el getsource sirvio para identificar el objeto fuente, que marco gana el foco
			marco1.setTitle("");
		}
		else {
			marco2.setTitle("");
		
		
	}

	}
	VentanaFocus marco1;
	VentanaFocus marco2;
}
