package graficos;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;


public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MarcoCentrado elmarco=new MarcoCentrado();
		
		elmarco.setVisible(true);
		elmarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//hideonclose es cuando hay varias ventanas
		

	}

}


class MarcoCentrado extends JFrame{
	public MarcoCentrado() {
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();// devuelve el sistema nativo de ventana
		Dimension tamanoPantalla=mipantalla.getScreenSize();
		int alturaPantalla=tamanoPantalla.height;
		int anchoPantalla=tamanoPantalla.width;
		
		setBounds(anchoPantalla/4,alturaPantalla/4,anchoPantalla/2,alturaPantalla/2);
		//setSize(anchoPantalla/2,alturaPantalla/2);
		setTitle("Formulario lobo");
		
		Image miIcono=mipantalla.getImage("miniwolf01.png");
		setIconImage(miIcono);
		
		
	}
	
	
}