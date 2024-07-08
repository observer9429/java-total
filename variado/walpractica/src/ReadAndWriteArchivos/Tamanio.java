package ReadAndWriteArchivos;

import java.io.FileInputStream;
import java.util.ArrayList;

public class Tamanio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int cuenta=0;
		
		//int datos_entrada []=new  int[15138];	
		
		// ponemos el numero de lementos de bytes que tiene la imagen
		
		ArrayList<Integer> datos_entrada=new ArrayList<>();
		try {
		//instanciamos la clase para leer una imagen,u otros archivos
		FileInputStream archivolee=new FileInputStream("C:/Users/warez9429/Desktop/ejecutables/bulbasaur.jpg");
		
		boolean final_ar=false;
		
		while(!final_ar) {
			
			int byte_entrada=archivolee.read();//metodo que lee byte a byte, devuelve -1 si la imagen ya termino 
			
			if(byte_entrada!=-1) {
				
				datos_entrada.add(byte_entrada);
			
			}else {
				
				final_ar=true;
			
			System.out.println(datos_entrada);
			System.out.println("el tamaño del arraytlist es: " +datos_entrada.size());
			}
			cuenta++;
			
		}
		
		}catch(Exception e) {
			
			System.out.println("error");
		}
	}

}
