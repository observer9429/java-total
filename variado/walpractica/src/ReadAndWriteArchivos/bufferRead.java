package ReadAndWriteArchivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class bufferRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Leer_Buffer bufleer=new Leer_Buffer();
		
		bufleer.leeConBuf();
		
	}

}


class Leer_Buffer{
	
	public void leeConBuf() {
		
		try {
			FileReader entrada=new FileReader("C:/Users/warez9429/Desktop/leer.txt");// es excepcion comprobada
			
			BufferedReader mibuffer=new BufferedReader(entrada);// almacenamis en el buffer, que es una memoria intermedia
																	//ese fichero
					
			String linea="";
									
			while(linea!=null) {
				
				linea=mibuffer.readLine();
				
				
				if(linea!=null)//no es necesario abrir y cerrar llave, ya q solo hau yna linea de codigo
				System.out.println(linea);
			}
			
			entrada.close();// este metodo es para cerrar el stream abierto, ya que consume recursos
								//se podria poner mas abajo pero seria innecesario y mas complejo
			
		} catch (IOException e) {// cambiamos la excepcion fileexception por otras mas general para
			// TODO Auto-generated catch block  //que no de problemas con el metodo read
			System.out.println("archivo no encontrado");;
		}
	}
}