package LasExcepciones;
import java.io.EOFException;

import javax.swing.*;
public class elMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean aarroba=false;
		
		String email=JOptionPane.showInputDialog("Mano, introduce tu email");
		
		
		
		
		try {
		
		elwes(email,aarroba);
		}catch(Exception e) {
			System.out.println("el mail no es correcto, muy corto");//no es necesario poner un mensaje si ya
																	//capturamos el error
			
			//imprime informacion del llamado de este error, o inf de la clase excepcion creada
			e.printStackTrace();
		}
		
		

	}
	
	
	static void elwes(String mail,boolean arroba) throws longitud_erronea {
		
		if(mail.length()<=3) {
			
			//ArrayIndexOutOfBoundsException mi_excepcion=new ArrayIndexOutOfBoundsException();
			
			//throw new EOFException();
			
			throw new longitud_erronea("el mail debe tener minimo 4 caracteres");//le indicamos donde va lanzar la excepcion
			
		}else {
		
		     for(int i=0;i<mail.length();i++) {
					
					if(mail.charAt(i)=='@') {
						
						arroba=true;
					}
					
								
					
				}
				
				if(arroba==true) {
					System.out.println("Su mail es válido");
				}
				
				else {
					System.out.println("Su mail NO es válido");
				}
		
		}
		
		
	}

}


class longitud_erronea extends Exception{
	
	public longitud_erronea() {}
	
	public longitud_erronea(String msj_error) {
		
		super(msj_error);
		
	}
}