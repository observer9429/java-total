package graficos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.*;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraficoSabado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marcoTotal muestra=new marcoTotal();
		muestra.setVisible(true);
		
		muestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//hideonclose es cuando hay varias ventanas

		System.out.println(muestra.getHeight());
		System.out.println(muestra.getWidth());
	}

}

class marcoTotal extends JFrame{
	marcoTotal(){
		Toolkit mipantalla=Toolkit.getDefaultToolkit();// devuelve el sistema nativo de ventana
		Dimension tamanoPantalla=mipantalla.getScreenSize();
		
		int alturaPantalla=tamanoPantalla.height;
		int anchoPantalla=tamanoPantalla.width;
		
		//System.out.println(alturapantalla);
		
		
		setBounds(anchoPantalla/4,alturaPantalla/4,anchoPantalla/2,alturaPantalla/2);
		//setSize(anchoPantalla/2,alturaPantalla/2);
		setTitle("sabado de formularios");
		
		Image miIcono=mipantalla.getImage("miniwolf.png");
		setIconImage(miIcono);
		
		lamina1 lam1=new lamina1();
		add(lam1);
		
		setBackground(Color.DARK_GRAY.brighter().brighter().brighter());
		
	}
	
	
}


class lamina1 extends JPanel{
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		g.drawString("weee", 150, 150);
		
		Graphics2D g2=(Graphics2D) g;
		
		Font mifuente=new Font("Arial",Font.BOLD,25);
		g2.setFont(mifuente);
		g2.setColor(Color.BLUE);
		g2.drawString("Good Hope", 100	, 	100);
		
		File dirImagen= new File("src/graficos/charmander.png");
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
