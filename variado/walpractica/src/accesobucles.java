import javax.swing.*;
public class accesobucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave="wal";
		String pass="";
		
		while(clave.equals(pass)==false) {
			
			pass=JOptionPane.showInputDialog("Digite la conbtraseña por favor");
			
			if(clave.equals(pass)==false) {
				System.out.println("La contraseña es incorrecta");
			}
			
		}
		
		System.out.println("bien lograste ingresar");

	}

}
