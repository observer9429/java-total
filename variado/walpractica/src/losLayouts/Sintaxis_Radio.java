package losLayouts;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooser;

public class Sintaxis_Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoRadio weboton=new MarcoRadio();
		weboton.setVisible(true);
		weboton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

class MarcoRadio extends JFrame{
	
	public MarcoRadio() {
		
		setTitle("radio boton");
		setBounds(500,100,450,300);
		
		LaminaRadio laminex=new LaminaRadio();
		add(laminex);
	}
	
}


class LaminaRadio extends JPanel{
	
	public LaminaRadio() {
		
		setLayout(new BorderLayout());
		
		JDateChooser lafecha=new JDateChooser();
		
		add(lafecha,BorderLayout.NORTH);
		
		JLocaleChooser ciudad=new JLocaleChooser();
		
		add(ciudad,BorderLayout.EAST);
		
		texto=new JLabel("Te la creiste we..");
		add(texto,BorderLayout.CENTER);
			
		
		ButtonGroup migrupo=new ButtonGroup();
		
		boton1 =new JRadioButton("Pequeño",false);
		boton2 =new JRadioButton("Mediano",true);
		boton3 =new JRadioButton("Grande",false);
		boton4 =new JRadioButton("Muy grande",false);
		
		
		JPanel lamradio=new JPanel();
		
		EventoRadio accionwe=new EventoRadio();
		
		boton1.addActionListener(accionwe);
		boton2.addActionListener(accionwe);
		boton3.addActionListener(accionwe);
		boton4.addActionListener(accionwe);
		
		migrupo.add(boton1);
		migrupo.add(boton2);
		migrupo.add(boton3);
		migrupo.add(boton4);
		
		lamradio.add(boton1);
		lamradio.add(boton2);
		lamradio.add(boton3);
		lamradio.add(boton4);
		
		add(lamradio,BorderLayout.SOUTH);
	}
	
	private class EventoRadio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			
			
			if(e.getSource()==boton1) {
				texto.setFont(new Font("Serif", Font.PLAIN,10));
			}
			else if(e.getSource()==boton2) {
				texto.setFont(new Font("Serif", Font.PLAIN,12));
				
			}
			else if(e.getSource()==boton3) {
				texto.setFont(new Font("Serif", Font.PLAIN,18));
			}
			else if(e.getSource()==boton4) {
				texto.setFont(new Font("Serif", Font.PLAIN,24));
			}
			
		}
		
	}
	
	private JLabel texto;
	private JRadioButton boton1,boton2,boton3,boton4;
}