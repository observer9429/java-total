package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;
//especificamos el paquete para que no haya conflicto en el timer mitemporizador

import java.awt.Toolkit;
import java.awt.event.*;

import java.util.*;

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente=new DameLaHora();

		Timer mitemporizador=new Timer(5000,oyente);
		
		mitemporizador.restart();
		//JOptionPane.showInputDialog("wee");
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
		
		
		
		System.exit(0);
	}

}

class DameLaHora implements ActionListener{
	public void  actionPerformed(ActionEvent e) {
		
		Date ahora=new Date();
		
		System.out.println("te pongo la hora cada 5 segundos "+ahora);
		Toolkit.getDefaultToolkit().beep();
	}
	
}
