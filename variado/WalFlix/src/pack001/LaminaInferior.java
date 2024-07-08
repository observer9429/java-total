package pack001;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;


public class LaminaInferior extends JPanel {
	
	JLabel avisoinf=new JLabel("Próximamente podrás ver los videos desde nuestra APP y sin consumir tus datos.");
	public LaminaInferior() {
		
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		add(avisoinf);
		
		
	}
	
public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//g.drawString("PROBANDO, PROBANDO", 10, 10);
		
		Graphics2D g002=(Graphics2D) g;
		
		File dirImagen= new File("laminf.jpg");
		try {
		elfondoinf=ImageIO.read(dirImagen);
		}
		catch(IOException e){
			System.out.println("la imagen no está disponible");
		}
		
		//g002.drawImage(elfondo, 0, 0, null);
		
		g002.drawImage (elfondoinf, 0, 0, this.getWidth(), this.getHeight(), this.getBackground(), this);
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
	
private Image elfondoinf;

}
