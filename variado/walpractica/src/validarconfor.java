import javax.swing.*;
public class validarconfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arroba=false;
		
		String mail=JOptionPane.showInputDialog("Mano, introduce tu email");
		
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
