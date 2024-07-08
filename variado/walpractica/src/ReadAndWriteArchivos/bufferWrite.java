package ReadAndWriteArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EscribiendoBuffer writeBuffer=new EscribiendoBuffer();
		writeBuffer.escribirBuffer();
	}

}


class EscribiendoBuffer{
	
	
	
	public void escribirBuffer() {
		
		String frase="Cienciano, campeón de la Copa Sudamericana y de la Recopa Sudamericana.Todo ello"
				+ " eliminando a los dos más grandes de Argentina";
		
		try {
		    FileWriter escritura=new FileWriter("C:/Users/warez9429/Desktop/nuevoEscritob.txt");
			
			
			BufferedWriter mibuffer=new BufferedWriter(escritura);// almacenamis en el buffer, que es una memoria 
			// intermedia
			//ese fichero
			
			//FileWriter escritura=new FileWriter("C:/Users/warez9429/Desktop/nuevoEscrito.txt, true");
			//esto es apra sobreescribir en un archivo ya existente, habria que verlo en la API
			for(int i=0;i<frase.length();i++) {
				
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();//cerrando conexion
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}