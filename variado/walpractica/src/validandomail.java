import javax.swing.JOptionPane;

public class validandomail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arroba=0;
	    int punto=0;
	    
			
			String mail=JOptionPane.showInputDialog("Mano, introduce tu email");
			
			for(int i=0;i<mail.length();i++) {
				
				if(mail.charAt(i)=='@') {
					
					arroba++;
				}
				
								
			}
						
			for(int j=0;j<mail.length();j++) {
				if(mail.charAt(j)=='.') {
					punto++;
				}
								
			}
						
							
			if(arroba==1 && punto==1) {
				System.out.println("Su mail es válido");
			}
			
			else {
				System.out.println("Su mail NO es válido");
			}

	}

}
