package graficos;

import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;



public class MultiplesFuentes1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoAccion marcov=new MarcoAccion();
		marcov.setVisible(true);
		marcov.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoAccion extends JFrame{
	
	public MarcoAccion() {
		
		setBounds(600,100,400,200);
		setTitle("multiples fuentes 1");
		
		PanelAccion laminav=new PanelAccion();
		add(laminav);
		
	}
	
}

class PanelAccion extends JPanel{
	public PanelAccion() {
		
		AccionColor accionNegro=new AccionColor("Negro",new ImageIcon ("src/graficos/negro.png"),Color.BLACK);
		AccionColor accionVerde=new AccionColor("Verde",new ImageIcon ("src/graficos/verde.jpg"),Color.GREEN);
		
		//JButton botonNegro=new JButton(accionNegro);
		//add(botonNegro);   la linea de abajo simplifica estas dos lineas
		
		add(new JButton (accionNegro));
		add(new JButton(accionVerde));
		/*
		JButton botonNegro=new JButton("negro");
		JButton botonVerde=new JButton("verde");
		add(botonNegro);
		add(botonVerde);
		*/
		
		InputMap mapaEntrada=getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		KeyStroke teclaNegro=KeyStroke.getKeyStroke("ctrl N");
		KeyStroke teclaVerde=KeyStroke.getKeyStroke("ctrl V");
		
		mapaEntrada.put(teclaNegro,"fondo_negro");
		mapaEntrada.put(teclaVerde,"fondo_verde");
		
		ActionMap mapaAccion=getActionMap();
		
		mapaAccion.put("fondo_negro", accionNegro);
		mapaAccion.put("fondo_verde", accionVerde);
		
	}
	private class AccionColor extends AbstractAction{//se podia usar la interfaz Action, pero se tenia que poenr los 6 met.
		
		public AccionColor(String nombre,Icon icono,Color color_boton) {
			putValue(Action.NAME,nombre);
			putValue(Action.SMALL_ICON,icono);
			putValue(Action.SHORT_DESCRIPTION,"Poner la lamina de color "+nombre);
			putValue("color_de_fondo",color_boton);
			
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Color c=(Color)getValue("color_de_fondo");
			setBackground(c);
			
		}
		
	}
	
}

