package Calculadora;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoxGrid inuyasha=new MarcoxGrid();
		inuyasha.setVisible(true);
		inuyasha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoxGrid extends JFrame{
	
	public MarcoxGrid() {
		
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();// devuelve el sistema nativo de ventana
		
		Image miIcono=mipantalla.getImage("miniwolf.png");
		
		
		setIconImage(miIcono);
		setTitle("calculadora Chalo :v");
		setBounds(400,40,300,350);
		
		LaminaxGrid verex=new LaminaxGrid();
		add(verex);
		
		
	}
	
	
	
	
	
}

class LaminaxGrid extends JPanel{
	
	public LaminaxGrid() {
		
		principio=true;
		
		setLayout(new BorderLayout());
		
	    pantalla=new JLabel("0");
		add(pantalla,BorderLayout.NORTH);
		
		
		 los9=new JPanel();
		 
		 los9.setLayout(new GridLayout(4,4));
		 
		 ActionListener insertar=new InsertaNumero();//digamos que es una instancia combinada de action e
		                                             // InsertaNumero. Action pa la accion
		 
		 ActionListener orden=new AccionOrden();
		 
		 ponerBoton("7",insertar);
		 ponerBoton("8",insertar);
		 ponerBoton("9",insertar);
		 
		 ponerBoton("/",orden);
		 
		 ponerBoton("4",insertar);
		 ponerBoton("5",insertar);
		 ponerBoton("6",insertar);
		 
		 ponerBoton("*",orden);
		 
		 ponerBoton("1",insertar);
		 ponerBoton("2",insertar);
		 ponerBoton("3",insertar);
		 
		 ponerBoton("-",orden);
		 ponerBoton("0",insertar);
		 
		 ponerBoton(".",insertar);
		 ponerBoton("=",orden);
		 ponerBoton("+",orden);
		 
		 add(los9,BorderLayout.CENTER);
		 
		
		 ultimaOperacion="=";// la claaaaaaaave
		
		
	}
	
		public void ponerBoton(String posic, ActionListener oyente) {
		
		JButton boton=new JButton(posic);
		
		boton.addActionListener(oyente);//hacemois que todos los botones esten a la escucha
		
		los9.add(boton);
					
			
		}
	//----------------------------------------------------------------------
	
	private class InsertaNumero implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String entrada=e.getActionCommand();//devuelve el string asociado a esa accion
			
			
			
			if(principio) {
				pantalla.setText("");
				
				principio=false;
			}
			
			pantalla.setText(pantalla.getText()+entrada);
		}
		
	}
		
		
	private class  AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String  operacion=e.getActionCommand();//obtiene el string del boton
			
		
			
			calcular(Double.parseDouble(pantalla.getText()));
			
			ultimaOperacion=operacion;
			
			principio=true;// pone la pantalla en blanco
							
		}
		
		public void calcular(double x) {
			
			if(ultimaOperacion.contentEquals("+")) {
				
				resultado+=x;//resultado sin iniciar vale cero, se le aumenta lo de x
				
				//System.out.println(resultado);
			}
			else if(ultimaOperacion.contentEquals("-")) {
				resultado-=x;
			}
			//---
			else if(ultimaOperacion.contentEquals("*")) {
				resultado*=x;
			}
			else if(ultimaOperacion.contentEquals("/")) {
				resultado/=x;
			}
			else if(ultimaOperacion.contentEquals("=")) {
				
				//System.out.println("entro aca primero");
				resultado=x;
			}
			
			pantalla.setText(""+resultado);
			
			//System.out.println("ahora cambio a"+ultimaOperacion);
		}
		
	}
		
	

	
	JPanel los9;
	//JButton winu;
	JLabel pantalla;
	boolean principio;//si no se inicia el boolean es false
	double resultado;
	String ultimaOperacion;
}