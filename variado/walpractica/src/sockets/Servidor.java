package sockets;

import javax.swing.*;

import java.awt.*;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoServidor mimarco=new MarcoServidor();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
	}	
}

class MarcoServidor extends JFrame implements Runnable{
	
	public MarcoServidor(){
		
		setBounds(600,300,280,350);				
			
		JPanel milamina= new JPanel();
		
		milamina.setLayout(new BorderLayout());
		
		areatexto=new JTextArea();
		
		milamina.add(areatexto,BorderLayout.CENTER);
		
		add(milamina);
		
		setVisible(true);
		
		Thread mihilo=new Thread(this);
		mihilo.start();
		}
	
	private	JTextArea areatexto;

	
	public void run() {
		
		
		try {
			ServerSocket servidor=new ServerSocket(9999);//con esto ya esta a la escucha, con ese puerto abuerto
			
			//ahoira creamos 3 variables que almacenaran la informacion que le llgue por la red
			String nick,ip,mensaje;
			//ahora necesitamos crear una instancia de la clase paqueteenvio para construir dentro de un paquete nuevo 
			//lo que se va a recibir
			PaqueteEnvio paquete_recibido;
			
			while(true) {//el while es para poder seguir enviando mensajes
			//ahora hay que decirle que acepte cualqueir conexion
				
				
			Socket misocket=servidor.accept();
			
			
			ObjectInputStream paquete_datos=new ObjectInputStream(misocket.getInputStream());
			
			paquete_recibido=(PaqueteEnvio) paquete_datos.readObject();//aqui leemos lo que hay en el objeto recibido 
			//y se lo pasamos al objeto creado en esta clase para que lo  almacene
			//esto lanza una excepcion
			//ahora con los metodos de la clase asignamos los valores del objeto a las variables creadas
			nick=paquete_recibido.getNick();
			ip=paquete_recibido.getIp();
			mensaje=paquete_recibido.getMensaje();
			
			areatexto.append("\n"+nick+" : "+mensaje+" para "+ip);
			
			
			/*
			DataInputStream flujo_entrada=new DataInputStream(misocket.getInputStream());
			//en el parametro se le pasa porque sockete viaja la informacion de entrada
			
			String mensaje_texto=flujo_entrada.readUTF();
			
			areatexto.append("\n"+ mensaje_texto);//metodo para agregar texto, y que de salto*/
			
			Socket enviaDestinatario=new  Socket(ip,9090);//ya creamos el puente de envio
			//abajho se crea el objeto para poder enviar
			ObjectOutputStream paqueteReenvio=new ObjectOutputStream(enviaDestinatario.getOutputStream());
			//ahora tenemos que meter la informacion en ese objeto
			
			paqueteReenvio.writeObject(paquete_recibido);//leemos o metemoscon 
														//el objeto creado el objeto que llega
			paqueteReenvio.close();
			
			enviaDestinatario.close();
			misocket.close();
			}
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("atento");
		
	}
}
