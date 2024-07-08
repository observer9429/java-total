package ReadAndWriteArchivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Streams_leer_escribir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cuenta=0;
		
		int datos_entrada []=new  int[15138];		// ponemos el numero de lementos de bytes que tiene la imagen
		try {
		//instanciamos la clase para leer una imagen,u otros archivos
		FileInputStream archivolee=new FileInputStream("C:/Users/warez9429/Desktop/ejecutables/we.jpg");
		
		boolean final_ar=false;
		
		while(!final_ar) {
			
			int byte_entrada=archivolee.read();//metodo que lee byte a byte
			
			if(byte_entrada!=-1)
				
				datos_entrada[cuenta]=byte_entrada;
			
			else {
				
				final_ar=true;
			
			System.out.println(datos_entrada[cuenta]);
			}
			cuenta++;
			
		}
		
		archivolee.close();
		}catch(IOException e){
			System.out.println("no se encontro el archivo");
		}
		
		System.out.println(cuenta);// al final devuelkve -1, eso el cuenta no lo suma y hay 15138 elementoas
		
		crea_fichero(datos_entrada);
	}
	
	static void crea_fichero(int datos_fichero[]) {
		
		try {
			FileOutputStream fichero_nuevo=new FileOutputStream("C:/Users/warez9429/Desktop/ejecutables/we_copia.jpg");
			
			for(int i=0;i<datos_fichero.length;i++) {
				
				fichero_nuevo.write(datos_fichero[i]);
			}
			
			fichero_nuevo.close();
		}catch(IOException e) {
			System.out.println("problema al crear imagen");
		}
	}

}
