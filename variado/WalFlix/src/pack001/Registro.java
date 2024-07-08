package pack001;

import java.awt.*;
import java.net.*;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooser;

//import losLayouts.EnColumnas;

public class Registro extends JFrame {
	
	//boolean estado;
	
	public Registro() {
		
		setTitle("Regístrate para obtener más beneficios");
		setBounds(50,50,600,700);
		
		LaminaRegistro elreg=new LaminaRegistro();
		add(elreg);
		
		//estado=false;
	}

}

class LaminaRegistro extends JPanel{
	
	Document dusuario;
	
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
	
	JLabel fecha;
	
	JDateChooser c_fecha;
	
	JLabel pais;
	JLocaleChooser c_pais;
	
	JButton elregistro;
	
	AccionesRegistro oyenteD=new AccionesRegistro();
	AccionFoco oyenteF=new AccionFoco();
	
	public LaminaRegistro() {
		
		

setLayout(new LayoutRegistro());
		
		nombres=new JLabel("Nombres: ");
		c_nombres=new JTextField();
		apellidos=new JLabel("Apellidos: ");
		c_apellidos=new JTextField();
		
		
		correo=new JLabel("Correo electrónico:");
		c_correo=new JTextField();
		usuario=new JLabel("Usuario:");
		c_usuario=new JTextField();
		contra=new JLabel("Contraseña:");
		c_contra=new JPasswordField();
		contra2=new JLabel("Repite la contraseña:");
		c_contra2=new JPasswordField();
		
		fecha=new JLabel("Fecha de nacimiento:");
		
		c_fecha=new JDateChooser();
		
		pais=new JLabel("País");
		c_pais=new JLocaleChooser();
		
		elregistro=new JButton("Registrar");
		
		
	
		dusuario=c_usuario.getDocument();
	
		dusuario.addDocumentListener(oyenteD);
		
		dusuario=c_contra.getDocument();
		
		dusuario.addDocumentListener(oyenteD);
		
		
		
		
		
		add(nombres);
		add(c_nombres);
		add(apellidos);
		add(c_apellidos);
		//add(edad);
		//add(c_edad);
		add(correo);
		add(c_correo);
		add(usuario);
		add(c_usuario);
		add(contra);
		add(c_contra);
		add(contra2);
		add(c_contra2);
		
		add(fecha);
		add(c_fecha);
		
		add(pais);
		add(c_pais);
		
		add(elregistro);
	}
	
	
	public void  initComponents() {
		
		
		
		
		
	}
	
public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		//g.drawString("PROBANDO, PROBANDO", 10, 10);
		
		JButton elwe=new JButton("elweee");
		
		//add(elwe);
		
		Graphics2D g002=(Graphics2D) g;
		
		//URL ruta_registro=LaminaRegistro.class.getResource("registro.jpg");
		
		File dirImagen= new File("registro.jpg");
		try {
			
			
			//fondoreg=ImageIO.read(dirImagen); //pondremos la ruta-registro
			fondoreg=ImageIO.read(dirImagen);
			
		}
		catch(IOException e){
			System.out.println("la imagen no está disponible");
		}
		
		//g002.drawImage(elfondo, 0, 0, null);
		
		g002.drawImage (fondoreg, 0, 0, this.getWidth(), this.getHeight(), this.getBackground(), this);
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
	
private Image fondoreg;


class AccionesRegistro implements DocumentListener {

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
		char [] contrasena;
		contrasena=c_contra.getPassword();
		
		if(contrasena.length<8 ||  contrasena.length>12) {
			c_contra.setBackground(Color.RED);
			
		}else {
			c_contra.setBackground(Color.WHITE);
		}
		
		
		e.getDocument();
		
		System.out.println("we"+e.getDocument());
		
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	
	//***-*-*-*-*-*-*-*-*-*-*-*-----------------*********-*-**-*-*-*-*-*-*-*-*-*-*-*-**-*-*-*-*-**-
	
	
	
}

class AccionFoco implements WindowFocusListener{

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("perdió el foco");
	}
	
	
}


}


