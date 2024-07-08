package losLayouts;

import java.awt.Dimension;

import javax.swing.*;


public class AnonimoJspinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoJspinner elwet=new   MarcoJspinner();
		elwet.setVisible(true);
		elwet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoJspinner extends JFrame{
	
	public MarcoJspinner() {
		
		setTitle("radio boton");
		setBounds(500,100,450,300);
		
		LaminaJspinner lamsjpinner=new LaminaJspinner();
		add(lamsjpinner);
	}
	
}


class LaminaJspinner extends JPanel{
	
	public LaminaJspinner() {
		
		//String lista[]= {"cienciano", "newells","sao paulo"};
		
		//JSpinner control=new JSpinner(new SpinnerListModel(lista));
		//JSpinner control=new JSpinner(new MiModeloSpinner());
		//seria crear la sublase interna adentro del constructor para llamar al evento, clase interna anonima
		JSpinner control=new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			//ahora viene la clase interna y anonima, ya que no tiene nombre
			
			public Object getNextValue() {
				return super.getPreviousValue();
			}
			
			public Object getPreviousValue() {
				return super.getNextValue();
				
			}
			
			
		});
		
		
		Dimension d=new Dimension(200,20);
		control.setPreferredSize(d);
		add(control);
		
		//control.ADD(new MiModeloSpinner());
	}
	/*
	private class MiModeloSpinner extends SpinnerNumberModel{
		
		public MiModeloSpinner() {
			
			super(5,0,10,1);
			
		}
		
		//ahi modifica los metodos heredados para alterar su funcion ahora hacen lo contrario, uno suma 1 y otra
		//le resta 1
		
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		
		public Object getPreviousValue() {
			return super.getNextValue();
			
		}
		
	} */
	}
	