import java.util.Scanner;
public class elescaner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nose;
   Scanner entrada=new Scanner(System.in);
   
   System.out.println("por favor digita tu nombre pe");
   String nombre= entrada.nextLine();
   System.out.println("ahora por favor digita tu edad");
   int edad= entrada.nextInt();
   System.out.println("tu nombre es "+nombre+" alias el pro, "+"y tienes "+edad+" años");
	}

}
