package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reloj mireloj=new Reloj(3000,true);
		mireloj.enMarcha();
		JOptionPane.showMessageDialog(null, "pulse aceptar para terminar");
		System.exit(0);
		

	}

}


class Reloj{
	public Reloj(int intervalo , boolean sonido) {
		this.intervalo=intervalo;
		this.sonido=sonido;
		
	}
	
	public void enMarcha() {
		ActionListener oyente=new DameLaHora2();
		Timer mitemporizador=new  Timer(intervalo,oyente);
		mitemporizador.start();
	}
	
	private class DameLaHora2 implements ActionListener{// esta subclase se puede poner adentro de un metodo
		//sacandole el modificador de acceso
		
		public void actionPerformed(ActionEvent  evento) {
			
			Date ahora=new  Date();
			System.out.println("te pongo la hora cada 3 segundos "+ahora);
			if(sonido) {
				Toolkit.getDefaultToolkit().beep();
			}
		}
		
		
	}
	private int intervalo;
	private boolean sonido;
	
}
