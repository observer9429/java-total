
public class bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]  matrix=new int[4][5];
		  
		  matrix [0][0]=15;
		  matrix [0][1]=20;
		  matrix [0][2]=23;
		  matrix [0][3]=32;
		  matrix [0][4]=15;
		  
		  matrix [1][0]=18;
		  matrix [1][1]=44;
		  matrix [1][2]=42;
		  matrix [1][3]=20;
		  matrix [1][4]=13;
		  
		  matrix [2][0]=14;
		  matrix [2][1]=18;
		  matrix [2][2]=21;
		  matrix [2][3]=23;
		  matrix [2][4]=55;
		  
		  matrix [3][0]=41;
		  matrix [3][1]=82;
		  matrix [3][2]=76;
		  matrix [3][3]=56;
		  matrix [3][4]=2;
		

	for(int i=0;i<4;i++) {
		
		System.out.println();
		
		for(int j=0;j<5;j++) {
			//System.out.println("el valor del array en la posición "+(i+1)+" "+(j+1)+ " es "+matrix[i][j]);
		
			System.out.print(matrix[i][j]+" ");
		}
		
		
	}
		  
	}

}
