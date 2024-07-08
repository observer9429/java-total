package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pokeMarco marcopok=new pokeMarco();
		marcopok.setVisible(true);
		marcopok.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
	}

}

class pokeMarco extends JFrame{
	
	
	public pokeMarco() {
		
		
		setTitle("galería pokemón");
		setBounds(750,50,500,250);
		
		laminaBotones lista=new laminaBotones();
		add(lista);
	}
	
}

 class laminaBotones extends JPanel{
	
	JButton botonCharmander=new JButton("Charmander");
	
	  int cont1=0;
	
	 JButton es_cerrar;
	
	public laminaBotones() {
		
		es_cerrar=new JButton("Cerrar ventanas");
		
		add(botonCharmander);
		add(es_cerrar);
		
		oyenteChar accionChar=new oyenteChar(cont1);
		
		botonCharmander.addActionListener(accionChar);
				
	}
	
	
	
		
   private class oyenteChar implements ActionListener{
	    int peswe;//variable que cuenta las ventanas
	   public  oyenteChar(int contar) {
		   
		   peswe=contar;
		   
	   }
		
		public void actionPerformed(ActionEvent e) {
			
				
			CharmanderPok marcoChar=new CharmanderPok(es_cerrar);
			/*
			if(peswe>0) {
			
			}
			else {
				marcoChar.setVisible(true);
				peswe++;
			}
			*/
				marcoChar.setVisible(true);
                	
                	
			  
				System.out.println(peswe);
			
		}
		
	}
	
   
}

class CharmanderPok extends JFrame{
	
	JButton para_cerrar;
	
	
	public CharmanderPok(JButton para_cerrar) {
		
		
		
		setTitle("Galeria Charmander");
		setBounds(10,400,500,300);
		laminaChar1 grafChar=new laminaChar1();
		
		
		FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT);
		grafChar.setLayout(disposicion);
		
		add(grafChar); 
		
		cierralo closewe=new cierralo();
		
		para_cerrar.addActionListener(closewe);
		
	}
	
	class cierralo implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			
			
			
		}
	}
	
	
	private class laminaChar1 extends JPanel{
		JButton evolucionChar1=new JButton("Ver evolucion 1");
		
		
		public laminaChar1() {
		
			add(evolucionChar1);
			
			oyenteChar2 accionChar2=new oyenteChar2();
			evolucionChar1.addActionListener(accionChar2);
			
		}
		
       class oyenteChar2 implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				
				CharmeleonPok evo1=new CharmeleonPok(para_cerrar);
				evo1.setVisible(true);
				
			}
			
			
		}
		
		
		
		public void paintComponent(Graphics g){
			super.paintComponents(g);
			
			
			Graphics2D g2=(Graphics2D) g;
			
			Font mifuente=new Font("Arial",Font.BOLD,25);
			g2.setFont(mifuente);
			g2.setColor(Color.BLUE);
			g2.drawString("Charmander", 50	, 	100);
			
			
			//Image char_inter=new ImageIcon(getClass().getResource("char_raiz.png").get);
			
			//File rutasec= new File(getClass().getResource("char_raiz.png").geti);
			
			//new ImageIcon(getClass().getResource("/NOMBRE_DEL_PAQUETE/imagenes/imagen1.JPG"))
			
			//*********************************
			//URL elwe=CharmanderPok.class.getResource("char_raiz.png");
			
			
			File dirImagen= new File("char_raiz.png");
			
			
			try {
				
			imagen=ImageIO.read(dirImagen);
			
			}
			catch(IOException e){
				System.out.println("la imagen no está disponible");
			}
	        
			
			g2.drawImage(imagen, 200, 0, null);
			
		}
		private Image imagen;
		
	}
	
}


class CharmeleonPok extends JFrame{
	
	public CharmeleonPok(JButton para_cerrar2) {
		
		setTitle("Charmeleon");//le pasamos el boton, pero falta crear los metodos
		setBounds(400,400,500,300);
		
		laminaChar2 grafChar2=new laminaChar2();
		FlowLayout disposicion=new FlowLayout(FlowLayout.LEFT);
		grafChar2.setLayout(disposicion);
		
		add(grafChar2);
		
	}
	
	 class laminaChar2 extends JPanel{
		
		JButton botonChairzard=new JButton("Ver segunda evolución");
		public laminaChar2() {
			
			add(botonChairzard);
			
			oyenteChar3 accionChairzard=new oyenteChar3();
			
			botonChairzard.addActionListener(accionChairzard);
			
		}
		
		class cierralo2 implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
				
				
			}
		}
		
		class oyenteChar3 implements ActionListener{
			
			
			public void actionPerformed(ActionEvent e) {
				
				ChairzardPok ultimo=new ChairzardPok();
				ultimo.setVisible(true);
				
				
			}
		}
		
		public void paintComponent(Graphics g){
			super.paintComponents(g);
			
			
			Graphics2D g2=(Graphics2D) g;
			
			Font mifuente=new Font("Arial",Font.BOLD,25);
			g2.setFont(mifuente);
			g2.setColor(Color.BLUE);
			g2.drawString("Charmeleon", 50	, 	100);
			
			File dirImagen= new File("src/graficos/charmeleon001.png");
			try {
			imagen2=ImageIO.read(dirImagen);
			}
			catch(IOException e){
				System.out.println("la imagen no está disponible");
			}
	        
			
			g2.drawImage(imagen2, 200, 0, null);
			
		}
		private Image imagen2;
		
	}
	
}

class ChairzardPok extends JFrame{
	public ChairzardPok() {
		
		setTitle("Chairzard");
		setBounds(0,0,700,400);
		
		laminaChairzard we007=new laminaChairzard();
		add(we007);
		
		setBackground(Color.DARK_GRAY.brighter().brighter());
	}
	
	class laminaChairzard extends JPanel{
		
		public laminaChairzard() {
			
			
			
		}
		public void paintComponent(Graphics g){
			super.paintComponents(g);
			
			
			
			Graphics2D g2=(Graphics2D) g;
			
			Font mifuente=new Font("Arial",Font.BOLD,25);
			g2.setFont(mifuente);
			g2.setColor(Color.BLUE);
			g2.drawString("Charizard", 50	, 	100);
			
			File dirImagen= new File("src/graficos/chairzard001.png");
			try {
			imagen3=ImageIO.read(dirImagen);
			}
			catch(IOException e){
				System.out.println("la imagen no está disponible");
			}
	        
			
			g2.drawImage(imagen3, 200, 0, null);
			
		}
		private Image imagen3;
		
	}
	
	
}


