import javax.swing.*;
public class accesobucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="wal";
		String pass="";
		
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Digite la conbtrase�a por favor");
			
			if(clave.equals(pass)==false) {
				System.out.println("La contrase�a es incorrecta");
			}
			
		}
		
		System.out.println("bien lograste ingresar");

	}

}
