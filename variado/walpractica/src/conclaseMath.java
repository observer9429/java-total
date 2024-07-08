
public class conclaseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double raiz=Math.sqrt(50);
		
		System.out.println(raiz);
		
		double sum1=8, sum2=7;
		
		double we=sum1/sum2;
		
		
		
		System.out.println(we);
		
		System.out.println(Math.round(we));
		
		
		double num=5.85;
		int resultado=(int)Math.round(num);
		System.out.println(resultado);
		
      String epa="che cuantas copas tenes";
	System.out.println(epa);
	// length cuenta cuantos caracteres tiene
	
	
	int cantidad= epa.length()*10;
	System.out.println(cantidad);
	
	System.out.println(epa.length());
	//charAt()  devuelve el valor de la posicion del numero puesto,empieza a contar desde cero
	System.out.println(epa.charAt(21));
	//jala cadena de caracteres, empieza enx y termina o se escoge el numero de caracteres con Y
	System.out.println(epa.substring(18, 23));
	
	

	
	
	
	}

}
