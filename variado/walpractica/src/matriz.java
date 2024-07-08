
public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  players=new int[5];
		
		players[0]=15;
		players[1]=33;
		players[2]=55;
		players[3]=77;
		players[4]=88;
		
		for(int i=0;i<players.length;i++) {
						
				System.out.println("valor del índice "+i+" es "+ players[i]);
		}
		
		
		String[] paises=new String[5];
		
		paises[0]="Perú";
		paises[1]="Chile";
		paises[2]="Argentina";
		paises[3]="Escocia";
		paises[4]="Republica Checa";
		
		
		
		for(String contpaises:paises) {
			
			System.out.println(contpaises);
		}
		
		

	}

}
