package ReadAndWriteArchivos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Leer_Fichero lector=new Leer_Fichero();
		
		lector.lee();
		
	}

}
//el metodo read devuelve enteros, y cuando llegue al final , devolverá -1

class Leer_Fichero{
	
	public void lee() {
		
		try {
			FileReader entrada=new FileReader("C:/Users/warez9429/Desktop/leer.txt");// es excepcion comprobada
			
			//int c=entrada.read();
			
			int c=0;//con valor 0 para que lea desde el primer caracter
			
			while(c!=-1) {
				
				c=entrada.read();//almacena el caracter pero en codigo de maquina
				
				char letra=(char) c;//hacemos un casting para convertirlo a letra
				
				System.out.print(letra);
			}
			
			entrada.close();// este metodo es para cerrar el stream abierto, ya que consume recursos
								//se podria poner mas abajo pero seria innecesario y mas complejo
			
		} catch (IOException e) {// cambiamos la excepcion fileexception por otras mas general para
			// TODO Auto-generated catch block  //que no de problemas con el metodo read
			System.out.println("archivo no encontrado");;
		}
	}
}