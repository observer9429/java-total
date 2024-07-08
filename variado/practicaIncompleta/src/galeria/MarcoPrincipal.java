package galeria;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MarcoPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoFlix galframe=new MarcoFlix();
		galframe.setVisible(true);
		galframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}


class MarcoFlix extends JFrame{
	
	JButton allcerrar;
	
	public MarcoFlix() {
		
		this.setBackground(Color.orange);
		
		Toolkit lapantalla=Toolkit.getDefaultToolkit();
		
		Image elIcono=lapantalla.getImage("spiderman.png");
		
		//Image elIcono=lapantalla.getImage("C:/Users/warez9429/Desktop/eclipsejava/walpractica/miniwolf01.png");
		setIconImage(elIcono);
		
		
	
		setTitle("Películas WalFlix");
	
		setBounds(500,100,550,400);
		setLayout(new BorderLayout());
		
	
		JPanel laminaopciones=new JPanel();
		
		laminaopciones.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		allcerrar=new JButton("Cerrar todo");
		
		laminaopciones.add(allcerrar);
		
		add(laminaopciones,BorderLayout.SOUTH);
		
		
		
		
		laminaFlix mind=new laminaFlix();
		add(mind, BorderLayout.NORTH);
		
		laminaCentro centro=new laminaCentro();
		add(centro, BorderLayout.CENTER);
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponents(g);
		
		g.drawString("WEEEEEEE", 400, 0);
		
		
		
		
		
		
	}
	
	
}

class laminaFlix extends JPanel{
	
	JLabel escoger;
	JComboBox listado;
	
	public laminaFlix() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		escoger=new JLabel("Escoge el género de la película: ");
		
		add(escoger);
		
		listado=new JComboBox();
		
		listado.addItem("TERROR");
		listado.addItem("SUSPENSO");
		listado.addItem("ÁNIME");
		listado.addItem("CRISTIANAS");
		
		add(listado);
		//ahora a ponerlo en escucha del evento
		
		
		listado.addActionListener(new accion());
	}
	
	
	private class accion implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("el we");
			
			laminaCentro terror=new laminaCentro();
	        
			terror.setLayout(new GridLayout(4,4));
			
			JButton nee=new JButton("nuevo");
			terror.setBounds(0, 0, 100, 400);
			
			terror.add(nee);
			
			terror.setVisible(true);
		}
		
		
	}
	
	
	
	
	
	
	
}


class laminaCentro extends JPanel{
	

	
	
	public laminaCentro(){
		
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//g.drawString("PROBANDO, PROBANDO", 10, 10);
		
		Graphics2D g002=(Graphics2D) g;
		
		File dirImagen= new File("src/fondo.jpg");
		try {
		elfondo=ImageIO.read(dirImagen);
		}
		catch(IOException e){
			System.out.println("la imagen no está disponible");
		}
		
		//g002.drawImage(elfondo, 0, 0, null);
		
		g002.drawImage (elfondo, 0, 0, this.getWidth(), this.getHeight(), this.getBackground(), this);
      
	}
	
	private Image elfondo;
}
