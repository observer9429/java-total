package losLayouts;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;
import javax.swing.*;



public class ZZcajas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marcozz velo=new Marcozz();
		velo.setVisible(true);velo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class Marcozz extends JFrame{
	
	JLabel nombres;
	JTextField c_nombres;
	JLabel apellidos;
	JTextField c_apellidos;
	JLabel correo;
	JTextField c_correo;
	JLabel usuario;
	JTextField c_usuario;
	JLabel contra;
	JPasswordField c_contra;
	JLabel contra2;
	JPasswordField c_contra2;
	public Marcozz(){
		
	setTitle("Cajas ZZ");
	setBounds(500,100,800,400);
	
	nombres=new JLabel("Nombres: ");
	c_nombres=new JTextField(10);
	c_nombres.setMaximumSize(c_nombres.getPreferredSize());
	
	Box caja4=Box.createHorizontalBox();
	caja4.add(nombres);
	caja4.add(Box.createHorizontalStrut(10));//para crear un espacion entre el label y el text
	caja4.add(c_nombres);
	///////////////////////////////////////////////////////////
	apellidos=new JLabel("Apellidos: ");
	c_apellidos=new JTextField(10);
	c_apellidos.setMaximumSize(c_apellidos.getPreferredSize());
	
	Box caja5=Box.createHorizontalBox();
	caja5.add(apellidos);
	caja5.add(Box.createHorizontalStrut(10));//para crear un espacion entre el label y el text
	caja5.add(c_apellidos);
	////////////////////////////////////////////////////////////
	correo=new JLabel("Correo electrónico:");
	c_correo=new JTextField(10);
	c_correo.setMaximumSize(c_correo.getPreferredSize());
	
	Box caja6=Box.createHorizontalBox();
	caja6.add(correo);
	caja6.add(Box.createHorizontalStrut(10));//para crear un espacion entre el label y el text
	caja6.add(c_correo);
	/////////////////////////////////////////////////////////
	usuario=new JLabel("Usuario:");
	c_usuario=new JTextField(10);
	c_usuario.setMaximumSize(c_usuario.getPreferredSize());
	
	Box caja7=Box.createHorizontalBox();
	caja7.add(usuario);
	caja7.add(Box.createHorizontalStrut(10));//para crear un espacion entre el label y el text
	caja7.add(c_usuario);
	///////////////////////////////////////////////////////////////
	contra=new JLabel("Contraseña:");
	c_contra=new JPasswordField(10);
	c_contra.setMaximumSize(c_contra.getPreferredSize());
	
	Box caja8=Box.createHorizontalBox();
	caja8.add(contra);
	caja8.add(Box.createHorizontalStrut(10));//para crear un espacion entre el label y el text
	caja8.add(c_contra);
	///////////////////////////////////////////////////////
	contra2=new JLabel("Repite la contraseña:");
	c_contra2=new JPasswordField(10);
	c_contra2.setMaximumSize(c_contra2.getPreferredSize());
	
	Box caja9=Box.createHorizontalBox();
	caja9.add(contra2);
	caja9.add(Box.createHorizontalStrut(10));//para crear un espacion entre el label y el text
	caja9.add(c_contra2);
	
	//*********************************************
	
	Box cajaVertical1=Box.createVerticalBox();
	
	cajaVertical1.add(caja4);
	cajaVertical1.add(caja5);
	cajaVertical1.add(caja6);
	
	
	Box cajaVertical2=Box.createVerticalBox();
	
	cajaVertical2.add(caja7);
	cajaVertical2.add(caja8);
	cajaVertical2.add(caja9);
	
	
	Box cajaH=Box.createHorizontalBox();
	
	cajaH.add(cajaVertical1);
	cajaH.add(Box.createHorizontalStrut(100));
	cajaH.add(cajaVertical2);
	
	
	
	add(cajaH);
	
	
	//Laminazz addme=new Laminazz();
	//add(addme);
	
	}
}



class Laminazz extends JPanel{
	
	
	
	
	public Laminazz() {
		
		
		
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g002=(Graphics2D) g;
		
		
		File rutazz=new File("registro.jpg");
		try {
			
		fondozz=ImageIO.read(rutazz);
		
		}catch(IOException e) {
			
		}
		
		g002.drawImage (fondozz, 0, 0, this.getWidth(), this.getHeight(), this.getBackground(), this);
	}
	
	private Image fondozz;
	
	
}




