package losLayouts;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layout001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marco_Layout wee=new Marco_Layout();
		wee.setVisible(true);
		wee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco_Layout extends JFrame{
	
	
	public Marco_Layout() {
		setTitle("eplo FlowLayout");
		setBounds(500,10,600,350);
		
		Panel_Layout lamina001=new Panel_Layout();
		add(lamina001);
		/*
		FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT,20,20);// para separar los botones de X y de Y
		lamina001.setLayout(disposicion);*/  // este codigo lo hemos puesto abajo
		
	}
	
}

class Panel_Layout extends JPanel {
	
	public Panel_Layout() {
		
		FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT,20,20);// para separar los botones de X y de Y
		setLayout(disposicion);// estas dos lineas son iguales a las de arriba
		
		JButton Border=new JButton("BorderLayout");
		JButton Greed=new JButton("GreedLayout");
		
		add(Border);
		add(Greed);
		
		oyente accionBorder=new oyente();
		Border.addActionListener(accionBorder);
		
		
	}
	
	class oyente implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			equipos losbordes=new equipos();
			losbordes.setVisible(true);
			
		}
	}
	
	
}


class equipos extends JFrame{
	public equipos() {
		setTitle("BorderLayout");
		setBounds(10,350,400,300);
		
		laminaBorder labo=new laminaBorder();// decimos a las laminas que disposicion van a tener para que 
		add(labo, BorderLayout.NORTH);                           //no machaque una a la otra
		
		laminaBorder2 labo2=new laminaBorder2();
		add(labo2, BorderLayout.SOUTH);
	}
		
}


class laminaBorder extends JPanel{
	public laminaBorder() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT));// pasamos parametros al constructor
		
		JButton cienciano=new JButton("Cienciano");
		JButton river=new JButton("River Plate");
		
		
		add(cienciano);
		add(river);
		
		
		// al no poner center, toma por defecto ese valor, y es el espacio sobrant
		
	}
}

class laminaBorder2 extends JPanel{
	
	public laminaBorder2() {
		
		//setLayout(new BorderLayout());
		JButton boca=new JButton("Boca Juniors");
		add(boca,BorderLayout.WEST);
		
		add(new JButton ("Real Madrid"),BorderLayout.EAST);
		add(new JButton ("Newells"));
	}
	
}