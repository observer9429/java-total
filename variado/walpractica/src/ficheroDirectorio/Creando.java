package ficheroDirectorio;

import java.io.*;

public class Creando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File ruta=new File("C:/Users/warez9429/Desktop/ejecutables/thewolf.txt");//si pones sin extension, se crea carpe
		

		//ruta.mkdir();//sirve para crear carpetas
		
		
		//lo de abajo es de otro ejemplo
		String archivo_destino=ruta.getAbsolutePath();
		
		try {
			ruta.createNewFile();//se desactiva el metodo de crear carpetas para que no interfiera
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Escribiendo accede_es=new Escribiendo();
		
		accede_es.escribir(archivo_destino);
	}

}

class Escribiendo{//clase creada para escribir en archivo
	
	public void escribir(String ruta_archivo) {
		
		String frase="a ver si sale";
		
		try {
			
			FileWriter escritura=new FileWriter(ruta_archivo);
			
			for(int i=0;i<frase.length();i++) {
				
				escritura.write(frase.charAt(i));
				
				
			}
			
			escritura.close();
		}catch(IOException e) {
			
		}
	}
	
}