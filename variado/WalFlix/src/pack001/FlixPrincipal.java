package pack001;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;



public class FlixPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoFlix elmarco=new MarcoFlix();
		elmarco.setVisible(true);
		elmarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/*
		Registro prueba=new Registro();
		prueba.setVisible(true);
		
		prueba.setResizable(false);
		prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		*/
	}

}


class MarcoFlix extends JFrame{
	
	public MarcoFlix() {
		
		setTitle("Spider Man");
		setBounds(550,100,550,350);
		
		LaminaPrincipal lamina001=new LaminaPrincipal();
		add(lamina001);
		
		
        Toolkit lapantalla=Toolkit.getDefaultToolkit();
		
		Image elIcono=lapantalla.getImage("spiderman.png");
		
		//Image elIcono=lapantalla.getImage("C:/Users/warez9429/Desktop/eclipsejava/walpractica/miniwolf01.png");
		setIconImage(elIcono);
	}
	
	
}

class LaminaPrincipal extends JPanel{
	
	public LaminaPrincipal() {
		
		setLayout(new BorderLayout());
		
		LaminaSuperior lamsup=new LaminaSuperior();
		add(lamsup,BorderLayout.NORTH);
		
		LaminaInferior laminf=new LaminaInferior();
		add(laminf,BorderLayout.SOUTH);
		
		
		
	}
	
public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//g.drawString("PROBANDO, PROBANDO", 10, 10);
		
		Graphics2D g002=(Graphics2D) g;
		
		File dirImagen= new File("lamfondo.jpg");
		
		//URL ruta_principal=LaminaPrincipal.class.getResource("lamfondo.jpg");
		
		try {
		//elfondo=ImageIO.read(dirImagen);//con el metodo class resourse
			elfondo=ImageIO.read(dirImagen);
		
		}
		catch(IOException e){
			System.out.println("la imagen no está disponible");
		}
		
		//g002.drawImage(elfondo, 0, 0, null);
		
		g002.drawImage (elfondo, 0, 0, this.getWidth(), this.getHeight(), this.getBackground(), this);
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
	
	private Image elfondo;
}

 