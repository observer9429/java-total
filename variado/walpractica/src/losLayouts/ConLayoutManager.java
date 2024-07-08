package losLayouts;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.LayoutManager;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ConLayoutManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MarcoManager elman=new MarcoManager();
		elman.setVisible(true);
		elman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoManager extends JFrame{
	
	public MarcoManager() {
		
		setTitle("Con propio Layout");
		setBounds(400,40,500,400);
		
		LaminaManager elmanl=new LaminaManager();
		add(elmanl);
		
	}
	
}

class LaminaManager extends JPanel{
	
	public LaminaManager() {
		
		setLayout(new EnColumnas());
		
		JLabel nombre=new JLabel("Nombre: ");
		
		JTextField c_nombre=new JTextField();
		
		JLabel apellido=new JLabel("Apellido: ");
		
		JTextField c_apellido=new JTextField();
		
		JLabel edad=new JLabel("Edad: ");
		
		JTextField c_edad=new JTextField();
		
		add(nombre);
		add(c_nombre);
		add(apellido);
		add(c_apellido);
		add(edad);
		add(c_edad);
		
	}
	
public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//g.drawString("PROBANDO, PROBANDO", 10, 10);
		
		Graphics2D g002=(Graphics2D) g;
		
		File dirImagen= new File("registro.jpg");
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




class EnColumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String name, Component comp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layoutContainer(Container micontenedor) {
		// TODO Auto-generated method stub
		
		int d=micontenedor.getWidth();// esta variable ayuda en el calculo para poner los elmentso al centro
		
		x=d/2;
		
		int contador=0;
		
		int n=micontenedor.getComponentCount();
		
		for(int i=0;i<n;i++) {
			
			contador++;
			
			Component c=micontenedor.getComponent(i);
			
			c.setBounds(x-100, y, 100, 20);
			
			x+=100;
			
			if(contador%2==0) {
				x=d/2;
				y+=40;
			}
		}
		
		
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
	
	private int x;
	private int y=20;
	
}