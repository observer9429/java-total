package ficheroDirectorio;

import java.io.*;

public class Rutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		File archivo=new File(".settings");//creo que solo sirve con carpetas
		System.out.println(archivo.getAbsolutePath());// a pesar que el archivo no existe igual lo pone como si existiera
		System.out.println(archivo.exists());//

	}

}
