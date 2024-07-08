import java.util.*;
public class concondicional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner pasalo=new Scanner(System.in);
         System.out.println("introduce tu edad");
         
       int  edad= pasalo.nextInt();
       
       if(edad<18) {
    	   
    	   System.out.println("Aún sos un wambrillo");
       }
       else if(edad<35){
    	   System.out.println("sos adulto ");
       }
       else if(edad<55) {
    	   System.out.println("ya tas maduro e");
       }
       else {
    	   System.out.println("habla pe juventud")
    ;
       }
	}
}
