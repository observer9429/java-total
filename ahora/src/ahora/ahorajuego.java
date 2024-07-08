/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ahora;

/**
 *
 * @author warez9429
 */
public class ahorajuego {
    
   // private static int numgan;
    private static int matriz;
   
    
    public ahorajuego(){
        
        matriz=8;
        
        
    }
    
    public int poker(){
        
        return 0;
    }
    
    
   private static void crearmatriz(int tamaño,int a,int b){
        
        
        
    }
    
    public static void ArrayAleatorio_sinrepetidos(int numeros[], int n,int b) {
  int valor, X=0,i=0;
  while(i < numeros.length){
  valor = (int) (Math.random() * (n - b)+b);
  X = verificar(numeros,valor,i);
  if(X==-1)
  {numeros[i]= valor; i=i+1; }
  }}
  
  //-------------------------------------------------------------------
     public static int verificar(int numeros[], int b, int lugar) {
  int i=0, salir = 0, encontro=-1;
  while (salir == 0) {
  if(numeros[i]==b)
  { encontro=1;
  salir=1;
  }
  i++;
  if(i>=lugar)
  {salir=1;}
  }
  return encontro; }
    
    
    
    
}
