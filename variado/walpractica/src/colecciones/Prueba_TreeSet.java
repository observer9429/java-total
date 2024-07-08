package colecciones;

import java.util.*;

public class Prueba_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		TreeSet <String> ordenaPersonas=new TreeSet<String>();
		
		ordenaPersonas.add("Wendy");
		ordenaPersonas.add("Marco");
		ordenaPersonas.add("Armando");
		ordenaPersonas.add("Mónica");
		
		for(String este: ordenaPersonas) {
			
			System.out.println(este);//el orden de impresion por defecto en este es alfabeticamente, ya q String
		}//para que imprima en el orden que queramos, creamois nuestra propia clase que implemente la interface 
		//COMPARABLE en la cual editamos el metodo compareTo
		*/
		
		Articulo primero=new Articulo(1,"Primer artículo");
		Articulo segundo=new Articulo(2,"Segundo artículo");
		Articulo tercero=new Articulo(3,"Tercer artículo");
		
		TreeSet<Articulo> ordenaArticulos =new TreeSet<Articulo>();
		
		ordenaArticulos.add(tercero);
		ordenaArticulos.add(primero);
		ordenaArticulos.add(segundo);
		
		for(Articulo go: ordenaArticulos) {
	
			
			System.out.println(go.getDescripcion());
		}
		
		
			//Articulo comparadorArticulos=new Articulo();
			
			//TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(comparadorArticulos);
			//un constructor de treeset te pide un objeto tipo comparator o una clase que use esa interface
		
		
		//usamos la ultima clase
		//ComparadorArticulos compara_art=new  ComparadorArticulos();
		
		
		//la linea de arriba se comenta y se usara clase interna anonima
		TreeSet<Articulo> ordenaArticulos2=new TreeSet<Articulo>(new  Comparator<Articulo>() {

			
			public int compare(Articulo o1, Articulo o2) {
				// TODO Auto-generated method stub
				
				String desc1=o1.getDescripcion();
				String desc2=o2.getDescripcion();
				
				return desc1.compareTo(desc2);
			}
			
			
			
			
		});
			
			ordenaArticulos2.add(primero);
			ordenaArticulos2.add(segundo);
			ordenaArticulos2.add(tercero);
			
			for(Articulo pes: ordenaArticulos2) {
				
				System.out.println(pes.getDescripcion());
			}
	}

}


class Articulo implements Comparable<Articulo>{//, Comparator<Articulo>

	//public Articulo() {}
	
	public Articulo(int num, String desc) {
		
		numero_articulo=num;
		descripcion=desc;
		
	}

	
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return numero_articulo-o.numero_articulo;
	}
	
	public String getDescripcion() {
		
		return descripcion;
	}
	
	
	
	
	
	
	private int numero_articulo;
	private String descripcion;
	//metodo de COMPARATOR
	
	/*
	public int compare(Articulo arg0, Articulo arg1) {//metodo que ordena alfabeticamente
		
		
	  String descripcionA=arg0.getDescripcion();
	  
	  String descripcionB=arg1.getDescripcion();
			  
			  
		return descripcionA.compareTo(descripcionB);
	}*/
	
	
}


class ComparadorArticulos implements Comparator<Articulo>{

	
	public int compare(Articulo o1, Articulo o2) {
		// TODO Auto-generated method stub
		
		String desc1=o1.getDescripcion();
		String desc2=o2.getDescripcion();
		
		return desc1.compareTo(desc2);
	}
	
	
	
	
}



