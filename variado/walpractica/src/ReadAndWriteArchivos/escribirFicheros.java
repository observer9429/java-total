package ReadAndWriteArchivos;

import java.io.*;

public class escribirFicheros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Escribiendo tipeando=new Escribiendo();
		tipeando.escribir();
		
	}

}


class Escribiendo{
	
	public void escribir() {
		
		String frase="\n walpro está escribiendo            ";
		
		try {
			FileWriter escritura=new FileWriter("C:/Users/warez9429/Desktop/ejecutables/thewolf.txt");
			
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