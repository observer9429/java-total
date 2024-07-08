/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mejorvendedor;

/**
 *
 * @author warez9429
 */
public class pracmatriz {
    public static void main(String[]args){
    
    /*int []matri=new int[5];
    
    matri[0]=22;
    matri[1]=33;
    matri[2]=44;
    matri[3]=55;
    matri[4]=66;
    
    
    for(int i=0;i<=4;i++){
        
        System.out.println("el número puesto "+i+" es "+matri[i]);
        
    }
    */
    //int[] viendo=new int[5];
    
    //viendo[0]=4;
    
    int [] suma=new int[20];
    
    int[][] matrix=new int[4][5];
    
    matrix[0][0]=1;
    matrix[0][1]=2;
    matrix[0][2]=3;
    matrix[0][3]=4;
    matrix[0][4]=5;
    
    matrix[1][0]=6;
    matrix[1][1]=7;
    matrix[1][2]=8;
    matrix[1][3]=9;
    matrix[1][4]=10;
    
    matrix[2][0]=11;
    matrix[2][1]=12;
    matrix[2][2]=13;
    matrix[2][3]=14;
    matrix[2][4]=15;
    
    matrix[3][0]=16;
    matrix[3][1]=17;
    matrix[3][2]=18;
    matrix[3][3]=19;
    matrix[3][4]=20;
    
    for(int x=0;x<4;x++){
        
        
        for(int y=0;y<5;y++){
           int z=0;
           
           //para sumar los elmentos de la matriz
            suma[z]=suma[z]+matrix[x][y];
            System.out.println("la suma es "+ suma[z]);
          //System.out.println("El número de la posición ["+x+"] ["+y+"] es"+ matrix[x][y] );  
            
        }
        
        
    }
    
    
    }
}
