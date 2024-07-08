

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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pokemones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pokeMarco10 marcopok=new pokeMarco10();
		marcopok.setVisible(true);
		marcopok.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		
	}

}

class pokeMarco10 extends JFrame{
	

	public pokeMarco10() {
		
		
		
		setTitle("galería pokemón");
		setBounds(750,50,500,550);
		
		lamina1000 asu=new lamina1000();
		add(asu);
		
	}
	
	
	
	
}


class lamina1000 extends JPanel{
	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		g.drawString("weee", 150, 150);
		
		Graphics2D g2=(Graphics2D) g;
		
		Font mifuente=new Font("Arial",Font.BOLD,25);
		g2.setFont(mifuente);
		g2.setColor(Color.BLUE);
		g2.drawString("Good Hope", 100	, 	100);
		
		File dirImagen= new File("src/graficos/pokemones/chairzard001.png");
		try {
		imagen11=ImageIO.read(dirImagen);
		}
		catch(IOException e){
			System.out.println("la imagen no está disponible");
		}
        
		
		g2.drawImage(imagen11, 200, 0, null);
		
	}
	private Image imagen11;
}



