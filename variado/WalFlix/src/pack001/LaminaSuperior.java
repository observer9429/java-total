package pack001;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class LaminaSuperior extends JPanel{

	JButton registrar, ingresar;
	public LaminaSuperior() {
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		registrar=new JButton("Registrarme");
		ingresar=new JButton("Ingresar");
		
     
		
		add(registrar);
		add(ingresar);
		
		AccionRegistro accion1=new AccionRegistro();
		
		registrar.addActionListener(accion1);
		
	}
	
public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//g.drawString("PROBANDO, PROBANDO", 10, 10);
		
		Graphics2D g002=(Graphics2D) g;
		
		File dirImagen= new File("lamsup.jpg");
		try {
		elfondosup=ImageIO.read(dirImagen);
		}
		catch(IOException e){
			System.out.println("la imagen no está disponible");
		}
		
		//g002.drawImage(elfondo, 0, 0, null);
		
		g002.drawImage (elfondosup, 0, 0, this.getWidth(), this.getHeight(), this.getBackground(), this);
		/*
		img- La imagen especificada a dibujar. Este método no hace nada si imges nulo.
		x- la coordenada x
		y- La coordenada y .
		width - El ancho del rectángulo.
		height - La altura del rectángulo.
		bgcolor - el color de fondo para pintar debajo de las partes no opacas de la imagen.
		observer - Objeto a ser notificado ya que se convierte más de la imagen.
        */
	}
	
private Image elfondosup;

  class AccionRegistro implements ActionListener{
	  boolean estado;
	  Registro elregistro;
	  
	  public AccionRegistro() {
		  elregistro=new Registro();
		  estado=true;
	  }
	
	  public void actionPerformed(ActionEvent e) {
		  
		
		  if(estado) {
			  
			  elregistro.setVisible(true);
			  elregistro.setResizable(false);
			  elregistro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			  		  
			  
		  }
		  
		  
		  
		  
		
		  
		  System.out.println(elregistro.isVisible());
		  
		  
		 
	  }
  }

}

