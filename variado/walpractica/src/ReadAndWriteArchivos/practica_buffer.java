package ReadAndWriteArchivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class practica_buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream calculo_bytes;
		
		int datos_entrada [];//int datos_entrada []=new  int[15138];
		
		int numero_matriz;
		try {
			 calculo_bytes=new FileInputStream("C:/Users/warez9429/Desktop/ejecutables/we.jpg");
			
			try {
				
				
				Long medida=calculo_bytes.getChannel().size();
				
				 numero_matriz= medida.intValue();
				 
				 datos_entrada=new int[numero_matriz];
				 
				for(int i=0;i<datos_entrada.length;i++) {
					
					int num_byte=calculo_bytes.read();
					
					datos_entrada[i]=num_byte;
					
					System.out.println("pos "+i+" es "+ datos_entrada[i]);
					
				}
				System.out.println(medida);
				System.out.println("el entero es "+numero_matriz);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
	
	
	static void calcula_bytes(int tamaño_matriz[]) {
		
		try {
		FileOutputStream fichero_nuevo=new FileOutputStream("C:/Users/warez9429/Desktop/ejecutables/wes_copia.jpg");
			
			/*
			for(int i=0;i<datos_fichero.length;i++) {
				
				fichero_nuevo.write(datos_fichero[i]);
			}
			*/
			
			fichero_nuevo.close();
		}catch(IOException e) {
			System.out.println("problema al crear imagen");
		}
	}

}


