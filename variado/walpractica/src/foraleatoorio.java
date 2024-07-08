import javax.swing.JOptionPane;

public class foraleatoorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int cantidad=Integer.parseInt(JOptionPane.showInputDialog("Digita el tamaño de la matriz"));
		int[]  numerosalea=new int [cantidad];
		
		for(int i=0;i<numerosalea.length;i++) {
			
			numerosalea[i]=(int)(Math.random()*100+1);
			
		}
		
		
		for(int j=0;j<numerosalea.length;j++) {
			System.out.println("el número "+(j+1)+" es "+numerosalea[j]);
			
		}
		

	}

}
