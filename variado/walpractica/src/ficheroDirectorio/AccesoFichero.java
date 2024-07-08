package ficheroDirectorio;

import java.io.*;

public class AccesoFichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//programa que da los nombres de los archivos dentro de una carpeta, y dentro de una subcarpeta
		
		File ruta=new File("C:/Users/warez9429/Desktop/ejecutables");
		
		System.out.println(ruta.getAbsolutePath());
		//metodo list devuelve un array
		
		String[] nombre_archivos=ruta.list();//hemos guardado todos los nombres de la ruta en ese arrray
		
		for(int i=0;i<nombre_archivos.length;i++) {
			
			System.out.println(nombre_archivos[i]);
			
			File f=new File(ruta.getAbsolutePath(),nombre_archivos[i]);
			
			if(f.isDirectory()) {
				
				String [] archivos_subcarpeta=f.list();
				
				for(int j=0;j<archivos_subcarpeta.length;j++) {
					
					System.out.println(archivos_subcarpeta[j]);
				}
				
			}
		}
	}

}
