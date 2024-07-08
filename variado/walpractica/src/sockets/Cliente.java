package sockets;

//tambien hay que crearle un serversocket para que este a la escuicha
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.*;
import javax.swing.*;


public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCliente mimarco=new MarcoCliente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoCliente extends JFrame{
	
	public MarcoCliente(){
		
		setBounds(600,300,280,350);
				
		LaminaMarcoCliente milamina=new LaminaMarcoCliente();
		
		add(milamina);
		
		setVisible(true);
		}	
	
}

class LaminaMarcoCliente extends JPanel implements Runnable{
	
	public LaminaMarcoCliente(){
	
		nick=new JTextField(5);
		
		add(nick);
		JLabel texto=new JLabel("--CHAT--");
		
		add(texto);
		
		ip=new JTextField(8);
		
		add(ip);
		campochat=new JTextArea(12,20);
		
		add(campochat);
	
		campo1=new JTextField(20);
	
		add(campo1);		
	
		miboton=new JButton("Enviar");
		
		EnviaTexto mievento=new EnviaTexto();
		miboton.addActionListener(mievento);
		add(miboton);	
		
	//ponemos en funcionamioento el hilo
		
		Thread mihilo=new Thread(this);
		
		mihilo.start();
		
	}
	
	
	private class EnviaTexto implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			try {
				Socket misocket=new Socket("192.168.1.75",9999);//crea el enlace o puente
				
				
				PaqueteEnvio datos=new PaqueteEnvio();
				
				datos.setNick(nick.getText());
				datos.setIp(ip.getText());
				datos.setMensaje(campochat.getText());
				//ahora cambiamos la forma de envio, ya que ahora es un objeto y solo datos escritos
				ObjectOutputStream paquete_datos=new ObjectOutputStream(misocket.getOutputStream());
				//hi le asamos el socket creado muisocket con el metodo get
				paquete_datos.writeObject(datos);//escribimos en el objeto
				misocket.close();
				
				/*
				DataOutputStream flujo_salida=new DataOutputStream(misocket.getOutputStream());//ahora 
				//indicamos por donde va circulo,le
				//indicamos que circulara por este socket con el metodo getoutputstream
				
				flujo_salida.writeUTF(campo1.getText());
				
				flujo_salida.close();*/
				
				
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				
				//e1.printStackTrace();
				System.out.println(e1.getMessage());
			}
			//System.out.println(campo1.getText());
			
		}
	}
		
		
		
	private JTextField campo1, nick, ip;
	
	private JTextArea campochat;
	private JButton miboton;
	
	
	
	public void run() {
		try {
			
			ServerSocket servidor_cliente=new ServerSocket(9090);
			
			Socket cliente;//creamos socket por el cual va recibir
			
			PaqueteEnvio paqueteRecibido;//va alamacenar el paquete que recibe
			
			while(true) {
				cliente=servidor_cliente.accept();//con eso aceptará todas las conexiones que le vengan del server
				
				ObjectInputStream flujoentrada=new ObjectInputStream(cliente.getInputStream());
				
				paqueteRecibido=(PaqueteEnvio) flujoentrada.readObject();
				
				campochat.append("\n"+paqueteRecibido.getNick()+" : "+paqueteRecibido.getMensaje());
				
			}
			
		}catch(Exception e) {
			
			System.out.println(e.getMessage());
			}
		
		
	}

	
}

class PaqueteEnvio implements Serializable{//serializamos la clase que construye el objeto que se va enviar
	
	private String nick, ip, mensaje;

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
