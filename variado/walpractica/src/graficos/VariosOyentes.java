package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VariosOyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Principal emarco=new Marco_Principal();
	    emarco.setVisible(true);
	    emarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		
		
	}

}

class Marco_Principal extends JFrame{
	
	public Marco_Principal() {
		setBounds(800,100,450,200);
		setTitle("multiples oyentes");
		
		Lamina_Principal lamix=new Lamina_Principal();
		add(lamix);
		
		
	}
	
}


class Lamina_Principal extends JPanel{
	
	
	public Lamina_Principal() {
		
		JButton boton_nuevo=new JButton("nuevo");
				
		add(boton_nuevo);
		
				
		boton_cerrar=new JButton("cerrar todo");
		add(boton_cerrar);
		
		OyenteNuevo mioyente=new OyenteNuevo();
		boton_nuevo.addActionListener(mioyente);
	}
	
	
	private class OyenteNuevo implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			Marco_Emergente marco=new Marco_Emergente(boton_cerrar);
			marco.setVisible(true);
		}
		
	}
	JButton boton_cerrar;// creramos la variable afuera, ya que se necesitara usar afuera del constructor
	
}


class Marco_Emergente extends JFrame{
	
	public Marco_Emergente(JButton boton_de_principal) {// aca le pasa por parametros el boton y mas abajo lo detec
		
		contador++;                              //
		setTitle("ventana "+contador);
		setBounds(contador*40,contador*40,300,150);
		
		CierraTodos oyenteCerrar=new CierraTodos();
		boton_de_principal.addActionListener(oyenteCerrar);//detecta el parametro pasado
		
				
	}
	
	private class CierraTodos implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			dispose();
			
			contador=0;
		}
		
	}
	
	
	private static int contador=0;
}