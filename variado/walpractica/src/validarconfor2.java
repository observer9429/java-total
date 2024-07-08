import javax.swing.JOptionPane;

public class validarconfor2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    boolean arroba=false;
    boolean punto=false;
    
		
		String mail=JOptionPane.showInputDialog("Mano, introduce tu email");
		
		for(int i=0;i<mail.length();i++) {
			
			if(mail.charAt(i)=='@') {
				
				arroba=true;
			}
			
						
			
		}
		
		
		for(int j=0;j<mail.length();j++) {
			if(mail.charAt(j)=='.') {
				punto=true;
			}
			
			
		}
		
		
		
		
		
		if(arroba==true && punto==true) {
			System.out.println("Su mail es válido");
		}
		
		else {
			System.out.println("Su mail NO es válido");
		}

	}

}
