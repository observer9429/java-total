import java.util.Scanner;

public class conDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int aleatorio=(int)(Math.random()*100);
		
		
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		 int intentos=0;
		 
		 do {
			 
			System.out.println("\n");
	           intentos++;
			 System.out.println("introduce un numero por favor");
			 numero=entrada.nextInt();
			 
			 if(aleatorio<numero) {
				 
				 System.out.println("más bajo");
			 }
			 else if(aleatorio>numero){
				 
				 System.out.println("más alto");
			 }
			 
		//	 entrada.close();
			 
		 }while(numero!=aleatorio);
		
	System.out.println("correcto, lo has hecho en "+intentos+" intentos");
		
		
		

	}

}
