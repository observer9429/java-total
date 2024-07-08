package coleccionPractica;

import javax.swing.JOptionPane;

public class Accion {

	public static void main(String[] args) {
		
		Lista l=new Lista();
		int op=0;
		
		do {
			
			String opcion=JOptionPane.showInputDialog(null,"LISTA SIMPLE \n1.- Insertar\n2.-Mostrar\n6.-Salir");
			
			op=Integer.parseInt(opcion);
			
			switch(op) {
			
			case 1:
			{
				String nombre, apellidos,annos;
				int edad;
				
				nombre=JOptionPane.showInputDialog(null,"digite el nombre");
				apellidos=JOptionPane.showInputDialog(null,"digite los apellidos");
				
				edad=Integer.parseInt(JOptionPane.showInputDialog(null,"digite la edad"));
				
				l.insertar(new Persona(nombre, apellidos,edad));
				break;
			}
			
			case 2:
			{
				
				l.mostrar();
				break;
			}
			
			}
			
			
		}while(op!=6);
		
	}

}
